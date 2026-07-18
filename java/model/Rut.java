package model;

import utils.RutInvalidoException;

/**
 * Representa el Rut de una persona.
 * Valida que el valor ingresado tenga un formato mínimo.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class Rut {

    private String numero;

    /**
     * Constructor de la clase Rut.
     *
     * @param numero Número del Rut.
     * @throws utils.RutInvalidoException Si el Rut es inválido.
     */
    public Rut(String numero) throws RutInvalidoException {
        if (numero == null || numero.length() < 8) {
            throw new RutInvalidoException("El Rut ingresado no es válido.");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    /**
     * Modifica el número del Rut.
     *
     * @param numero Nuevo RUT.
     * @throws RutInvalidoException Si el RUT es inválido.
     */
    public void setNumero(String numero) throws RutInvalidoException {
        if (numero == null || numero.length() < 8) {
            throw new RutInvalidoException("El Rut ingresado no es válido.");
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
