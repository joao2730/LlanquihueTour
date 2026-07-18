package service;

import model.OrdenDeCompra;

import java.util.Stack;

/**
 * Administra el historial de órdenes de compra.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class HistorialCompras {

    /**
     * Pila de órdenes.
     */
    private Stack<OrdenDeCompra> historial;

    /**
     * Constructor.
     */
    public HistorialCompras() {

        historial = new Stack<>();
    }

    /**
     * Guarda una compra.
     *
     * @param orden Orden realizada.
     */
    public void guardarCompra(OrdenDeCompra orden) {

        historial.push(orden);
    }

    /**
     * Obtiene la última compra.
     *
     * @return Última orden.
     */
    public OrdenDeCompra ultimaCompra() {

        if (historial.isEmpty()) {

            return null;
        }

        return historial.peek();
    }

    /**
     * Elimina la última compra.
     */
    public void eliminarUltimaCompra() {

        if (!historial.empty()) {

            historial.pop();
        }
    }

    /**
     * Muestra el historial.
     */
    public void mostrarHistorial() {

        for (OrdenDeCompra orden : historial) {

            System.out.println(orden);
        }
    }
}
