package user;

public class Usuario {

    String nombre, apellido, hobbie, editorCodigo, sistemaOperativo;
    int edad;

    public Usuario(String nombre, String apellido, int edad, String hobbie, String editorCodigo, String sistemaOperativo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editorCodigo = editorCodigo;
        this.sistemaOperativo = sistemaOperativo;
    }

    public void mostrarDatos() {
        System.out.println(""
                + "Su nombre es: " + nombre
                + "\nSu apellido es: " + apellido
                + "\nSu edad es: " + edad
                + "\nSu hobbie es: " + hobbie
                + "\nSu editor de código favorito es: " + editorCodigo
                + "\nEl sistema operativo que utiliza es: " + sistemaOperativo
        );
    }

}
