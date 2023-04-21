/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ej7dnerea;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nerea
 */
public class Ej7DNerea {

    public static void main(String[] args) {

        List<String> vehiculosString = new ArrayList<>();
        List<String> turismosTxt = leerArchivo("turismos.txt");
        List<String> deportivosTxt = leerArchivo("deportivos.txt");
        List<String> furgonetasTxt = leerArchivo("furgonetas.txt");

        
       

        List<Vehiculo> vehiculos = 

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

    public static List<Vehiculo> obtenerVehiculos(String[] lineas, String regex) {
        var vehiculos = new ArrayList<Vehiculo>();
        for (String linea : lineas) {
            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
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
                            Long.valueOf(bastidor), matricula, obtenerMarca(marca),
                            obtenerModelo(modelo), obtenerColor(color),
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                } else if (linea.startsWith("1")) {
                    String cc = partes[7];
                    vehiculos.add(new Deportivo(Integer.parseInt(cc),
                            Long.valueOf(bastidor), matricula, obtenerMarca(marca),
                            obtenerModelo(modelo), obtenerColor(color),
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                } else if (linea.startsWith("2")) {
                    String carga = partes[7];
                    String volumen = partes[8];
                    vehiculos.add(new Furgoneta(Integer.parseInt(carga), Integer.parseInt(volumen),
                            Long.valueOf(bastidor), matricula, obtenerMarca(marca),
                            obtenerModelo(modelo), obtenerColor(color),
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                }

            }
            for (String turismo : turismosTxt) {
                vehiculos.add(new Vehiculo(Long.MAX_VALUE, turismo, Marca.FORD, Modelo.MONDEO, Color.ROJO, 0, true) {
                })
            }
            return vehiculos;
        }
    }
