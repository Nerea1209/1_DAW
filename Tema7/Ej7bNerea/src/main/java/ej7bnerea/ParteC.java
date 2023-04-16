/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7bnerea;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nerea
 */
public class ParteC {

    public static void main(String[] args) {
        List<String> turismos = new ArrayList<>();
        List<String> deportivos = new ArrayList<>();
        List<String> furgonetas = new ArrayList<>();
        for (String linea : ParteB.lineas) {
            if (linea.startsWith("0")) {
                turismos.add(linea);
            } else if (linea.startsWith("1")) {
                deportivos.add(linea);
            } else if (linea.startsWith("2")) {
                furgonetas.add(linea);
            } else {
                throw new IllegalArgumentException();
            }
        }

        escribirListaString(turismos, "turismos.txt");
        escribirListaString(deportivos, "deportivos.txt");
        escribirListaString(furgonetas, "furgonetas.txt");
    }

    // Método para escribir una lista de String, sobreescribiendo si el fichero existe
    public static void escribirListaString(List<String> lista, String ruta) {
        try {
            Files.write(Paths.get(ruta), lista, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException ex) {
            System.out.println("Error creando el fichero");
        }
    }
    
    //    public static void separarVehiculos(List<Vehiculo> lista) {
//        for (Vehiculo v : lista) {
//            switch (v) {
//                case Turismo t -> turismos.add(t);
//                case Deportivo d -> deportivos.add(d);
//                case Furgoneta f -> furgonetas.add(f);
//                case default -> {
//                }
//            }
//        }
//        escribirListaString(parteA.pasarListaString(turismos), "turismos.txt");
//        escribirListaString(parteA.pasarListaString(deportivos), "deportivos.txt");
//        escribirListaString(parteA.pasarListaString(furgonetas), "furgonetas.txt");
//    }
//

}
