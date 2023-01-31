/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package nerea;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
public class Elevador {

    // Atributos encapsulados de la clase Elevador
    private final String numSerie;
    private final String fabricante;
    private final int capacidadMaxPersonas;
    private final double pesoMaximoSoportado;
    private final LocalDate fechaFabricacion;
    private LocalDate fechaUltimaRevision;
    private int planta;
    private String estado;
    
    // Constructor parametrizado

    public Elevador(String fabricante, int capacidadMaxPersonas, 
            double pesoMaximoSoportado) {
        this.numSerie = generaNumeroSerie();
        this.fabricante = fabricante;
        this.capacidadMaxPersonas = capacidadMaxPersonasValido(capacidadMaxPersonas);
        this.pesoMaximoSoportado = pesoMaxSoportadoValido(pesoMaximoSoportado);
        this.fechaFabricacion = LocalDate.now(); // Fecha actual del sistema
        this.fechaUltimaRevision = LocalDate.now();
        this.planta = 0; // Planta baja
        this.estado = null;
    }
    
    // Getters y Setters necesarios

    public LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    public int getCapacidadMaxPersonas() {
        return capacidadMaxPersonas;
    }

    public double getPesoMaximoSoportado() {
        return pesoMaximoSoportado;
    }

    public int getPlanta() {
        return planta;
    }
    
    public void setFechaUltimaRevision(LocalDate fechaUltimaRevision) {
        this.fechaUltimaRevision = fechaUltimaRevision;
    }
    
    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    // MÉTODOS
    // toString()
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Elevador{");
        sb.append("numSerie = ").append(this.numSerie);
        sb.append(", fabricante = ").append(this.fabricante);
        sb.append(", capacidadMaxPersonas = ").append(this.capacidadMaxPersonas);
        sb.append(", pesoMaximoSoportado = ").append(this.pesoMaximoSoportado);
        sb.append(", fechaFabricacion = ").append(this.fechaFabricacion);
        sb.append(", fechaUltimaRevision = ").append(this.fechaUltimaRevision);
        sb.append(", planta = ").append(this.planta);
        sb.append(", estado = ").append(this.estado);
        sb.append('}');
        return sb.toString();
    }

    // Genera un número aleatorio de 8 dígitos
    private String generaNumeroSerie() {
        return RandomStringUtils.randomNumeric(8);
    }
    
    // Filtra entre 0 personas y 10 personas
    private int capacidadMaxPersonasValido(int capacidadMaxPersonas){
        if (capacidadMaxPersonas < 0 && capacidadMaxPersonas > 10){
            capacidadMaxPersonas = 0;
        }
        return capacidadMaxPersonas;
    }
    
    // Filtra entre 0 kg y 800 kg
    private double pesoMaxSoportadoValido(double pesoMaximoSoportado){
        if (pesoMaximoSoportado < 0 && pesoMaximoSoportado > 800){
            pesoMaximoSoportado = 0;
        }
        return pesoMaximoSoportado;
    }
    // Comprobamos si el numero de viajeros, el peso total y la planta deseada son válidos
    public static boolean mover(Elevador elevador, int numeroViajeros, double pesoTotal, int plantaDeseada){
        return !(elevador.getPlanta()==plantaDeseada || plantaDeseada < 0 && plantaDeseada > 8 ||
                numeroViajeros < 0 && numeroViajeros > elevador.getCapacidadMaxPersonas() ||
                pesoTotal < 0 && pesoTotal > elevador.getPesoMaximoSoportado());
    }
}
