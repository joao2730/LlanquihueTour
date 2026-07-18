package utils;

/**
 * Excepción personalizada utilizada cuando un Rut
 * no cumple con el formato esperado
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class RutInvalidoException extends Exception {

    /**
     * Constructor de la excepción.
     *
     * @param mensaje Mensaje que describe el error.
     */
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}
