/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteB;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class ejercicioB {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Introduce una frase");
        System.out.println("Frase: " + frase);
        System.out.println("Tamaño: " + frase.length());
        System.out.println("Primera posición de char='u' -> " + indiceChar(frase, 'u'));
        System.out.println("Posiciones de char='u' -> " + imprimirArray(indicesChar(frase, 'u')));
        unicodes(frase);

    }

    public static int indiceChar(String frase, char letra) {
        return frase.indexOf(letra);
    }

    public static int[] indicesChar(String frase, char letra) {
        int[] indices = new int[frase.length()];
        int j = 0;
        for (int i = 0; i < indices.length; i++) {
            if (frase.charAt(i) == letra) {
                indices[j] = i;
                j++;
            }
        }
        return indices;
    }
    
    public static String imprimirArray(int[] arrayInt){
        String texto = "";
        for (int i = 0; i < arrayInt.length; i++) {
            if (i != 0 && arrayInt[i] != 0 || i == 0) {
                texto += arrayInt[i] + " ";
            }
        }
        return texto;
    }

    public static void unicodes(String frase) {
        List<Integer> unicodes = new ArrayList<>();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                int unicode = frase.charAt(i);
                unicodes.add(unicode);
                System.out.print(unicode);
                if (unicode >= 65 && unicode <= 90 || unicode == 165) {
                    System.out.println("\tMayúscula");
                } else {
                    System.out.println("\tMinúscula");
                }
            }

        }
        System.out.println("Tamaño: " + unicodes.size());
    }

}
