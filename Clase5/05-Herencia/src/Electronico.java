// Archivo: Electronico.java
// Nacio como copia de Libro.java. El que hizo la copia adapto casi todo.

public class Electronico extends Producto{

    // TODO 6: lo mismo que el TODO 5, pero para esta clase. Al terminar,
    //         el autor fantasma desaparece solo.

    /* private static final double IVA = 0.21;

    private final String codigo;
    private final String nombre;
    private final double precio; */
    private final String fabricante;
    private final int mesesGarantia;

    public Electronico(String codigo, String nombre, int precio, String fabricante, int mesesGarantia) {
        super(codigo, nombre, precio);
        if (fabricante == null || fabricante.isBlank()) {
            throw new IllegalArgumentException("El fabricante es obligatorio");
        }
        if (mesesGarantia < 0) {
            throw new IllegalArgumentException("La garantia no puede ser negativa");
        }

        this.fabricante = fabricante;
        this.mesesGarantia = mesesGarantia;
    }

    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Fabricante: " + this.fabricante); //Correjí error en String que estamos imprimiendo en vez de Autor, puse Fabricante
        System.out.println("Garantia: " + this.mesesGarantia + " meses");
    }
}
