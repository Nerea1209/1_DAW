/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class AquilerVehiculos {
    
    private static Empresa e1 = new Empresa("e1");
    
    public static void main(String[] args) {
        
        int seleccion = 0;
        do {
            if (seleccion != 7) {
                seleccion = mostrarMenu();

                switch (seleccion) {
                    case 0:
                        String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
                        String apellido = JOptionPane.showInputDialog("Apellido del cliente:");
                        Cliente cliente = new Cliente(nombre, apellido);
                        e1.registrarCliente(cliente);
                        break;
                    case 1:
                        String matricula = JOptionPane.showInputDialog("Matrícula del vehículo:");
                        Color color = colorVehiculo();
                        Modelo modelo = modeloVehiculo();
                        boolean disponible = disponibilidadVehiculo();
                        double tarifa = tarifaVehiculo();
                        Vehiculo vehiculo = new Vehiculo(matricula, color, modelo, disponible, tarifa);
                        e1.registrarVehiculo(vehiculo);
                        break;
                    case 2:
                        
                        String nif = "";
                        String bastidor = "";
                        int numDias = 0;
                        do {
                            // nif del cliente que alquila el vehículo
                            do {
                                if (nif != null) {
                                    nif = JOptionPane.showInputDialog("Introduce el nif del cliente:");
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "No existe ese cliente, vuelve a intentarlo.");
                                }
                            } while (true);

                            // Bastidor del vehículo alquilado
                            do {
                                if (bastidor != null) {
                                    bastidor = JOptionPane.showInputDialog("Introduce el bastidor del vehículo:");
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "No existe ese bastidor, vuelve a intentarlo.");
                                }
                            } while (true);

                            // Días que se va a alquilar el vehículo a ese cliente
                            do {
                                try {
                                    numDias = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de días del alquiler:"));
                                    break;
                                } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "ERROR. No has introducido un número entero");
                                }
                            } while (true);
                            
                            // Controlo si se puede registrar el alquiler según los datos registrados
                            if (!e1.registrarAlquiler(nif, bastidor, LocalDate.now(), numDias)) {
                                JOptionPane.showMessageDialog(null, """
                                                                    ERROR. No se ha podido registrar el alquiler. 
                                                                    Inténtelo de nuevo""");
                            } else {
                                e1.registrarAlquiler(nif, bastidor, LocalDate.now(), numDias);
                                break;
                            }
                        } while (!e1.registrarAlquiler(nif, bastidor, LocalDate.now(), numDias));
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "Clientes de la empresa: \n" + e1.getCc());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Vehículos de la empresa: \n" + e1.getCv());
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Alquileres de la empresa: \n" + e1.getCa());
                        break;
                    case 6:
                        int alquilerID;
                        do {
                            // Controlo que lo que inserte el usuario es un número entero
                            do {
                                try {
                                    alquilerID = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del alquiler a finalizar"));
                                    break;
                                } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "ERROR. No has introducido un número entero");
                                }
                            } while (true);
                            
                            Alquiler a = e1.getCa().buscarAlquiler(alquilerID);
                            
                            // El vehículo pasa a estar disponible
                            if (a != null) {
                                e1.recibirVehiculo(a);
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe ese alquiler. \n Por favor, inténtelo de nuevo.");
                            }
                        } while (true);
                        break;
                    default:
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Saliendo...");
            }
        } while (seleccion != 7);

    }
    
    public static int mostrarMenu(){
        return JOptionPane.showOptionDialog(null, "Seleccione una opción",
                        "Empresa Rentacar", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                            "Registrar cliente", "Registrar vehículo", "Registrar alquiler",
                            "Mostrar clientes", "Mostrar vehículos", "Mostrar alquileres", "Recibir vehículo", "Salir"}, null);
    }
    
    public static Color colorVehiculo() {
        Color color;
        do {
            String colorString = JOptionPane.showInputDialog("""
                                                         Color del vehículo:
                                                         Colores disponibles: Rojo, Negro, Blanco, Azul,
                                                         Amarillo, Verde""");
            if (colorString.equalsIgnoreCase("negro")) {
                color = Color.NEGRO;
                break;
            } else if (colorString.equalsIgnoreCase("amarillo")) {
                color = Color.AMARILLO;
                break;
            } else if (colorString.equalsIgnoreCase("verde")) {
                color = Color.VERDE;
                break;
            } else if (colorString.equalsIgnoreCase("azul")) {
                color = Color.AZUL;
                break;
            } else if (colorString.equalsIgnoreCase("rojo")) {
                color = Color.ROJO;
                break;
            } else if (colorString.equalsIgnoreCase("blanco")) {
                color = Color.BLANCO;
                break;
            } else {
                JOptionPane.showMessageDialog(null, """
                                                ERROR. Color no disponible.
                                                Por favor, vuelve a intentarlo. """);
            }
        } while (true);
        return color;
    }

    public static Modelo modeloVehiculo() {
        Modelo modelo;
        do {
            String modeloString = JOptionPane.showInputDialog("""
                                                          Modelo del vehículo:
                                                          Modelos disponibles: Cupra, Ford Kuga, Seat Panda""");
            if (modeloString.equalsIgnoreCase("cupra")) {
                modelo = Modelo.CUPRA;
                break;
            } else if (modeloString.equalsIgnoreCase("ford kuga")) {
                modelo = Modelo.FORD_KUGA;
                break;
            } else if (modeloString.equalsIgnoreCase("seat panda")) {
                modelo = Modelo.SEAT_PANDA;
                break;
            } else {
                JOptionPane.showMessageDialog(null, """
                                                ERROR. Modelo no disponible.
                                                Por favor, vuelve a intentarlo. """);
            }
        } while (true);

        return modelo;
    }

    public static boolean disponibilidadVehiculo() {
        boolean disponibilidad;
        do {
            String disponibilidadString = JOptionPane.showInputDialog("""
                                                          Disponibilidad del vehículo:
                                                          (Sí / no)""");
            if (disponibilidadString.equalsIgnoreCase("si")
                    || disponibilidadString.equalsIgnoreCase("sí")) {
                disponibilidad = true;
                break;
            } else if (disponibilidadString.equalsIgnoreCase("no")) {
                disponibilidad = false;
                break;
            } else {
                JOptionPane.showMessageDialog(null, """
                                                ERROR.
                                                Por favor, vuelve a intentarlo. """);
            }
        } while (true);

        return disponibilidad;
    }

    public static double tarifaVehiculo() {
        double tarifa;
        do {
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
