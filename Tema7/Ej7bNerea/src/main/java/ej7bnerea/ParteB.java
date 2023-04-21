/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7bnerea;

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
 * @author eduar
 */
public class ParteB {

    public static List<String> lineas = leerFichero("vehículos.txt");
    
    public static void main(String[] args) {
        List<Vehiculo> vehiculosLeidos = obtenerListaVehiculos(lineas, "[0-2] - ([^:\\\\s]+(:[^:\\s]+)+)");
        System.out.println("Lista de vehículos leídos sin ordenar");
        vehiculosLeidos.forEach(System.out::println);
        System.out.println("\nLista de vehículos ordenados por marca");
        Collections.sort(vehiculosLeidos, (o1, o2) -> o1.getMarca().compareTo(o2.getMarca()));
        vehiculosLeidos.forEach(System.out::println);
        long cont = vehiculosLeidos.stream()
                .filter(v -> v.getColor().equals(Color.ROJO))
                .count();
        System.out.println("Hay " + cont + " coches rojos");
        System.out.println("Marcas diferentes de todos los vehículos de la lista");
        vehiculosLeidos.stream()
                .map(v -> v.getMarca())
                .distinct()
                .forEach(System.out::println);
    }

    public static List<String> leerFichero(String ruta) {
        List<String> lista = new ArrayList<>();
        try {
            lista = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        return lista;
    }
    
    public static List<Vehiculo> obtenerListaVehiculos(List<String> lineas, String regex){
        List<Vehiculo> vehiculos = new ArrayList<>();
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
                if (linea.startsWith("0"))  {
                    String numPuerta = partes[7];
                    vehiculos.add(new Turismo(Integer.parseInt(numPuerta), 
                            Long.valueOf(bastidor), matricula, obtenerMarca(marca), 
                            obtenerModelo(modelo), obtenerColor(color), 
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                } else if (linea.startsWith("1"))  {
                    String cc = partes[7];
                    vehiculos.add(new Deportivo(Integer.parseInt(cc), 
                            Long.valueOf(bastidor), matricula, obtenerMarca(marca), 
                            obtenerModelo(modelo), obtenerColor(color), 
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                } else if (linea.startsWith("2"))  {
                    String carga = partes[7];
                    String volumen = partes[8];
                    vehiculos.add(new Furgoneta(Integer.parseInt(carga), Integer.parseInt(volumen), 
                            Long.valueOf(bastidor), matricula, obtenerMarca(marca), 
                            obtenerModelo(modelo), obtenerColor(color), 
                            Double.parseDouble(tarifa), Boolean.parseBoolean(disponible)));
                }

            }
        }
        return vehiculos;
    }
    
    public static Marca obtenerMarca(String marca){
        return switch (marca) {
            case "SEAT" -> Marca.SEAT;
            case "CITROËN" -> Marca.CITROËN;
            case "FORD" -> Marca.FORD;
            case "MERCEDES" -> Marca.MERCEDES;
            case "OPEL" -> Marca.OPEL;
            case "PEUGEOT" ->  Marca.PEUGEOT;
            case "RENAULT" -> Marca.RENAULT;
            case "VOLKSWAGEN" -> Marca.VOLKSWAGEN;
            default -> { throw new IllegalArgumentException();
            }
        };
    }
    
    public static Modelo obtenerModelo(String modelo){
        return switch (modelo) {
            case "MÉGANE" -> Modelo.MÉGANE;
            case "CLIO" -> Modelo.CLIO;
            case "TWINGO" -> Modelo.TWINGO;
            case "ARKANA" -> Modelo.ARKANA;
            case "C3" -> Modelo.C3;
            case "C4" ->  Modelo.C4;
            case "DS4" -> Modelo.DS4;
            case "IBIZA" -> Modelo.IBIZA;
            case "ATECA" -> Modelo.ATECA;
            case "LEÓN" -> Modelo.LEÓN;
            case "E208" -> Modelo.E208;
            case "ERIFTER" -> Modelo.ERIFTER;
            case "HIBRID508" -> Modelo.HIBRID508;
            case "MONDEO" -> Modelo.MONDEO;
            case "FOCUS" -> Modelo.FOCUS;
            case "MUNSTANG" -> Modelo.MUNSTANG;
            case "ASTRA" -> Modelo.ASTRA;
            case "CORSA" -> Modelo.CORSA;
            case "GOLF" -> Modelo.GOLF;
            case "POLO" -> Modelo.POLO;
            case "PASSAT" -> Modelo.PASSAT;
            case "GLA" -> Modelo.GLA;
            case "CLASE_C" -> Modelo.CLASE_C;
            case "EQE" -> Modelo.EQE;
            default -> { throw new IllegalArgumentException();
            }
        };
    }
    
    public static Color obtenerColor(String color){
        return switch (color) {
            case "AZUL" -> Color.AZUL;
            case "VIOLETA" -> Color.VIOLETA;
            case "AMARILLO" -> Color.AMARILLO;
            case "NARANJA" -> Color.NARANJA;
            case "ROJO" -> Color.ROJO;
            case "VERDE" -> Color.VERDE;
            case "BLANCO" -> Color.BLANCO;
            case "NEGRO" -> Color.NEGRO;
            default -> { throw new IllegalArgumentException();
            }
        };
    }

}
