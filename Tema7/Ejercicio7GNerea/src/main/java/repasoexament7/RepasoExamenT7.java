/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package repasoexament7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class RepasoExamenT7 {

    public static void main(String[] args) throws IOException {

        String palabra;
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("Palabras.txt"))) {
            do {
                palabra = JOptionPane.showInputDialog("Introduce la palabra a escribir.\nPara salir escriba \"Terminar\"");
                flujo.write(palabra);
                flujo.newLine(); // Metodo newLine() añade salto de línea después de cada fila
                flujo.flush();
            } while (!palabra.equals("Terminar") && !palabra.equals("terminar"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
