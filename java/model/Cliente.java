package model;

import interfaces.Registrable;

/**
 * Representa un cliente de la agencia Llanquihue Tour.
 * Hereda de Persona e implementa la interfaz Registrable.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class Cliente extends Persona implements Registrable {

    /**
     * Tarjeta utilizada por el clienta para realizar pagos.*/
    private Tarjeta tarjeta;

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre    Nombre del Cliente.
     * @param rut       RUT del cliente.
     * @param direccion Dirección del cliente.
     * @param tarjeta Tarjeta bancaria.
     */
    public Cliente(String nombre, Rut rut, Direccion direccion, Tarjeta tarjeta) {
        super(nombre, rut, direccion);
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * Registra al cliente.
     */
    @Override
    public void registrar() {
        System.out.println("Cliente registrado correctamente.");
    }

    /**
     * Muestra los datos del cliente.
     */
    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    /**
     * Devuelve la informacion del cliente.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nTarjeta: " + tarjeta;
    }
}
