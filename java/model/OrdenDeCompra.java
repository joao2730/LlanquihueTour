package model;

import java.util.ArrayList;

/**
 * Representa una orden de compra realizada por un cliente.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class OrdenDeCompra {

    /***
     * Cliente que realiza la compra.
     */
    private Cliente cliente;

    /**
     * Lista de productos comprados.
     */
    private ArrayList<Producto> productos;

    /**
     * Constructor.
     *
     * @param cliente Cliente que realiza la compra.
     */
    public OrdenDeCompra(Cliente cliente) {
        this.cliente = cliente;
        productos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la orden.
     *
     * @param producto Producto.
     */
    public void agregarProducto(Producto producto) {

        productos.add(producto);
    }

    /**
     * Sobrecarga del método agrgarProducto.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio.
     */
    public void agregarProducto(String nombre, double precio) {

        productos.add(new Producto(nombre, precio));
    }

    /**
     * Muestra todos los productos.
     */
    public void mostrarProductos() {

        for  (Producto producto : productos) {

            System.out.println(producto);
        }
    }

    /**
     * Busca un producto por nombre.
     *
     * @param nombre Nombre del producto.
     * @return Producto encontrado o null.
     */
    public Producto buscarProducto(String nombre) {

        for(Producto producto : productos) {

            if(producto.getNombre().equalsIgnoreCase(nombre)) {

                return producto;
            }
        }
        return null;
    }

    /**
     * Muestra productos cuyo precio sea igual o superior al indicado.
     *
     * @param precioMinimo Precio mínimo.
     */
    public void mostrarProductosCaros(double precioMinimo) {

        boolean encontrado = false;

        for  (Producto producto : productos) {

            if(producto.getPrecio() >= precioMinimo) {

                System.out.println(producto);
                encontrado = true;
            }
        }

        if(!encontrado) {

            System.out.println("No existen productos con un precio igual o superior a $" + precioMinimo);
        }
    }

    /**
     * Calcula el total de la compra.
     *
     * @return Total.
     */
    public double calcularTotal() {

        double total = 0;

        for(Producto producto : productos) {

            total += producto.getPrecio();
        }
        return total;
    }

    /**
     * Devuelve la lista de productos.
     *
     * @return Lista de productos.
     */
    public ArrayList<Producto> getProductos() {

        return productos;
    }

    @Override
    public String toString() {
        return "--- ORDEN DE COMPRA ---" +
                "\nCliente: " + cliente.getNombre() +
                "\nCantidad de productos: " + productos.size() +
                "\nTotal: $" + calcularTotal();
    }
}
