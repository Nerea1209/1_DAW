/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ej7enerea;

import static ej7enerea.Usuario.leerFichero;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author nerea
 */
public class PanelUsuario extends javax.swing.JPanel {

    public static File[] archivos = GestionFicherosJavaNIO.arrayDirectorio("./facturascsv");
    public static int opcion;
    public static List<String> nombreFiles = new ArrayList<>();
    /**
     * Creates new form PanelUsuario
     */
    public PanelUsuario() {
        initComponents();
        
        for (File archivo : archivos) {
            nombreFiles.add(archivo.getName());
        }
        ComboBoxModel<String> files = new DefaultComboBoxModel<>
        (nombreFiles.toArray(new String[0]) /*array de string*/); 
        
        jComboBox1.setModel(files);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jComboBox1.setMaximumRowCount(4);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("¿Qué factura desea leer?");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // La opción es la factura seleccionada
        opcion = jComboBox1.getSelectedIndex();
        
        // Leo el fichero
        List<String> lineas = leerFichero("./facturascsv/" + jComboBox1.getSelectedItem());
        
        // Separo por :
        String[] datosFactura = lineas.get(0).split(";");
        // Creo una factura con esos datos
        Factura factura = new Factura(datosFactura[0], LocalDate.parse(datosFactura[1]), datosFactura[2], Double.parseDouble(datosFactura[3]));
        
        // La añadimos al menú desplegable
        jComboBox1.addItem(factura.getCodigo());
        nombreFiles.add(factura.getCodigo());
        
        // La imprimo
        System.out.println(factura.toString());
        
        // Boramos el archivo
        GestionFicherosJavaNIO.borrarPath("./facturascsv/" + jComboBox1.getSelectedItem());
        
        // Lo borramos del menú desplegable
        jComboBox1.removeItemAt(opcion);
        nombreFiles.remove(opcion);
        
        // Imprimimos el contenido del directorio
        System.out.println("El directorio facturascsv tiene las siguientes facturas:");
        // Actualizamos la variable archivos con la factura nueva y la borrada
        archivos = GestionFicherosJavaNIO.arrayDirectorio("./facturascsv");
        for (File file : archivos) {
            System.out.println(file.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
