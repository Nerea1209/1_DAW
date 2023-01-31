/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class AlquilerVehiculos {

    private static Empresa e1 = new Empresa("e1");

    public static void main(String[] args) {

        // VARIABLES
        String seleccion = "Seleccione";
        String nif = "";
        String bastidor = "";
        int numDias = 0;
        String id = "";
        int alquilerID = 0;
        LocalDate fechaFin = LocalDate.now();
        int day, month, year = 0;
        String dias = "";
        String nombre = "";
        String apellido = "";
        Cliente cliente = new Cliente();
        Alquiler a = new Alquiler();

        // PROCESO
        // Controlamos el NullPointerException
        try {
            // Repetimos el menú hasta que el usuario le de a cancelar o a la x
            do {
                seleccion = mostrarMenu();
                
                switch (seleccion) {
                    
                    case "Registrar cliente" -> {
                        // Pedimos al usuario el nombre y el apellido del cliente a registrar
                        nombre = JOptionPane.showInputDialog("Nombre del cliente:");
                        apellido = JOptionPane.showInputDialog("Apellido del cliente:");
                        // No usamos el método equals porque queremos comparar la referencia
                        // en lugar de la igualdad de valor de dos objetos
                        if (nombre != null && apellido != null) { // Si no le da a cancelar
                            cliente = new Cliente(nombre, apellido);
                            e1.registrarCliente(cliente);
                            JOptionPane.showMessageDialog(null, "Se ha registrado al cliente correctamente");
                        }
                    }
                    case "Registrar vehículo" -> {
                        try { // Controlamos la excepcion de NullPointer
                            // Pedimos los datos del vehículo a registrar
                            String matricula = JOptionPane.showInputDialog("Matrícula del vehículo:");
                            Color color = colorVehiculo();
                            Modelo modelo = modeloVehiculo();
                            boolean disponible = disponibilidadVehiculo();
                            double tarifa = tarifaVehiculo();
                            Vehiculo vehiculo = new Vehiculo(matricula, color, modelo, disponible, tarifa);
                            e1.registrarVehiculo(vehiculo);
                        } catch (NullPointerException npe) {
                            JOptionPane.showMessageDialog(null, "Cancelando...");
                        }
                    }
                    case "Registrar alquiler" -> {
                        do {
                            // Controlo si se puede registrar el alquiler según los datos registrados
                            if (e1.registrarAlquiler(nif, bastidor, numDias)) {
                                JOptionPane.showMessageDialog(null, """
                                    ERROR. No se ha podido registrar el alquiler.
                                    Inténtelo de nuevo""");
                            } else {
                                // Pedimos los datos del cliente, vehiculo y dias del alquiler
                                nif = JOptionPane.showInputDialog("Introduce el nif del cliente:");
                                bastidor = JOptionPane.showInputDialog("Introduce el bastidor del vehículo:");
                                dias = JOptionPane.showInputDialog("Introduce el número de días del alquiler:");
                                if (nif != null && bastidor != null) { // Si no le da a cancelar
                                    try { // Controlamos que el usuario inserte un número entero
                                        if (dias != null) {
                                            numDias = Integer.parseInt(dias);
                                        }
                                    } catch (NumberFormatException nfe) {
                                        JOptionPane.showMessageDialog(null, "ERROR. No has introducido un número entero");
                                    }
                                }
                                if (e1.buscarCliente(nif) != null && e1.buscarVehiculo(bastidor) != null) {
                                    // Si existe el cliente y el vehículo, registramos el alquiler
                                    e1.registrarAlquiler(nif, bastidor, numDias);
                                    JOptionPane.showMessageDialog(null, "El alquiler se ha registrado correctamente");
                                } else {
                                    JOptionPane.showMessageDialog(null, "ERROR. No existe el cliente/vehículo introducido");
                                }
                            }
                        } while (e1.registrarAlquiler(nif, bastidor, numDias));
                    }

                    case "Mostrar clientes" ->
                        JOptionPane.showMessageDialog(null, "Clientes de la empresa: \n" + e1.getCc());
                    case "Mostrar vehículos" ->
                        JOptionPane.showMessageDialog(null, "Vehículos de la empresa: \n" + e1.getCv());
                    case "Mostrar alquileres" ->
                        JOptionPane.showMessageDialog(null, "Alquileres de la empresa: \n" + e1.getCa());
                    case "Recibir vehículo" -> {

                        
                        do {
                            try { // Controlo que lo que inserte el usuario es un número entero
                                id = JOptionPane.showInputDialog("Introduce el id del alquiler a finalizar");
                                if (id != null) { // Si no le da a cancelar
                                    alquilerID = Integer.parseInt(id);
                                }
                                break;
                            } catch (NumberFormatException nfe) {
                                JOptionPane.showMessageDialog(null, "ERROR. No has introducido un número entero");
                            }
                        } while (true);
                        
                        a = e1.getCa().buscarAlquiler(alquilerID);

                        // El vehículo pasa a estar disponible
                        if (a != null) { // Si el alquiler existe
                            e1.recibirVehiculo(a);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "ERROR. No existe el alquiler con id " + id);
                        }

                    }

                    case "Alquileres de un cliente" -> {

                        nif = JOptionPane.showInputDialog("Introduce el nif del cliente:");
                        if (nif != null) { // Si no le da a cancelar
                            if (e1.buscarCliente(nif) != null && !e1.AlquileresCliente(nif).isEmpty()) {
                                // Si existe el cliente y tiene alquileres, los mostramos
                                JOptionPane.showMessageDialog(null, e1.AlquileresCliente(nif));
                            } else {
                                JOptionPane.showMessageDialog(null, "El cliente con nif " + nif + " no ha realizado ningún alquiler");
                            }
                        }

                    }
                    case "Alquileres de un vehículo" -> {

                        bastidor = JOptionPane.showInputDialog("Introduce el bastidor del vehículo:");
                        if (bastidor != null) { // Si no le da a cancelar
                            if (e1.buscarVehiculo(bastidor) != null && !e1.AlquileresVehiculo(bastidor).isEmpty()) {
                                // Si existe el vehiculo y se encuentra en algún alquiler, mostramos los alquileres
                                JOptionPane.showMessageDialog(null, e1.AlquileresVehiculo(bastidor));
                            } else {
                                JOptionPane.showMessageDialog(null, "El vehículo con bastidor " + bastidor + " no se encuentra en ningún alquiler");
                            }
                        }

                    }

                    case "Borrar alquiler" -> {
                        do { // Repetimos hasta que introduzca un número entero
                            try { // Controlamos que el usuario inserte un entero
                                id = JOptionPane.showInputDialog("Introduce el id del alquiler a finalizar");
                                if (id != null) { // Si no le da a cancelar
                                    alquilerID = Integer.parseInt(id);
                                    break;
                                }
                                break;
                            } catch (NumberFormatException nfe) {
                                JOptionPane.showMessageDialog(null, "ERROR. No has introducido un número entero");
                            }
                        } while (true);

                        // Si existe el alquiler, lo borramos
                        if (e1.getCa().buscarAlquiler(alquilerID) != null) {
                            e1.borrarAlquiler(alquilerID);
                            JOptionPane.showMessageDialog(null, "Se ha borrado el alquiler correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe el alquiler con id " + alquilerID);
                        }

                    }

                    case "Borrar cliente" -> {
                        nif = JOptionPane.showInputDialog("Introduce el nif del cliente:");
                        if (nif != null) { // Si no le da a cancelar
                            if (e1.buscarCliente(nif) != null) { // Si existe el cliente y no tiene alquileres, lo borramos
                                e1.borrarCliente(e1.buscarCliente(nif));
                                JOptionPane.showMessageDialog(null, "Se ha borrado el cliente correctamente");
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe el cliente con nif " + nif);
                            }
                        }
                    }

                    case "Borrar vehículo" -> {
                        bastidor = JOptionPane.showInputDialog("Introduce el bastidor del vehículo:");
                        if (bastidor != null) { // Si no le da a cancelar
                            if (e1.buscarVehiculo(bastidor) != null) { // Si existe el vehiculo y no tiene alquileres, lo borramos
                                e1.borrarVehiculo(e1.buscarVehiculo(bastidor));
                                JOptionPane.showMessageDialog(null, "Se ha borrado el vehiculo correctamente");
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe el vehiculo con bastidor " + bastidor);
                            }
                        }

                    }

                    case "Vehículos a devolver en una fecha" -> {
                        do { // Repetimos hasta que el usuario inserte números enteros
                            // Y una fecha correcta
                            String diaString = JOptionPane.showInputDialog("Introduce el día:");
                            String mesString = JOptionPane.showInputDialog("Introduce el mes:");
                            String yearString = JOptionPane.showInputDialog("Introduce el año:");
                            try {
                                if (diaString != null && mesString != null && yearString != null) {
                                    day = Integer.parseInt(diaString);
                                    month = Integer.parseInt(mesString);
                                    year = Integer.parseInt(yearString);
                                    fechaFin = LocalDate.of(year, month, day);

                                }
                                break;
                            } catch (NumberFormatException nfe) { // Numero entero
                                JOptionPane.showMessageDialog(null, "ERROR. No has introducido un número entero");
                            } catch (DateTimeException dte) { // Fecha correcta
                                JOptionPane.showMessageDialog(null, "ERROR. Fecha incorrecta");
                            }
                        } while (true);

                        if (!e1.vehiculosADevolver(fechaFin).isEmpty()) {
                            // Si hay vehículos a devolver en esa fecha, los mostramos
                            JOptionPane.showMessageDialog(null, e1.vehiculosADevolver(fechaFin));
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay ningún vehículo a devolver");
                        }
                    }
                    default -> {
                    }
                }
            } while (seleccion != null);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "Cancelando...");
        }

    }
    
    // MÉTODOS
    
    public static String mostrarMenu() {
        return (String) JOptionPane.showInputDialog(null, "¿Qué le gustaría hacer?",
                "Empresa Rentacar", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Seleccione", "Registrar cliente", "Registrar vehículo", "Registrar alquiler",
                    "Mostrar clientes", "Mostrar vehículos", "Mostrar alquileres", "Recibir vehículo",
                    "Alquileres de un cliente", "Alquileres de un vehículo", "Borrar alquiler",
                    "Borrar cliente", "Borrar vehículo", "Vehículos a devolver en una fecha"},
                "Seleccione");

    }

    public static Color colorVehiculo() {
        Color color;
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione un color",
                "Colores de coches", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Rojo", "Negro", "Blanco",
                    "Azul", "Amarillo", "Verde"}, null);
        color = switch (opcion) {
            case 0 -> Color.ROJO;
            case 1 -> Color.NEGRO;
            case 2 -> Color.BLANCO;
            case 3 -> Color.AZUL;
            case 4 -> Color.AMARILLO;
            default -> Color.VERDE;
        };
        return color;
    }

    public static Modelo modeloVehiculo() {
        Modelo modelo;
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione un modelo",
                "Modelos de coches", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Cupra", "Ford Kuga", "Seat Panda"}, null);
        modelo = switch (opcion) {
            case 0 -> Modelo.CUPRA;
            case 1 -> Modelo.FORD_KUGA;
            default -> Modelo.SEAT_PANDA;
        };
        return modelo;
    }

    public static boolean disponibilidadVehiculo() {
        boolean disponibilidad;
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está disponible el vehículo?");
        disponibilidad = switch (opcion) {
            case JOptionPane.YES_OPTION -> true;
            default -> false;
        };
        return disponibilidad;

    }

    public static double tarifaVehiculo() {
        double tarifa;
        do { // Se repite mientras no inserte un número
            try {
                tarifa = Double.parseDouble(
                        JOptionPane.showInputDialog("Tarifa del vehículo:"));
                break;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "ERROR. "
                        + "No has introducido un número entero. \n Vuelve a intentarlo");
            }
        } while (true);
        return tarifa;
    }

}
