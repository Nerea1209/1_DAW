/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7bnerea;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nerea
 */
import org.apache.commons.lang3.RandomStringUtils;

public class parteA {

    private static Random random = new Random();

    public static List<Vehiculo> crearListaVehiculo(int turismos, int deportivos, int furgonetas) {
        List<Vehiculo> lista = new ArrayList<>();
        for (int i = 0; i < turismos; i++) {
            Marca marca = Marca.randomMarca();
            lista.add(new Turismo(random.nextInt(2, 5),
                    random.nextLong(), RandomStringUtils.randomAlphabetic(6),
                    marca, Modelo.randomModelo(marca), Color.randomColor(),
                    random.nextDouble(100, 10000), random.nextBoolean()));
        }
        for (int i = 0; i < deportivos; i++) {
            Marca marca = Marca.randomMarca();
            lista.add(new Deportivo(random.nextInt(100, 200),
                    random.nextLong(), RandomStringUtils.randomAlphabetic(6),
                    marca, Modelo.randomModelo(marca), Color.randomColor(),
                    random.nextDouble(100, 10000), random.nextBoolean()));
        }
        for (int i = 0; i < furgonetas; i++) {
            Marca marca = Marca.randomMarca();
            lista.add(new Furgoneta(random.nextInt(0, 1500), random.nextInt(100, 1000),
                    random.nextLong(), RandomStringUtils.randomAlphabetic(6),
                    marca, Modelo.randomModelo(marca), Color.randomColor(),
                    random.nextDouble(100, 10000), random.nextBoolean()));
        }
        return lista;
    }

}
