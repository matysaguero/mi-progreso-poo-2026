public interface Descontable {
    int DESCUENTO_MAXIMO = 50;

    boolean aplicarDescuento(int porcentaje);
    boolean getPrecioConDescuento();
}
