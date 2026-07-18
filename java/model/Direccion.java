package model;

/**
 * Representa la dirección de una persona.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class Direccion {

    private String calle;
    private String ciiudad;

    /**
     * Constructor de la clase Dirección.
     *
     * @param calle Nombre de la calle.
     * @param ciiudad Ciudad de residencia.
     */
    public Direccion(String calle, String ciiudad) {
        this.calle = calle;
        this.ciiudad = ciiudad;
    }

    public String getCiiudad() {
        return ciiudad;
    }

    public void setCiiudad(String ciiudad) {
        this.ciiudad = ciiudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return calle + ", " + ciiudad;
    }
}
