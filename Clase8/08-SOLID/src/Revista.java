public class Revista extends Publicacion {
    private final String tipo;
    private final int numero;

    public Revista (String titulo, String autor, int anio, String tipo, int numero){
        super (titulo, autor, anio);
        if (tipo == null || tipo == "Libro" || tipo.isBlank()){
            throw new IllegalArgumentException("Tiene que ser Revista.");
        }
        if (numero <= 0) {
            throw new IllegalArgumentException("Las ediciones de las revistas comienzan a partir del numero 1.");
        }
    this.tipo = tipo;
    this.numero = numero;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getNumero(){
        return this.numero;
    }    
}
