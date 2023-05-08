/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.nerea.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class FacturaDAO implements IFactura {
    
    private Connection con = null;

    public FacturaDAO() {
        con = Conexion.getInstance();
    }
    
    @Override
    public List<FacturaVO> getAll() throws SQLException {
        List<FacturaVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from factura");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                FacturaVO f = new FacturaVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                f.setCodigo(res.getString("codigo"));
                f.setFechaEmision(res.getDate("fechaEmision").toLocalDate());
                f.setDescripcion(res.getString("descripcion"));
                f.setTotalImporte(res.getDouble("totalImporte"));

                //Añadimos el objeto a la lista
                lista.add(f);
            }
        }

        return lista;
    }

    @Override
    public FacturaVO findByPk(String codigo) throws SQLException {
        ResultSet res = null;
        FacturaVO factura = new FacturaVO();

        String sql = "select * from factura where codigo=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setString(1, codigo);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe ese codigo
            if (res.next()) {
                // Recogemos los datos de la factura, guardamos en un objeto
                factura.setCodigo(res.getString("codigo"));
                factura.setFechaEmision(res.getDate("fechaEmision").toLocalDate());
                factura.setDescripcion(res.getString("descripcion"));
                factura.setTotalImporte(res.getDouble("totalImporte"));
                return factura;
            }

            return null;
        }
    }

    @Override
    public int insertFactura(FacturaVO factura) throws SQLException {
        int numFilas = 0;
        String sql = "insert into factura values (?,?,?,?)";

        if (findByPk(factura.getCodigo()) != null) {
            // Existe un registro con ese codigo
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, factura.getCodigo());
                prest.setDate(2, Date.valueOf(factura.getFechaEmision()));
                prest.setString(3, factura.getDescripcion());
                prest.setDouble(4, factura.getTotalImporte());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    @Override
    public int insertFactura(List<FacturaVO> lista) throws SQLException {
        int numFilas = 0;

        for (FacturaVO tmp : lista) {
            numFilas += insertFactura(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteFactura(FacturaVO f) throws SQLException {
        int numFilas = 0;

        String sql = "delete from factura where codigo = ?";

        // Sentencia parametrizada
        try (PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setString(1, f.getCodigo());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int deleteFactura() throws SQLException {
        String sql = "delete from factura";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;
    }

    @Override
    public int updateFactura(String codigo, FacturaVO nuevosDatos) throws SQLException {
        int numFilas = 0;
        String sql = "update factura set fechaEmision = ?, descripcion = ?, totalImporte = ? where codigo=?";

        if (findByPk(codigo) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setDate(1, Date.valueOf(nuevosDatos.getFechaEmision()));
                prest.setString(2, nuevosDatos.getDescripcion());
                prest.setDouble(3, nuevosDatos.getTotalImporte());
                prest.setString(4, codigo);

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }
    
}
