/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package expresionesregulares;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nerea
 */
public class ExpresionesRegulares {

    public static void main(String[] args) {
        
        
        // 1. Detectar N, S, E, O
        final String texto = "kjhasdh Localizacion: N";
        // Al poner los parentesis, nos permite poder guardar parte de la regex
        // en listas, ...
        final String regex = "(Localizacion: )([NSEO])";
        // Para añadirlo en una lista o buscarlo en un texto infiltrado
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(texto);
        
        // Si ponemos \n no lo detecta como siguiente línea
        // Hay que ponerlo separado
        List<String> lista = new ArrayList<>();
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            lista.add(matcher.group(2));
        }
        lista.forEach(System.out::println);
        // Cuando usamos la función matches busca exactamente la regex
        System.out.println(texto.matches(regex));
        
        
        // 2. Cumplir "ini 2 numeros fin" ini12fin
        String texto2 = "ini12fin";
        String regex2 = "ini[0-9]{2}fin";
        
        System.out.println(texto2.matches(regex2));
        
        // 3. Cumplir letraNumero tantas veces como se quiera a7b8b8
        String texto3 = "h6j2i7";
        String regex3 = "([a-zA-Z][0-9])+ $";
        System.out.println(texto3.matches(regex3));
    }
}
