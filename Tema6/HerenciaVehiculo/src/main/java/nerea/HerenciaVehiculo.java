/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package nerea;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class HerenciaVehiculo {

    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("iohdsfohr", "2424", 
                "Ford", "Mondeo", "Burdeos", 121289743, false);
        
        Electrico ve1 = new Electrico(10, 240, 
                "34423", "123AAA", "Tesla", "Ni idea", 
                "Rojo", 1239, false);
        
        Combustion vc1 = new Combustion(60, 
                TipoCombustible.DIESEL, "21623AA", 
                "askdg", "Toyota", "Corolla", "Azul", 
                123, true);
        
        System.out.println(v1);
        System.out.println(ve1);
        System.out.println(vc1);
        
        v1.arrancar();
        ve1.arrancar();
        vc1.arrancar();
        
        List<Vehiculo> lista = new ArrayList<>();
        lista.add(v1);
        // Las siguientes líneas son conversiones implícitas
        lista.add(ve1);
        lista.add(vc1);
        
        for (Vehiculo vehiculo : lista) {
            System.out.println(vehiculo);
            vehiculo.arrancar();
            if (vehiculo instanceof Electrico){
                ((Electrico) vehiculo).cambiarBateria();
            }
        }
    }
}
