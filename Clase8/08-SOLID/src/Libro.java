public class Libro extends Publicacion {
    private final String tipo;
    private final int cant_pags;
    private final String descripcion;
    private final String genero;

    public Libro (String titulo, String autor, int anio, String tipo, int cant_pags, String descripcion, String genero){
        super(titulo, autor, anio);
        if (tipo == null || tipo.isBlank() || tipo == "Revista"){
            throw new IllegalArgumentException("Tiene que ser Libro");
        }
        if (cant_pags <= 0){
            throw new IllegalArgumentException("No se puede vender un libro sin páginas.");
        }
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("El libro debe tener una descripcion.");
        }
        if (genero == null || genero.isBlank()){
            throw new IllegalArgumentException("El libro debe tener un genero declarado.");
        }
    
    this.tipo = tipo;
    this.cant_pags = cant_pags;
    this.descripcion = descripcion;
    this.genero = genero;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getCant_pags(){
        return this.cant_pags;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public String getGenero(){
        return this.genero;
    }

    public void mostrarDetalle(){
        super.mostrarDetalle();
        System.out.println("El tipo es:"+ tipo);
        System.out.println("El libro tiene un total de: "+ cant_pags);
        System.out.println(descripcion);
        System.out.println("El libro es de: "+ genero);
    }

}

