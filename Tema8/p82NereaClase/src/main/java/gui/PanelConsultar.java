/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import application.Main;
import entities.Factura;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author nerea
 */
public class PanelConsultar extends javax.swing.JPanel {

    /**
     * Creates new form PanelConsultar
     */
    public PanelConsultar() {
        initComponents();
        createTable(); // Añadimos datos a la tabla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 249, 221));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 183, 1022, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Consultar  facturas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, 87));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kisspng-green-wave-ce-glass-industries-green-wave-stoned-5b505f741eeae3.6082327315319939721267 (1).png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1200, 600));
        jLabel2.setPreferredSize(new java.awt.Dimension(1206, 600));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1220, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void createTable(){
        // Guardamos las facturas en una lista
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
        
        // Añadimos los datos a la tabla y le damos los nombres a las columnas
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                facturas, new String [] {
                    "Código", "Fecha y hora de Emisión", "Descripción", "Importe total"
                }));
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
