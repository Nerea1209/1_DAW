/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ej7ANerea;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nerea
 */
public class Ej7ANerea {

    public static void main(String[] args) {
        List<String> contenido = ServiciosFicheros.leerFichero("localizaciones.txt");
        List<String> localizaciones = obtenerLocalizaciones(contenido);
        imprimirListaString(localizaciones);
        Map<String,Integer> repeticionLocalizaciones = repeticionesLocalizaciones(localizaciones);
        imprimirMap(repeticionLocalizaciones);
        ServiciosFicheros.escribirMap(repeticionLocalizaciones, "contadorLocalizaciones.txt");
    }

    public static void imprimirListaString(List<String> lista) {
        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static List<String> obtenerLocalizaciones(List<String> lista) {
        List<String> localizaciones = new ArrayList<>();
        final String regex = "(Localizacion: )([NSEO])";
        // Para añadirlo en una lista o buscarlo en un texto infiltrado
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        for (String linea : lista) {
            final Matcher matcher = pattern.matcher(linea);
            while (matcher.find()) {
                localizaciones.add(matcher.group(2));
            }
        }
        return localizaciones;
    }
    
    public static Map<String, Integer> repeticionesLocalizaciones(List<String> lista) {
        int n = 0;
        int s = 0;
        int e = 0;
        int o = 0;
        Map<String, Integer> repetidas= new TreeMap<>();
        
        for (int i = 0; i < lista.size(); i++) {
            switch (lista.get(i)) {
                case "N" -> n++;
                case "S" -> s++;
                case "E" -> e++;
                default -> o++;
            }
        }
        
        repetidas.put("N", n);
        repetidas.put("S", s);
        repetidas.put("E", e);
        repetidas.put("O", o);
        
        return repetidas;
    }
    
    public static void imprimirMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + ":" + val);
        }
    }
}
