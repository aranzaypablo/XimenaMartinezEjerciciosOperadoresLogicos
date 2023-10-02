package usuarioycontraseñavalidos;
import java.util.Scanner;

public class UsuarioYContraseñaValidos {

    public static void main(String[] args) {
        //Ximena Martinez
        // Inicializar variables
        String usuario;
        String usuarioC="user";
        String contrasena;
        String contrasenaC="pass";
        System.out.println("Programa que determina si un usuario ha ingresado un nombre de usuario y una\n" +
            "contraseña válidos.");
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa el nombre de usuario");
        usuario = teclado.nextLine();
        System.out.println("Ingresa la contraseña");
        contrasena = teclado.nextLine();
        System.out.println(usuario + contrasena);

        if (usuario.equals("user") && contrasena.equals("pass")){
            System.out.println("El usuario y contraseña ingresados fueron correctos ¡Bienvenido!");
        }else {
            System.out.println("El usuario o contraseña ingresados son incorrectos");
        }
    }
    
}
