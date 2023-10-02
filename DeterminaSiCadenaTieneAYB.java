package determinasicadenatieneayb;
import java.util.Scanner;

public class DeterminaSiCadenaTieneAYB {
    public static void main(String[] args) {
        // Ximena Martinez
        //Inicializar variables
        String cadena;
        
        System.out.println("Programa que determina si una cadena de texto contiene la letra a y la letra b");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cadena de texto a evaluar: ");
        cadena = teclado.nextLine();
        
        //Validar
        if (cadena.contains("a") && cadena.contains("b")){
            System.out.println("La cadena de texto ingresada SI contiene a y b");
        }else {
            System.out.println("La cadena de texto ingresada NO contiene a y b");
        }
    }
    
}
