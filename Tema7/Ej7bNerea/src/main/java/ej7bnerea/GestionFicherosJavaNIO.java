/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7bnerea;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Nerea
 */
public class GestionFicherosJavaNIO {
    
    public static void crearDirectorio(String ruta) {
        Path directory = Paths.get(ruta);
        try {
            Files.createDirectory(directory);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }
    }
    
    public static void crearFichero (String ruta) {
        Path file = Paths.get(ruta);
        try {
            Files.createFile(file);
        } catch (IOException e) {
            System.out.println("Problema creando el archivo.");
            System.out.println(e.toString());
        }
    }
    
    public static void crearEnlace (String ruta, String ruta2) {
        Path enlace = Paths.get(ruta);
        Path link = Paths.get(ruta2);
        try {
            Files.createLink(link, enlace);
        } catch (IOException e) {
            System.out.println("Problema creando el enlace.");
            System.out.println(e.toString());
        }
    }
    
    public static void crearEnlaceSimbolico (String ruta, String ruta2) {
        Path enlace = Paths.get(ruta);
        Path link = Paths.get(ruta2);
        try {
            Files.createLink(link, enlace);
        } catch (IOException e) {
            System.out.println("Problema creando el enlace simbólico.");
            System.out.println(e.toString());
        }
    }
    
    public static boolean existeFichero (String ruta) {
        Path fichero = Paths.get(ruta);
        return Files.exists(fichero);
    }
    
    public static void borrarPath (String ruta) {
        Path element = Paths.get(ruta);
        try {
            Files.delete(element);
        } catch (IOException e) {
            System.out.println("Problema borrando el archivo.");
            System.out.println(e.toString());
        } // Si el fichero no existe: NoSuchFileException
    }
    
    public static void copiarArchivo (String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);
        try {
            Files.copy(origen, destino);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        } // Si el elemento ya existe: FileAlreadyExist
    }
    
    public static void copiarArchivoReemplazar (String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);
        try {
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        } // Si algura ruta no existe: NoSuchElementException
    }
    
    public static File[] arrayDirectorio (String ruta) {
        File f = new File (ruta);
        if (f.exists()) {
            return f.listFiles();
            // for (File fichero : ficheros) {
                // Lo que queramos hacer con cada fichero
            // }
        } else {
            System.out.println("El directorio a listar no existe");
            return new File[0];
        }
    }
    
}
