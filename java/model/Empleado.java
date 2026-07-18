package model;

import interfaces.Registrable;

/**
 * Representa un empleado de la agencia.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class Empleado extends Persona implements Registrable {

    /**
     * Cargo del empleado.
     */
    private String cargo;

    /**
     * Constructor de la clase Empleado
     *
     * @param nombre    Nombre del Empleado.
     * @param rut       RUT del Empleado.
     * @param direccion Dirección del Empleado.
     * @param cargo Cargo que desempeña.
     */
    public Empleado(String nombre, Rut rut, Direccion direccion, String cargo) {
        super(nombre, rut, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Registra al empleado.
     */
    @Override
    public void registrar() {
        System.out.println("Empleado registrado correctamente.");
    }

    /**
     * Muestra los datos del empleado.
     */
    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    /**
     * Devuelve el cargo del empleado.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: " + cargo;
    }
}
