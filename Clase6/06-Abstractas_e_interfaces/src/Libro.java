// Archivo: Libro.java
// Los libros estan exentos de IVA.

public class Libro extends Producto implements Descontable {

    // TODO 3: declarar el IVA que le corresponde a un libro (esta exento,
    //         asi que es 0.0) e implementar getPrecioFinal().
    private final double IVA = 0.0;

    // TODO 8: un libro se liquida cuando la editorial saca una edicion nueva.
    //         Agregar implements Descontable, el atributo del porcentaje y los
    //         dos metodos del contrato.

    private final String autor;
    private final String isbn;
    private int porcentaje;

    public Libro(String codigo, String nombre, double precio, String autor, String isbn) {
        super(codigo, nombre, precio);
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("El autor es obligatorio");
        }
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("El ISBN es obligatorio");
        }
        this.autor = autor;
        this.isbn = isbn;
    }
    
    @Override

    public double getPrecioFinal(){
        return getPrecio() *(1+ IVA);
    }

    public boolean aplicarDescuento(int porcentaje){
        if (porcentaje > DESCUENTO_MAXIMO){
            return false;
        } else return true;
    }

    public boolean getPrecioConDescuento(){
        return true;
    };

    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
    }
}
