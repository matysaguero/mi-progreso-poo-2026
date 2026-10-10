// Archivo: Producto.java
// Lo comun a todos los productos del catalogo. Completarla es la parte 2.

public class Producto {
    
    // TODO 1: declarar los atributos comunes a todo producto (codigo, nombre,
    //         precio) y la constante IVA. Quedan private; ningun paso de esta
    //         actividad los cambia a protected.
    private String codigo;
    private String nombre;
    private int precio;
    private final double IVA = 0.21;

    // TODO 2: constructor que reciba los tres datos y valide lo mismo que hoy
    //         validan Libro y Electronico (codigo y nombre obligatorios,
    //         precio mayor a cero).

    public Producto(String codigo, String nombre, int precio) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El codigo es obligatorio");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero");
        }
    }

    // TODO 3: getters getNombre(), getPrecio() y getPrecioFinal(), que
    //         devuelve el precio con el IVA incluido.

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public final double getPrecioFInal() {
        return (double) (this.precio * (1 + IVA));
    }
    // TODO 4: mostrarDetalle() con el encabezado comun del catalogo (codigo,
    //         nombre, precio y precio final con IVA).

    public void mostrarDetalle() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Precio final (IVA incluido): $" + this.getPrecioFInal());
    }
}
