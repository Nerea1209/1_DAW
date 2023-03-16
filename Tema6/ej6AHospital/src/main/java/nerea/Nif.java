/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package nerea;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 *
 * @author nerea
 */
public class Nif {
    
    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nif = ").append(numero + letra);
        sb.append(", fechaCaducidad=").append(fechaCaducidad);
        return sb.toString();
    }

    public long getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public Nif(long numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.letra = calcularLetra();
    }
    
    public Nif(long numero) {
        this.numero = numero;
        this.fechaCaducidad = generarFechaAleatoria();
        this.letra = calcularLetra();
    }
    
    private char calcularLetra(){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[(int)this.numero % 23];
    }
    
    public final void renovar(LocalDate fechaSolicitudRenovacion){
        this.fechaCaducidad =  fechaSolicitudRenovacion.plusYears(10);
    }
    
    private LocalDate generarFechaAleatoria(){
        LocalDate start = LocalDate.of(1970, Month.JANUARY, 1);
        long days = ChronoUnit.DAYS.between(start, LocalDate.now());
        return start.plusDays(new Random().nextInt((int) days + 1));
    }
    
    
}
