/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso; //kg
    private double altura; //m
    private String nif=null;

    public Persona() {
        nif = generaNIF();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, String nif) {
        this.nombre = nombre;
        this.edad = edad;
        if (!Persona.filtrarSexo(sexo)){
            sexo = 'O';
        }
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        nif = generaNIF();
        this.nif = nif;
    }

    
    
    private static boolean filtrarSexo(char sexo){
        return sexo=='H' || sexo=='M' || sexo=='O';
    }
    
    private String generaNIF(){
       String numString = RandomStringUtils.randomNumeric(8);
       int numAleatorio = Integer.parseInt(numString);
       char[] letraNIF={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
       char letra = letraNIF[numAleatorio%23];
       return numString + letra;
    }
    
    // boolean esMayorEdad(), indica si la edad de la persona es mayor o igual a 18 años
    public boolean esMayorEdad(){
        return edad>=18;
    }
    
    // float calcularIMC(). Este método devuelve el índice de masa corporal de la persona
    public float calcularIMC(){
        // (IMC = peso (kg)/ [estatura (m)]2.
        double divisor = (altura * 100) * (altura * 100);
        return (float)(peso/divisor);
    }
    
    // Getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getNif() {
        return nif;
    }
    
    // Setters, excepto para el NIF. El NIF no se puede cambiar una vez se ha creado la persona

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // toString(), según implementación por defecto que ofrece el IDE

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", nif=" + nif + '}';
    }
    
    // darLikeSerie(Serie serie), que da un "me gusta" a la serie que se pasa como parámetro 
    public void darLikeSerie(Serie serie){
        serie.darLike();
    }
    
    
    

}
