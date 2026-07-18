package app;

import model.*;
import service.HistorialCompras;
import service.SistemaTour;

/**
 * Clase principal del proyecto Llanquihue Tour.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        try {

            SistemaTour sistema = new SistemaTour();

            HistorialCompras historial = new HistorialCompras();

            // Carga los archivos desde el resources
            sistema.cargarClientes();
            sistema.cargarProductos();

            // Obtener cliente del sistema
            Cliente cliente = sistema.buscarCliente("12345678-9");

            //================
            // Crear Empleado
            //================
            Empleado empleado = new Empleado(
                    "María Soto",
                    new Rut("98765432-1"),
                    new Direccion("San Martín 10", "Puerto Varas"),
                    "Guía Turístico"
            );

            //====================
            // Registrar personas
            //====================
            sistema.agregarEmpleado(empleado);

            //===================
            // Mostrar Productos
            //===================
            System.out.println("PRODUCTOS");

            sistema.mostrarProductos();

            //================
            // Buscar Producto
            //================
            System.out.println("\nBUSQUEDA POR PRODUCTO");

            System.out.println(sistema.buscarProducto("Tour Frutillar"));

            //================
            // Crear Orden
            //================
            OrdenDeCompra orden = sistema.crearOrden(cliente);

            // Sobrecarga
            sistema.agregarProductoOrden(
                    orden,
                    "Tour Frutillar"
            );

            sistema.agregarProductoOrden(
                    orden,
                    "Tour Saltos del Petrohué"
            );

            sistema.agregarProductoOrden(
                    orden,
                    "Tour Volcán Osorno"
            );

            //===================
            // Filtro por precio
            //===================
            System.out.println("\nPRODUCTOS SOBRE $20.000");

            orden.mostrarProductosCaros(20000);

            //================
            // HashMap
            //================
            System.out.println("\nBUSCAR CLIENTE");

            System.out.println(sistema.buscarCliente("12345678-9"));

            //================
            // Buscar Nombre
            //================
            System.out.println("\nBUSCAR POR NOMBRE");

            System.out.println(sistema.buscarPorNombre("Juan Pérez"));

            //================
            // Filtro Ciudad
            //================
            System.out.println("\nBUSCAR POR CIUDAD");

            sistema.clientesPorCiudad("Llanquihue");


            //===================
            // Lista Polimórfica
            //===================
            System.out.println("\nLISTA POLIMÓRFICA");

            sistema.mostrarRegistros();

            //================
            // instanceof
            //================
            System.out.println("--- TIPOS DE PERSONAS REGISTRADAS---");

            sistema.mostrarTipos();

            System.out.println("------------------------");

            //================
            // Productos en la orden de compra
            //================
            System.out.println("\nPRODUCTOS EN LA ORDEN");

            for (Producto p : orden.getProductos()) {
                System.out.println(p.getNombre() + " -> $" + p.getPrecio());
            }

            //================
            // Stack
            //================
            sistema.finalizarCompra(historial, orden);

            System.out.println("------------------------");

            System.out.println(historial.ultimaCompra());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
