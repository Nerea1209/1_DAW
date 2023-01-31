/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Nerea
 */
public class LanzarMonedaEj15 {
    
    private final boolean[] array = new boolean[1000];

    public LanzarMonedaEj15() {
    }

    
    
    public boolean[] getArray() {
        return array;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Arrays.hashCode(this.array);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LanzarMonedaEj15 other = (LanzarMonedaEj15) obj;
        return Arrays.equals(this.array, other.array);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LanzarMonedaEj15{");
        sb.append("array=").append(array);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public static void main(String[] args) {
        LanzarMonedaEj15 resultado = new LanzarMonedaEj15();
        resultado.rellenarArray();
        boolean [] arrayResultados = resultado.getArray();
        System.out.println(Arrays.toString(arrayResultados));
        System.out.println(numCaras(arrayResultados));
        System.out.println(numCruces(arrayResultados));
        resultado(arrayResultados);
    }
    
    public void rellenarArray(){
        for (int i = 0; i < this.array.length; i++) {
            Random aleatorio = new Random();
            this.array[i]=aleatorio.nextBoolean();
        }
    }
    
    public static int numCaras(boolean[] array){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]){
                contador++;
            }
        }
        return contador;
    }
    
    public static int numCruces(boolean[] array){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i]){
                contador++;
            }
        }
        return contador;
    }
    
    public static void resultado(boolean[] array){
        for (int i = 0; i < array.length; i++) {
            String resultado;
            if (array[i]){
                resultado = "Cara";
            } else {
                resultado = "Cruz";
            }
            System.out.println(i + ".- " + resultado + ", ");
        }
    }

    
    
}
