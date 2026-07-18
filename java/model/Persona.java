package model;

/**
 * Represneta una persona del sistema.
 * Es la clase padre de Cliente y Empleado
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class Persona {

    private String nombre;
    private Rut rut;
    private Direccion direccion;

    /**
     * Constructor de la clase Persona
     *
     * @param nombre Nombre de la persona.
     * @param rut RUT de la persona.
     * @param direccion Dirección de residencia.
     */
    public Persona(String nombre, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nRut: " + rut +
                "\nDireccion: " + direccion;
    }
}
