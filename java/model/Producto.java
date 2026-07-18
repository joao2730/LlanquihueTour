package model;

/**
 * Representa un tour o servicio turístico.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class Producto {

    /**
     * Nombre del tour.
     */
    private String nombre;

    /**
     * Precio del tour
     */
    private double precio;

    /**
     * Constructor que recibe solo el nombre.
     *
     * @param nombre Nombre del producto.
     */
    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
    }

    /**
     * Constructor completo.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el nombre del producto y su precio.
     */
    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
