package modelo;

public class Conversor {
    private static final double PESOS_POR_DOLAR = 1450.0;
    private final double pesos;

    public Conversor(double pesos) {
        if (pesos<= 0.0){
            throw new IllegalArgumentException("Monto invalido");
        }
    this.pesos = pesos;
    }

    public double aDolares(double pesos){
        if (pesos <= 0){
            throw new IllegalArgumentException("Monto invalido");
        }
        return (pesos/PESOS_POR_DOLAR);

    }

    public double getPesos(){
        return this.pesos;
    }

}
