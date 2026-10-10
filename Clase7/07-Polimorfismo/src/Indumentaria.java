public class Indumentaria extends Producto {
    private final double IVA = 0.21;
    private final String talle;
    private final String color;

    public Indumentaria (String codigo, String nombre, double precio, String talle, String color){
        super(codigo, nombre, precio);
        if (talle == null || talle.isBlank()) {
            throw new IllegalArgumentException("Talle no valido");
        }
        if (color == null || color.isBlank()){
            throw new IllegalArgumentException("Color no valido");
        }
    this.talle = talle;
    this.color = color;
    }

@Override
public double getPrecioFinal(){
    return this.getPrecio() * (1 + IVA);
}

@Override
public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("El talle de la indumentaria es: "+ talle);
    System.out.println("El color de la indumentaria es: "+ color);
}

}
