/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package nerea;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import javax.print.attribute.standard.Chromaticity;


/**
 *
 * @author nerea
 */
public class EjemplosFechas {

    public static void main(String[] args) {
       
        // Clase que guarda fechas
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Año: " + fechaHoy.getYear());
        System.out.println("Mes: " + fechaHoy.getMonthValue());
        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month: " + mesActual);
        
        // Fechas concretas
        LocalDate fecha = LocalDate.of(2000, 11, 10);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 10);
        System.out.println("Fecha: " + fecha);
        
        // Son iguales?? --> equals
        if (fecha.equals(fecha2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }
        
        // Anterior y posterior
        if (fecha.isBefore(fecha2)){
            System.out.println("fecha es anterior a fecha2");
        }
        
        if (fecha.isAfter(fecha2)){
            System.out.println("fecha es posterior a fecha2");
        }
        
        // Clase para guardar mes y día (no el año)
        MonthDay nocheVieja = MonthDay.of(12, 31);
        
        // Clase para guardar año y mes (no el día)
        YearMonth añoMes = YearMonth.of(2023, 2);
        
        // Operaciones con fechas
        // Sumar = plus; Restar = minus
        System.out.println("Hoy: " + fechaHoy);
        System.out.println("Después de 100 días: " + fechaHoy.plusDays(100));
        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        System.out.println("Después de 13 meses: " + sumarMeses);
        
        
        LocalDate dosSiglosDespues = sumarMeses.plus(2, ChronoUnit.CENTURIES);
        System.out.println(dosSiglosDespues);
        
        // Diferencia de días entre 2 fechas
        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println("Días entre fechas " + diferenciaDias);
        
        long years = ChronoUnit.YEARS.between(fecha, fecha2);
        System.out.println("Años entre fechas " + years);
        
        // Para saber si es bisiesto
        boolean esBisiesto = fechaHoy.isLeapYear();
        System.out.println("¿Es bisiesto? " + esBisiesto);
        
        System.out.println("Días del mes actual " + fechaHoy.lengthOfMonth());
        
        // Nos devuelve el día en español
        Locale configLocal = Locale.getDefault();
        System.out.println("Fecha hoy, Día de la semana: " + 
                fechaHoy.getDayOfWeek().getDisplayName(TextStyle.FULL, configLocal));
        
        // TextStyle.short en cortito, Narrow la letrita primera
        System.out.println("Fecha hoy, Mes: " + 
                mesActual.getDisplayName(TextStyle.FULL, Locale.CHINA));
        
        // dd día con dos numeritos
        // MM mes con dos numeritos
        // yyyy año con 4 numeritos o yy si quiero solo los 2 ultimos
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formatoFechas);
        System.out.println("Fecha formateada " + fechaFormateada);
    }
}
