/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class Combustion extends Vehiculo {
    
    private int capacidadLitros;
    private TipoCombustible tipoCombustible;

    public Combustion(int capacidadLitros, TipoCombustible tipoCombustible, String matricula, String bastidor, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(matricula, bastidor, marca, modelo, color, tarifa, disponible);
        this.capacidadLitros = capacidadLitros;
        this.tipoCombustible = tipoCombustible;
    }
    
    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Combustion{");
        sb.append("capacidadLitros=").append(capacidadLitros);
        sb.append(", tipoCombustible=").append(tipoCombustible);
        sb.append('}');
        return sb.toString();
    }
    
    public void repostar(){
        System.out.println("El vehículo " + this.getMatricula() + " está repostando");
    }
    
}
