/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Nerea
 */
public class Prueba {

    public static void main(String[] args) {

        Persona p1 = new Persona("Nuria", "1234", 32);
        Persona p2 = new Persona("Fran", "5678", 56);
        Persona e1 = new Empleado(1800, "Pedro", "0987", 19);
        Empleado e2 = new Empleado(2300, "Vanesa", "1286", 61);
        Persona pro1 = new Programador(Categoria.ANALISTA, 2800,
                "Edu", "4477", 21);
        Programador pro2 = new Programador(Categoria.JUNIOR, 2650,
                "MAria", "3421", 34);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(pro1.toString());
        System.out.println(pro2.toString());
        
        // e1.aumentarSalario(2458);
        pro2.aumentarSalario(2134);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(pro1.toString());
        System.out.println(pro2.toString());
       
    
        
    }
}
