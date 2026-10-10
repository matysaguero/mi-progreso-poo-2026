// Archivo: Libro.java
// Completa y funcionando. Es la clase mas vieja del catalogo.



    // TODO 5: heredar de Producto con extends, borrar lo que quedo duplicado,
    //         llamar a super(...) como primera instruccion del constructor y
    //         sobrescribir mostrarDetalle() reutilizando super.mostrarDetalle()
    //         para el encabezado y agregando el autor y el ISBN.

    public class Libro extends Producto{

    /* 
    private static final double IVA = 0.21;

    private final String codigo;
    private final String nombre; 
    private final double precio;    dejo las partes repetidas comentadas */
    
    private final String autor;
    private final String isbn;

    public Libro(String codigo, String nombre, int precio, String autor, String isbn) {
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

    public void mostrarDetalle(){
        super.mostrarDetalle();
        System.out.println("Autor:"+autor);
        System.out.println("ISBN:"+isbn);
    };
}


