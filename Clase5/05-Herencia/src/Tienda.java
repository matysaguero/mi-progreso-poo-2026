// Archivo: Tienda.java
// El programa que muestra el catalogo. No se modifica, salvo para
// descomentar la parte 3 cuando el enunciado lo indique.

public class Tienda {

    public static void main(String[] args) {
        System.out.println("--- Catalogo de la tienda ---");

        Libro libro = new Libro("LIB-001", "Java How to Program", 50000, "Deitel", "978-0134743356");
        Electronico notebook = new Electronico("ELE-001", "Notebook 14 pulgadas", 1750000, "Asus", 24);

        System.out.println();
        libro.mostrarDetalle();

        System.out.println();
        notebook.mostrarDetalle();

        // ----- Parte 3: el producto nuevo -----
        // Descomentar cuando Alimento.java exista.

        /*
        Alimento yerba = new Alimento("ALI-001", "Yerba organica 1kg", 8500, "2027-03-01");

        System.out.println();
        yerba.mostrarDetalle();
        */
    }
}
// Respuestas: 
// 1. El error está en electrónico, y el compilador no podría avisar nada ya que el error
// está dentro de un String que se está imprimiendo.
// 2. Los atributos y métodos que son idénticos entre las clases Electronico y Libro son:
// Código, Nombre y Producto; Los getters de cada uno y el comportamiento mostrarDetalle()
// 3. Y apróximadamente habría que copiar y pegar unas 20 líneas o más de código aproximadamente.