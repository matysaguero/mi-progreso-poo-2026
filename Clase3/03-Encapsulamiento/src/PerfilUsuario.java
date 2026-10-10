// Archivo: PerfilUsuario.java
// Primer borrador de la clase. Funciona, pero no protege nada.

public class PerfilUsuario {

    // TODO 1: pasar los cuatro atributos a private.
    private String nombreUsuario;
    private String nombreCompleto;
    private String email;
    private int anioNacimiento;

    /*  public void mostrarPerfil() {
        
        System.out.println("--- Perfil ---");
        System.out.println("Usuario: " + this.nombreUsuario);
        System.out.println("Nombre completo: " + this.nombreCompleto);
        System.out.println("Email: " + this.email);
        System.out.println("Anio de nacimiento: " + this.anioNacimiento);
    
}
*/

public String getNombreUsuario(){
    return this.nombreUsuario;
    }

public String getNombreCompleto(){
    return this.nombreCompleto;
    }
    
public String getEmail(){
    return this.email;
}

public int getAnioNacimiento(){
    return this.anioNacimiento;
    }
    
public boolean setEmail(String email){
    if (email != null && email.contains("@")) {
        this.email = email;
        return true;
    } else {
        return false;
    }
}

public boolean setNombreUsuario(String nombreUsuario){
    if (nombreUsuario != null && !nombreUsuario.isEmpty()) {
        this.nombreUsuario = nombreUsuario;
        return true;
    } else {
        return false;
    }
}


public boolean setNombreCompleto(String nombreCompleto){
    if (nombreCompleto != null && !nombreCompleto.isEmpty()) {
        this.nombreCompleto = nombreCompleto;
        return true;
    } else {
        return false;
    }
}

public boolean setAnioNacimiento(int anioNacimiento){
    if (anioNacimiento >= 1900 && anioNacimiento <= 2026) {
        this.anioNacimiento = anioNacimiento;
        return true;
    } else {
        return false;
    }
}

public PerfilUsuario(String nombreUsuario, String email) {
    if (!setNombreUsuario(nombreUsuario) || !setEmail(email)) {
     throw new IllegalArgumentException("...");
    } 
}

}
    // TODO 2: escribir un constructor que reciba nombreUsuario y email.
    //         Si alguno de los dos es invalido, cortar con
    //         throw new IllegalArgumentException("...");

    // TODO 3: escribir los getters que hagan falta.

    // TODO 4: escribir solo los setters que tengan sentido, devolviendo boolean.
    //         Ningun setter imprime nada: rechaza el valor y avisa con false.

    // TODO 5: borrar mostrarPerfil(). No es que un metodo no pueda imprimir: es
    //         que en este programa el que decide que mostrar es PruebaPerfil.
    //         Validar los datos es del perfil, mostrarlos es de quien lo usa.

    // Reglas que la clase tiene que hacer cumplir:
    //   a) nombreUsuario no puede ser nulo ni estar vacio, y no cambia nunca.
    //   b) email tiene que contener un '@'.
    //   c) anioNacimiento no puede ser futuro ni anterior a 1900.
    //   d) nombreCompleto no puede ser nulo ni estar vacio.

