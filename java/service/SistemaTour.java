package service;

import interfaces.Registrable;
import model.Cliente;
import model.Empleado;
import model.OrdenDeCompra;
import model.Producto;
import utils.LectorArchivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Administrar los registros del sistema Llanquihue Tour.
 * Permite almacenar, buscar y mostrar clientes y empleados.
 *
 * @author Joao Aranda
 * @version 1.0
 */
public class SistemaTour {

    /**
     * Lista de clientes.
     */
    private ArrayList<Cliente> clientes;

    /**
     * Mapa para buscar clientes rápidamente por Rut.
     */
    private HashMap<String, Cliente> mapaClientes;

    /**
     * Lista polimórfica de objetos Registrable.
     */
    private List<Registrable> registros;

    /**
     * Lista de productos.
     */
    private ArrayList<Producto> productos;

    /**
     * Lista de órdenes de compra registradas.
     */
    private ArrayList<OrdenDeCompra> ordenes;

    /**
     * Constructor.
     */
    public SistemaTour() {

        clientes = new ArrayList<>();
        mapaClientes = new HashMap<>();
        registros = new ArrayList<>();
        productos = new ArrayList<>();
        ordenes = new ArrayList<>();
    }

    /**
     * Agrega un cliente al sistema.
     *
     * @param cliente Cliente a registrar.
     */
    public void agregarCliente(Cliente cliente) {

        clientes.add(cliente);

        mapaClientes.put(cliente.getRut().getNumero(), cliente);

        registros.add(cliente);
    }

    /**
     * Agrega un empleado.
     *
     * @param empleado Empleado a registrar.
     */
    public void agregarEmpleado(Empleado empleado) {

        registros.add(empleado);
    }

    /**
     * Busca un cliente por su Rut.
     *
     * @param rut Rut del cliente.
     * @return Cliente encontrado o null.
     */
    public Cliente buscarCliente(String rut) {

        return mapaClientes.get(rut);
    }

    /**
     * Busca un cliente por nombre.
     *
     * @param nombre Nombre.
     * @return Cliente encontrado o null.
     */
    public Cliente buscarPorNombre(String nombre) {

        for (Cliente cliente : clientes) {

            if (cliente.getNombre().equalsIgnoreCase(nombre)) {

                return cliente;
            }
        }

        return null;
    }

    /**
     * Muestra todos los clientes.
     */
    public void mostrarClientes() {

        for (Cliente cliente : clientes) {

            System.out.println(cliente);

            System.out.println("--------------------");
        }
    }

    /**
     * Filtra clientes según la ciudad.
     *
     * @param ciudad Ciudad buscada.
     */
    public void clientesPorCiudad(String ciudad) {

        for (Cliente cliente : clientes) {

            if (cliente.getDireccion().getCiiudad().equalsIgnoreCase(ciudad)) {

                System.out.println(cliente);
            }
        }
    }

    /**
     * Muestra los registros utilizando polimorfismo.
     */
    public void mostrarRegistros() {

        for (Registrable registro : registros) {

            registro.mostrarDatos();

            System.out.println("------------------------");
        }
    }

    /**
     * Demuestra el uso de instanceof.
     */
    public void mostrarTipos() {

        for (Registrable registro : registros) {

            if (registro instanceof Cliente) {

                System.out.println("Cliente registrado.");

            } else if (registro instanceof Empleado) {

                System.out.println("Empleado registrado.");
            }
        }
    }

    /**
     * Carga los clientes desde resources.
     */
    public void cargarClientes() {

        ArrayList<Cliente> lista = LectorArchivo.leerClientes();

        for (Cliente cliente : lista) {

            agregarCliente(cliente);
        }
    }

    /**
     * Carga los productos desde resources.
     */
    public void cargarProductos() {

        productos = LectorArchivo.leerProductos();
    }

    /**
     * Muestra los productos disponibles.
     */
    public void mostrarProductos() {

        for (Producto producto : productos) {

            System.out.println(producto);
        }
    }

    /**
     * Busca un producto por nombre.
     *
     * @param nombre Nombre del producto.
     * @return Producto encontrado o null.
     */
    public Producto buscarProducto(String nombre) {

        for (Producto producto : productos) {

            if (producto.getNombre().equalsIgnoreCase(nombre)) {

                return producto;
            }
        }

        return null;
    }

    /**
     * Crea una orden para un cliente.
     *
     * @param cliente Cliente que realiza la compra.
     * @return Orden creada.
     */
    public OrdenDeCompra crearOrden(Cliente cliente) {

        OrdenDeCompra  orden = new OrdenDeCompra(cliente);

        ordenes.add(orden);

        return orden;
    }

    /**
     * Agrega un producto a una orden buscando el producto
     * por su nombre.
     *
     * @param orden Orden de compra.
     * @param nombreProducto Nombre del producto.
     */
    public void agregarProductoOrden(OrdenDeCompra orden, String nombreProducto) {

        Producto producto = buscarProducto(nombreProducto);

        if (producto != null) {

            orden.agregarProducto(producto);

        } else {

            System.out.println("Producto no encontrado.");

        }
    }

    /**
     * Muestra todas las órdenes.
     */
    public void mostrarOrdenes() {

        for (OrdenDeCompra orden : ordenes) {

            System.out.println(orden);

            System.out.println("-------------------------");
        }
    }

    public void finalizarCompra(HistorialCompras historial, OrdenDeCompra orden) {

        historial.guardarCompra(orden);

        System.out.println("Compra registrada correctamente.");
    }
}
