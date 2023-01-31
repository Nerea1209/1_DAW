/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Algoritmo5 {
    
    public static void main(String[] args) {
        
        /*Cada grupo de clase de un centro educativo tiene 30 horas 
        de clase a la semana. Calcula el número de profesores que se 
        necesitan, teniendo en cuenta que un profesor imparte un número 
        de horas de clase a la semana, que se debe pedir al usuario, 
        junto con el número total de grupos que tiene el centro escolar.*/
        
        // CONSTANTES
        final int HORAS_SEMANA = 30;
        
        // VARIABLES
        int horasSemanaProfesor;
        int numeroTotalGrupos;
        int horasTotales;
        double numeroProfesores;
        
        
        // Pido las horas que imparte cada profesor
       String horasProfesor = JOptionPane.showInputDialog("¿Cuántas horas de "
               + "clase da cada profesor a la semana?");
       horasSemanaProfesor = Integer.parseInt(horasProfesor);
       
       // Pido los grupos que tiene el centro escolar
       String numeroGrupos = JOptionPane.showInputDialog("¿Cuántos grupos "
               + "tiene el centro escolar?");
       numeroTotalGrupos = Integer.parseInt(numeroGrupos);
       
       // Las horas totales seían el número de grupos por 30 h de clase
       // que tiene cada grupo
       horasTotales = numeroTotalGrupos * HORAS_SEMANA;
       
       // Si dividimos las horas totales entre las horas impartidad por
       // cada profesor, nos da los profesores necesarios que necesitamos
       numeroProfesores = (double)horasTotales / horasSemanaProfesor;
       
       // Mostramos el resultado por pantalla empleando la función Math.ceil()
       // que sirve para redondear al alza, ya que no puede haber un profesor
       // y medio, ni horas sin dar
       JOptionPane.showMessageDialog(null, "El centro escolar tiene " 
               + numeroTotalGrupos + " grupos. \n Cada grupo tiene " + HORAS_SEMANA 
               + " horas de clase a la semana. \n Cada profesor da " + 
               horasSemanaProfesor + " horas de clase a la semana. \n Por lo tanto,"
               + " se necesitan " + Math.ceil(numeroProfesores) + " profesores.");
      
    }
    
}
