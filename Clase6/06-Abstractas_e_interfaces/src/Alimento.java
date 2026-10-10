// Archivo: Alimento.java
// Los alimentos de la canasta basica tributan un IVA reducido: 10,5%.

public class Alimento extends Producto implements Descontable {

    // TODO 5: declarar el IVA reducido (0.105) e implementar
    //         getPrecioFinal().
    private final double IVA = 0.105;
    private int porcentaje;

    // TODO 9: un alimento se liquida cuando se acerca el vencimiento. Agregar
    //         implements Descontable, el atributo del porcentaje y los dos
    //         metodos del contrato, y borrar la constante DESCUENTO y la linea
    //         del precio de oferta, que pasan a ser parte del contrato.

     // private static final double DESCUENTO = 0.20; <- Se comenta linea.

    private final String fechaVencimiento;

    public Alimento(String codigo, String nombre, double precio, String fechaVencimiento) {
        super(codigo, nombre, precio);
        if (fechaVencimiento == null || fechaVencimiento.isBlank()) {
            throw new IllegalArgumentException("La fecha de vencimiento es obligatoria");
        }
        this.fechaVencimiento = fechaVencimiento;
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
        System.out.println("Vence: " + this.fechaVencimiento);
        // System.out.println("Precio oferta (20% de descuento): $" + (this.getPrecioFinal() * (1 - DESCUENTO))); <- Linea comentada.
    }
}
