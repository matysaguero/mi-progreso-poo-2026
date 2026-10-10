// Archivo: Suscripcion.java
// La tienda tambien vende suscripciones al club de lectura. Una suscripcion
// NO es un producto del catalogo: no tiene codigo, ni stock, ni IVA propio.
// Pero tambien entra en la liquidacion del mes.

public class Suscripcion implements Descontable {

    // TODO 10: agregar implements Descontable, el atributo del porcentaje y
    //          los dos metodos del contrato. Ojo: esta clase no hereda de
    //          Producto, asi que no tiene getPrecioFinal(). El precio con
    //          descuento se calcula sobre su propio precio mensual.

    private final String plan;
    private final double precioMensual;
    private int porcentaje;

    public Suscripcion(String plan, double precioMensual) {
        if (plan == null || plan.isBlank()) {
            throw new IllegalArgumentException("El plan es obligatorio");
        }
        if (precioMensual <= 0) {
            throw new IllegalArgumentException("El precio mensual debe ser mayor a cero");
        }
        this.plan = plan;
        this.precioMensual = precioMensual;
    }

    public String getPlan() {
        return this.plan;
    }

    public double getPrecioMensual() {
        return this.precioMensual;
    }

    @Override
        public boolean aplicarDescuento(int porcentaje){
        if (porcentaje > DESCUENTO_MAXIMO){
            return false;
        } else return true;
    }

    @Override
    public boolean getPrecioConDescuento(){
        return true;
    };

    public void mostrarDetalle() {
        System.out.println("Suscripcion: " + this.plan);
        System.out.println("Precio mensual: $" + this.precioMensual);
    }
}
