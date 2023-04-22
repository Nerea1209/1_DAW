/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ej7dnerea;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nerea
 */
public class Ej7DNerea {

    public static void main(String[] args) {

        // Leemos los 3 ficheros
        List<String> turismosTxt = leerArchivo("turismos.txt");
        List<String> deportivosTxt = leerArchivo("deportivos.txt");
        List<String> furgonetasTxt = leerArchivo("furgonetas.txt");
        
        // Creamos vehiculos a partir de ellos y los añadimos a una lista
        List<Vehiculo> vehiculos = new ArrayList<>();
        añadirVehiculos(vehiculos, turismosTxt);
        añadirVehiculos(vehiculos, deportivosTxt);
        añadirVehiculos(vehiculos, furgonetasTxt);

        // Crea directorio copias
        GestionFicherosJavaNIO.crearDirectorio("./copias");
        
        // Copiar los 3 ficheros con .csv a copias
        GestionFicherosJavaNIO.copiarArchivoReemplazar("turismos.txt", "./copias/turismos.csv");
        GestionFicherosJavaNIO.copiarArchivoReemplazar("deportivos.txt", "./copias/deportivos.csv");
        GestionFicherosJavaNIO.copiarArchivoReemplazar("furgonetas.txt", "./copias/furgonetas.csv");
        
        // Mostrar ficheros de copias
        System.out.println("Fichero: turismos.csv");
        GestionFicherosJavaNIO.imprimirFichero("./copias/turismos.csv");
        System.out.println("Fichero: deportivos.csv");
        GestionFicherosJavaNIO.imprimirFichero("./copias/deportivos.csv");
        System.out.println("Fichero: furgonetas.csv");
        GestionFicherosJavaNIO.imprimirFichero("./copias/furgonetas.csv");
        
        // Leemos las 3 copias
        List<String> turismosCsv = leerArchivo("./copias/turismos.csv");
        List<String> deportivosCsv = leerArchivo("./copias/deportivos.csv");
        List<String> furgonetasCsv = leerArchivo("./copias/furgonetas.csv");
        
        // Creamos vehiculos a partir de ellas y las añadimos a una lista
        List<Vehiculo> vehiculosCopias = new ArrayList<>();
        añadirVehiculos(vehiculosCopias, turismosCsv);
        añadirVehiculos(vehiculosCopias, deportivosCsv);
        añadirVehiculos(vehiculosCopias, furgonetasCsv);
        
        // Imprimir lista
        System.out.println("Lista de vehículos de copias");
        vehiculosCopias.forEach(System.out::println);
        
        // Ordenar lista por bastidor
        Collections.sort(vehiculosCopias, 
                (o1, o2) -> o1.getBastidor().compareTo(o2.getBastidor()));
        
        // Imprimir lista ordenada por bastidor
        System.out.println("Lista de vehículos de copias ordenada por bastidor");
        vehiculosCopias.forEach(System.out::println);
        
        // Borrar los archivos *.csv originales
        GestionFicherosJavaNIO.borrarPath("./copias/turismos.csv");
        GestionFicherosJavaNIO.borrarPath("./copias/deportivos.csv");
        GestionFicherosJavaNIO.borrarPath("./copias/furgonetas.csv");
        
        // Mostrar contenido de copias
        GestionFicherosJavaNIO.imprimirDirectorio("./copias");
        
        // STREAM
        
        // Imprimir matriculas ordenadas alfabéticamente de los coches grises distintos
        System.out.println("Matrículas de coches grises ordenadas alfabéticamente");
        vehiculos
                .stream()
                .filter(v -> v.getColor().equals(Color.GRIS))
                .distinct()
                .sorted((v1, v2) -> v1.getMatricula().compareToIgnoreCase(v2.getMatricula()))
                .map(v -> v.getMatricula())
                .forEach(System.out::println);
        
        // Imprimir marcas distintas de coches disponibles
        System.out.println("Marcas distintas de coches disponibles");
        vehiculos
                .stream()
                .filter(v -> v.isDisponible())
                .map(v -> v.getMarca())
                .distinct()
                .forEach(System.out::println);
        
        // Cantidad de vehículos Citroën
        System.out.println("¿Cuántos coches Citroën hay?");
        System.out.println(vehiculos
                .stream()
                .filter(v -> v.getMarca().equals(Marca.CITROËN))
                .count());
                
        // Peugeout negro disponible en la lista
        System.out.println("¿Hay algún peugeout negro disponible?");
        long cant = vehiculos
                .stream()
                .filter(v -> v.getMarca().equals(Marca.PEUGEOT))
                .filter(v -> v.getColor().equals(Color.NEGRO))
                .filter(v -> v.isDisponible())
                .count();
        
        if (cant > 0) {
            System.out.println("Sí, hay " + cant);
        } else {
            System.out.println("No, lo siento");
        }
        
        // Lista de tarifas distintas
        List<Double> tarifasDistintas = vehiculos
                .stream()
                .map(v -> v.getTarifa())
                .distinct()
                .toList();
        
        // Imprimir tarifas
        System.out.println("Lista de tarifas distintas");
        tarifasDistintas.forEach(System.out::println);
    }

    public static List<String> leerArchivo(String ruta) {
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        return lineas;
    }
    
    public static void añadirVehiculos (List<Vehiculo> vehiculos, List<String> lineas) {
        for (String linea : lineas) {
            final Pattern pattern = Pattern.compile("[0-2] - ([^:\\\\s]+(:[^:\\s]+)+)", Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(linea);
            while (matcher.find()) {
                String partes[] = matcher.group(1).split(":");
                String bastidor = partes[0];
                String matricula = partes[1];
                String marca = partes[2];
                String modelo = partes[3];
                String color = partes[4];
                String tarifa = partes[5];
                String disponible = partes[6];
                
                if (linea.startsWith("0")) {
                    String numPuerta = partes[7];
                    vehiculos.add(new Turismo(Integer.parseInt(numPuerta),
                            Long.valueOf(bastidor), matricula, Marca.obtenerMarca(marca),
                            Modelo.obtenerModelo(modelo), Color.obtenerColor(color),
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                } else if (linea.startsWith("1")) {
                    String cc = partes[7];
                    vehiculos.add(new Deportivo(Integer.parseInt(cc),
                            Long.valueOf(bastidor), matricula, Marca.obtenerMarca(marca),
                            Modelo.obtenerModelo(modelo), Color.obtenerColor(color),
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                } else if (linea.startsWith("2")) {
                    String carga = partes[7];
                    String volumen = partes[8];
                    vehiculos.add(new Furgoneta(Integer.parseInt(carga), Integer.parseInt(volumen),
                            Long.valueOf(bastidor), matricula, Marca.obtenerMarca(marca),
                            Modelo.obtenerModelo(modelo), Color.obtenerColor(color),
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                }
            }
        }
    }

}
