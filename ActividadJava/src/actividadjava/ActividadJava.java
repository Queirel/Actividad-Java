/*
* Federico Queirel
 */

package actividadjava;

import java.util.Scanner;
import user.Usuario;

public class ActividadJava {

    public static void main(String[] args) {

        String nombre, apellido, hobbie, editorCodigo, sistemaOperativo;
        int edad;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        nombre = escaner.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido = escaner.nextLine();
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(escaner.nextLine());
        System.out.println("Ingrese su hobbie:");
        hobbie = escaner.nextLine();
        System.out.println("Ingrese su editor de código preferido:");
        editorCodigo = escaner.nextLine();
        System.out.println("Ingrese el sistema operativo que utiliza:");
        sistemaOperativo = escaner.nextLine();

        Usuario newUser = new Usuario(nombre, apellido, edad, hobbie, editorCodigo, sistemaOperativo);

        newUser.mostrarDatos();
    }

}
