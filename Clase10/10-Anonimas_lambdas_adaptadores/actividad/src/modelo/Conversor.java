// Archivo: Conversor.java
// El modelo, tal como quedo en la clase 9. Sabe convertir y nada mas. No importa javax.swing, ni vista, ni
// controlador: se puede usar desde una ventana, desde la consola o desde una
// prueba.

package modelo;

public class Conversor {

    private final double pesosPorDolar;
    private final double pesosPorEuro;
    private final double pesosPorReal;

    public Conversor(double pesosPorDolar, double pesosPorEuro, double pesosPorReal) {
        if (pesosPorDolar <= 0 || pesosPorEuro <= 0 || pesosPorReal <= 0) {
            throw new IllegalArgumentException("La cotizacion debe ser mayor que cero");
        }
        this.pesosPorDolar = pesosPorDolar;
        this.pesosPorEuro = pesosPorEuro;
        this.pesosPorReal = pesosPorReal;
    }

    public double aDolares(double pesos) {
        if (pesos < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        return pesos / this.pesosPorDolar;
    }

    public double aEuros(double pesos) {
        if (pesos < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        return pesos / this.pesosPorEuro;
    }

    public double aReales(double pesos) {
        if (pesos < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        return pesos / this.pesosPorReal;
    }    
}
