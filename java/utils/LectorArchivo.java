package utils;

import model.*;

import java.io.*;
import java.util.ArrayList;

/**
 * Permite leer archivos de texto.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class LectorArchivo {

    /**
     * Lee el archivo clientes.txt y devuelve una lista de clientes.
     *
     * Formato:
     * Nombre;Rut;Calle;Ciudad.
     *
     * @return Lista de clientes.
     */
    public static ArrayList<Cliente> leerClientes() {

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {

           InputStream input = LectorArchivo.class.getResourceAsStream("/clientes.txt");

            if (input == null) {
                throw new IOException("No se encontro el archivo clientes.txt");
            }

           BufferedReader lector = new BufferedReader(new InputStreamReader(input));

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                try {

                Cliente cliente = new Cliente(
                        datos[0],
                        new Rut(datos[1]),
                        new Direccion(datos[2], datos[3]),
                        new Tarjeta("Banco Estado", "0000000000000000")
                );

                clientes.add(cliente);

            } catch (RutInvalidoException e) {

                System.out.println("Cliente no agregado: " + e.getMessage());;
            }
            }
            lector.close();

        } catch (IOException e) {

            System.out.println("Error al leer clientes: " + e.getMessage());

        }

        return clientes;
    }

    /**
     * Lee el archivo productos.txt y devuelve una lista de productos.
     *
     * Formato:
     * Nombre;Precio
     *
     * @return Lista de productos.
     */
    public static ArrayList<Producto> leerProductos() {

        ArrayList<Producto> productos = new ArrayList<>();

        try {

            InputStream input = LectorArchivo.class.getResourceAsStream("/productos.txt");

            if (input == null) {
                throw new IOException("No se encontro el archivo productos.txt");
            }

            BufferedReader lector = new BufferedReader(new InputStreamReader(input));

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                productos.add(new Producto(
                        datos[0],
                        Double.parseDouble(datos[1])
                ));
            }

            lector.close();

        } catch (IOException e) {

            System.out.println("Error al leer productos: " + e.getMessage());
        }

        return productos;
    }
}
