/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class ListaRobots {

    public static void main(String[] args) {
        System.out.println("Escribimos fichero");
        List<Robot> robots = PruebaRobots.getListaRobots(30);
        List<String> textoRobots = pasarAListaString(robots);
        for (String robot : textoRobots) {
            System.out.println(robot);
        }
        escribirListaString(textoRobots);
        System.out.println("\nLeemos fichero");

        List<String> lineasTextoRobots = new ArrayList<>();
        try {
            lineasTextoRobots = Files.readAllLines(Paths.get("/home/nerea/NetBeansProjects/1_DAW/Tema7/listaRobots.txt"),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        for (String linea : lineasTextoRobots) {
            System.out.println(linea);
        }

    }

    public static void escribirListaString(List<String> lista) {

        try {
            Files.write(Paths.get("/home/nerea/NetBeansProjects/1_DAW/Tema7/listaRobots.txt"), lista, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException ex) {
            System.out.println("Error creando el fichero");
        }
    }

    public static List<String> pasarAListaString(List<Robot> robots) {
        List<String> lista = new ArrayList<>();
        for (Robot robot : robots) {
            lista.add(robot.toString());
        }
        return lista;
    }

}
