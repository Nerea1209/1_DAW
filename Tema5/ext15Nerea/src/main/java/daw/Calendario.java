/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author nerea
 */
public class Calendario {

    private int[][] calendario = new int[6][7];
    private int mes;
    private int year;

    public Calendario(int mes, int year) {
        this.mes = mes;
        this.year = year;
        calendario(mes, year);
    }

    private void calendario(int mes, int year) {
        LocalDate fecha = LocalDate.of(year, mes, 1);
        int diasMes = fecha.lengthOfMonth();
        int dia = 1;
        for (int i = 0; i < calendario.length; i++) {

            for (int j = 0; j < calendario[i].length; j++) {

                if (i == 0 && fecha.getDayOfWeek().getValue() != j && j < fecha.getDayOfWeek().getValue()) {
                    calendario[i][j] = 0;
                } else {
                    if (dia <= diasMes) {
                        calendario[i][j] = dia;
                        dia++;
                    }
                }

            }
        }
    }

    @Override
    public String toString() {
        String texto = "";
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j] == 0) {
                    texto += "\t";
                } else {
                    texto += calendario[i][j] + "\t";
                }
                if (j == calendario[i].length - 1) { // Cuando imprima el último elemento de la fila
                    // Haz un salto de línea
                    texto += "\n";
                }
            }
        }
        return cabecera() + "\n" + texto;
    }

    private String cabecera() {
        String texto = "";
        char[] diasSemana = {'L', 'M', 'X', 'J', 'V', 'S', 'D'};
        for (int i = 0; i < diasSemana.length; i++) {
            texto += diasSemana[i] + "\t";
        }
        return texto;
    }

    public static String diaSemana(int dia, Calendario calendario) {
        if (dia > 0 && dia <= 31) {
            LocalDate fecha = LocalDate.of(calendario.year, calendario.mes, dia);
            return fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }

    public static Calendario[] calendarioAnual(int year) {
        Calendario[] calendariosAño = new Calendario[12];
        for (int i = 1; i <= calendariosAño.length; i++) {
            calendariosAño[i-1] = new Calendario(i, year);
        }
        return calendariosAño;
    }

    public static void imprimirCalendarios(Calendario[] calendario) {
        for (int i = 0; i < calendario.length; i++) {
            if (calendario[i] != null) {
                System.out.println(calendario[i] + "\n");
            }
            
        }
    }

}
