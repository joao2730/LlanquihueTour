## 🧠 Evaluación – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Joao Aranda
- **Sección:** Desarrollo Orientado a Objetos I
- **Carrera:** Analista Programador
- **Sede:** Online

---

## 📘 Descripción general del sistema

LlanquihueTour es un sistema desarrollado en Java que simula la gestión de una agencia de turismo. Permite administrar clientes, empleados, productos turísticos y órdenes de compra, aplicando los principios de Programación Orientada a Objetos, el uso de colecciones, lectura de archivos de texto y una estructura modular organizada por paquetes.

---

## 🧱 Estructura general del proyecto

```plaintext
LlanquihueTour
│
└── src
    └── main
        ├── java
        │    ├── app
        │    │   └── Main.java //Punto de inicio del programa. Ejecuta las funcionalidades del sistema, carga los datos y realiza las pruebas del proyecto.
        │    │
        │    ├── model
        │    │   ├── Persona.java //Clase base que contiene la información común de las personas.
        │    │   ├── Cliente.java //Hereda de Persona y representa a los clientes de la agencia. Implementa la interfaz Registrable.
        │    │   ├── Empleado.java //Hereda de Persona y representa a los empleados de la agencia. Implementa la interfaz Registrable.
        │    │   ├── Direccion.java //Almacena la dirección y ciudad de una persona.
        │    │   ├── Rut.java //Representa el RUT de una persona e incorpora su validación mediante una excepción personalizada.
        │    │   ├── Tarjeta.java //Contiene la información de la tarjeta asociada al cliente.
        │    │   ├── Producto.java //Representa un tour turístico con su nombre y precio.
        │    │   └── OrdenDeCompra.java //Gestiona los productos adquiridos por un cliente y calcula el total de la compra.
        │    │
        │    ├── interfaces
        │    │   └── Registrable.java //Interfaz que define los métodos comunes para los objetos que pueden registrarse en el sistema.
        │    │
        │    ├── service
        │    │   ├── SistemaTour.java //Clase principal del sistema. Administra clientes, empleados, productos y órdenes de compra. Implementa búsquedas, filtros, listas polimórficas y el uso de HashMap.
        │    │   └── HistorialCompras.java //Administra el historial de compras utilizando una estructura Stack.
        │    │
        │    └── utils
        │        ├── LectorArchivo.java //Lee los archivos ubicados en la carpeta resources y convierte los datos en objetos del sistema.
        │        └── RutInvalidoException.java //Excepción personalizada utilizada para validar el formato del RUT.
        │           
        │           
        │               
        │
        ├── resources
        │   ├── clientes.txt
        │   └── productos.txt
        │
        └──  README.md
````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
https://github.com/joao2730/LlanquihueTour.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que los archivos txt estén correctamente ubicados.

4. Ejecuta el archivo `Main.java` desde el paquete `app`.

5. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).
