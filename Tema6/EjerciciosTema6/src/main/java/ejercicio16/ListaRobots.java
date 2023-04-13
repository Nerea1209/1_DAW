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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nerea
 */
public class ListaRobots {

    public static void main(String[] args) {

        System.out.println("Escribimos fichero");
        List<Robot> robots = PruebaRobots.getListaRobots(30);
        List<String> textoRobots = pasarAListaString(robots);
        imprimirListaString(textoRobots);
        escribirListaString(textoRobots, "/home/nerea/NetBeansProjects/1_DAW/Tema7/listaRobots.txt");
        System.out.println("\nLeemos fichero");
        List<Robot> listaRobots = leerFichero("/home/nerea/NetBeansProjects/1_DAW/Tema7/listaRobots.txt", "^Robot:([0-9]+) - Vida:([0-9]+)$");
        imprimirListaRobot(listaRobots);
    }

    public static void escribirListaString(List<String> lista, String ruta) {

        try {
            Files.write(Paths.get(ruta), lista, StandardCharsets.UTF_8,
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

    public static List<Robot> leerFichero(String ruta, String regex) {
        List<Robot> robots = new ArrayList<>();
        List<String> lineasTextoRobots = new ArrayList<>();
        try {
            lineasTextoRobots = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        for (String linea : lineasTextoRobots) {
            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(linea);
            String id = "";
            String vida = "";
            while (matcher.find()) {

                for (int i = 1; i <= matcher.groupCount(); i++) {
                    switch (i) {
                        case 1 -> id = matcher.group(1);
                        default -> vida = matcher.group(2);
                    }

                }
            }
            robots.add(new Robot(Integer.parseInt(id), Integer.parseInt(vida)));
            
        }
        return robots;

    }

    public static void imprimirListaString(List<String> lista) {
        for (String s : lista) {
            System.out.println(s);
        }
    }
    
    public static void imprimirListaRobot(List<Robot> lista) {
        for (Robot r : lista) {
            System.out.println(r);
        }
    }

}
