/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        String seleccion = "Seleccione";
        
        // PROCESO
        // Controlamos el NullPointerException
        try {
            // Repetimos el menú hasta que el usuario le de a cancelar o a la x
            do {
                seleccion = mostrarMenu();
                
                switch (seleccion) {
                    
                    case "Reservar asiento" -> {
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
                    case "Cancelar asiento" -> {
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
                    case "Mostrar asientos" -> {
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
                                if (e1.buscarCliente(nif) != null && e1.buscarVehiculo(bastidor) != null && e1.registrarAlquiler(nif, bastidor, numDias) != false) {
                                    // Si existe el cliente y el vehículo, registramos el alquiler
                                    e1.registrarAlquiler(nif, bastidor, numDias);
                                    JOptionPane.showMessageDialog(null, "El alquiler se ha registrado correctamente");
                                } else {
                                    JOptionPane.showMessageDialog(null, "ERROR. No se ha podido registrar el alquiler");
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
                    default -> {
                    }
                }
            } while (seleccion != null);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "Cancelando...");
        }
        
        
    }
       
    
    public static String mostrarMenu() {
        return (String) JOptionPane.showInputDialog(null, "¿Qué le gustaría hacer?",
                "Airways", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Seleccione", "Reservar asiento", "Cancelar asiento", "Mostrar asientos"},
                "Seleccione");
    
}
