package verificasicadenatienejavaynopython;
import java.util.Scanner;

public class VerificaSiCadenaTieneJavaYNoPython {

    public static void main(String[] args) {
        // Ximena Martinez
        //Inicializar variables
        String cadena;
        
        System.out.println("Programa que verifica si una cadena de texto contiene la palabra Java y no contiene la palabra Python");
        //leer la cadena
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cadena de texto a evaluar");
        cadena = teclado.nextLine();
        
        //Validar
        if (cadena.contains("Java") && cadena.contains("Python")==false){
            System.out.println("La cadena ingresada contiene Java, pero no Python");
        }else if (cadena.contains("Java") && cadena.contains("Python")){
            System.out.println("La cadena ingresada contiene Java y Python");
        }else {
            System.out.println("La cadena ingresada no contiene ni Java ni Python");
        }
    }
    
}
