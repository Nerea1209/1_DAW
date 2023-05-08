/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daw.nerea.modelo;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author nerea
 */
public interface IFactura {
    
    // Método para obtener todos los registros de la tabla
    List<FacturaVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    FacturaVO findByPk(String codigo) throws SQLException;
    
    // Método para insertar un registro
    int insertFactura (FacturaVO factura) throws SQLException;
    
    // Método para insertar varios registros
    int insertFactura (List<FacturaVO> lista) throws SQLException;
    
    // Método para borrar un registro
    int deleteFactura (FacturaVO f) throws SQLException;
    
    // Método para borrar toda la tabla
    int deleteFactura() throws SQLException;
    
    // Método para modificar un registro. Se modifica el registro que tenga ese codigo
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updateFactura (String codigo, FacturaVO nuevosDatos) throws SQLException;
    
}
