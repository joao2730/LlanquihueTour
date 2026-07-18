package interfaces;

/**
 * Interfaz que define las operaciones básicas para registrar
 * y mostrar información de una entidad del sistema.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public interface Registrable {

    /**
     * Registra la entidad en el sistema.
     */
    void registrar();

    /**
     * Muestra los datos de la entidad.
     */
    void mostrarDatos();
}
