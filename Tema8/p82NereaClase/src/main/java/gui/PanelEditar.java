/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import application.Main;
import controllers.exceptions.NonexistentEntityException;
import entities.Factura;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nerea
 */
public class PanelEditar extends javax.swing.JPanel {

    /**
     * Creates new form PanelEditar
     */
    
    private List<Factura> listaFacturas;

    public PanelEditar() {
        initComponents();
        listaFacturas = createTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 249, 221));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Editar / eliminar facturas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 87));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kisspng-green-wave-ce-glass-industries-green-wave-stoned-5b505f741eeae3.6082327315319939721267 (1).png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1200, 600));
        jLabel2.setPreferredSize(new java.awt.Dimension(1206, 600));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1220, 320));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 800, 420));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-papelera-48.png"))); // NOI18N
        jLabel3.setText("Eliminar factura");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-actualizar-64.png"))); // NOI18N
        jLabel4.setText("Editar factura");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Botón "Editar factura"
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // Abrimos un panel con los datos a editar
        new PanelEditar1(listaFacturas.get(jTable1.getSelectedRow()));
    }//GEN-LAST:event_jLabel4MouseClicked

    // Botón "Eliminar factura"
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            // Ejecutamos destroy con el codigo de la factura seleccionada
            Main.facturaJPA.destroy(listaFacturas.get(jTable1.getSelectedRow()).getCodigo());
            // Abrimos un panel de que se ha eliminado correctamente
            PanelPrincipal.crearVentana("Factura eliminada con éxito.", new PanelEliminarOK());
            // Actualizamos los datos de la tabla para que salga eliminada
            actualizarTabla();
        } catch (NonexistentEntityException ex) {
            // Si no se puede eliminar, abre un panel de error
            PanelPrincipal.crearVentana("¡ERROR!", new PanelEliminarNO());
            
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    // Método para crear la tabla para que sus campos no sean editables
    // pero sí se pueda seleccionar
    // En panel consultar lo tengo disabled para que no se pueda hacer ninguna de las dos
    private List<Factura> createTable() {
        // Guardo en una lista las facturas de la bd
        List<Factura> listaFacturas = Main.facturaJPA.findFacturaEntities();
        int cols = 4; // La tabla tiene 4 columnas
        
        // Los datos de la tabla son:
        String[][] facturas = new String[listaFacturas.size()][cols];
        for (int i = 0; i < listaFacturas.size(); i++) {
            // Código
            facturas[i][0] = String.valueOf(listaFacturas.get(i).getCodigo());
            // Fecha de emisión
            facturas[i][1] = new SimpleDateFormat("dd/MM/yyyy").format(listaFacturas.get(i).getFechaEmision());
            // Descripción
            facturas[i][2] = listaFacturas.get(i).getDescripcion();
            // Importe total
            facturas[i][3] = String.valueOf(listaFacturas.get(i).getTotalImporte());
        }

        // Le pasamos los datos y los nombres de las columnas
        DefaultTableModel modelo = new DefaultTableModel(facturas, new String[]{
                    "Código", "Fecha y hora de Emisión", "Descripción", "Importe total"}) {
            @Override
            // Sobreescribimos el método para que no se puedan editar las celdas
            public boolean isCellEditable(int row, int column) {
                return false; // hacer que todas las celdas no sean editables
            }
        };

        jTable1.setModel(modelo); // Añadimos el modelo a la tabla
        return listaFacturas;
    }
    
    public void actualizarTabla () {
        listaFacturas = createTable(); // Actualizamos la tabla
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
