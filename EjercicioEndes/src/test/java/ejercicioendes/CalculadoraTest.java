/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ejercicioendes;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nerea
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSumar() {
        System.out.println("sumar");
        double a = 4.98;
        double b = 3.56;
        String resultadoEsperado = "8,54";
        String resultado = Calculadora.sumar(a, b);
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testRestar() {
        System.out.println("restar");
        double a = 10.98;
        double b = 9.3;
        String resultadoEsperado = "1,69";
        String resultado = Calculadora.restar(a, b);
        assertEquals(resultadoEsperado, resultado);
        
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testDividir() {
        System.out.println("dividir");
        double a = 2.0;
        double b = 2.0;
        String resultadoEsperado = "1,00";
        String resultado = Calculadora.dividir(a, b);
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double a = 4.0;
        double b = 5.0;
        String resultadoEsperado = "278,00";
        String resultado = Calculadora.multiplicar(a, b);
        assertEquals(resultadoEsperado, resultado);
    }
    
}
