package model;

/**
 * Representa una tarjeta bancaria utilizada por un cliente.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class Tarjeta {

    private String banco;
    private String numero;

    /**
     * Constructor de la clase Tarjeta.
     *
     * @param banco Nombre del banco
     * @param numero Número de la tarjeta
     */
    public Tarjeta(String banco, String numero) {
        this.banco = banco;
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return banco + " - " + numero;
    }
}
