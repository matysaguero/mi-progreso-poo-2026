public class Alimento extends Producto {
    private int peso;
    private int cantidad;
    private String sello;
    private String tipo;

    public Alimento(String codigo, String nombre, int precio, int peso, int cantidad, String sello, String tipo) {
        super(codigo, nombre, precio);
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso no es valido, debe ser mayor a 0");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad no puede ser menor o igual a 0");
        }
        if (sello == null || sello.isBlank()) {
            throw new IllegalArgumentException("El sello no es valido");
        }
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("El tipo no es valido");
        }
    }

public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("Peso: "+peso);
    System.out.println("Cantidad: "+cantidad);
    System.out.println("Sello/s: "+sello);
    System.out.println("Tipo: "+tipo);
}
}
