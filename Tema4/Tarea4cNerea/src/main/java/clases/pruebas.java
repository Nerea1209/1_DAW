/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.text.DecimalFormat;

/**
 *
 * @author nerea
 */
public class pruebas {

    /*Dentro de otra clase de prueba, con el método main(), crea un objeto 
    Persona con ServicioPersona y otro objeto Persona con el constructor 
    sin parámetros. Muestra los datos de ambas personas. Comprueba si son 
    mayores de edad y calcula su IMC, indicando además si tienen peso inferior 
    al normal, peso normal o peso superior al normal. Finalmente crea un objeto 
    tipo Serie y haz que una de las personas de un "me gusta" a la serie recién 
    creada. Muestra los datos de la serie para comprobar que el me gusta se 
    ha sumado.*/
    public static void main(String[] args) {

        Persona persona1 = ServicioPersona.leerTecladoPersona();
        Persona persona2 = new Persona();
        persona2.setNombre("Pedro");
        persona2.setEdad(10);
        persona2.setPeso(32.9);
        persona2.setSexo('H');
        persona2.setAltura(100);
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println("¿Son mayores de edad? \n"
                + "Persona 1: " + persona1.esMayorEdad() + "\n"
                + "Persona 2: " + persona2.esMayorEdad());
        
        double imcPersona1=Double.parseDouble(Float.toString(persona1.calcularIMC()));
        
        if (imcPersona1 < 1.85 ){
            System.out.println("Persona 1: Peso inferior al normal");
        }  else if (imcPersona1 >= 1.85 && imcPersona1 <=2.49f){
            System.out.println("Persona 1: Peso normal");
        }  else if (imcPersona1 >= 2.50f && imcPersona1 <=2.99f){
            System.out.println("Persona 1: Peso superior al normal");
        }  else {
            System.out.println("Persona 1: Obesidad");
        } 
        
        DecimalFormat formato = new DecimalFormat("#.00");
        double imcPersona2 =Double.parseDouble(formato.format(persona2.calcularIMC()));
       
        
        if(imcPersona2 < 1.85f){
            System.out.println("Persona 2: Peso inferior al normal");
        } else if (imcPersona2 >= 1.85f && imcPersona2 <=2.49f){
            System.out.println("Persona 2: Peso normal");
        } else if(imcPersona2 >= 2.50f && imcPersona2 <=2.99f){
            System.out.println("Persona 2: Peso superior al normal");
        } else {
            System.out.println("Persona 2: Obesidad");
        }

        Serie s1 = new Serie("the Walking Dead", "Acción", "...", "blas", 1000, 200);
        System.out.println(s1);
        persona2.darLikeSerie(s1);
        System.out.println(s1);
    }

}
