package numeromultiplode3ynode5;
import java.util.Scanner;

public class NumeroMultiploDe3YNoDe5 {

    public static void main(String[] args) {
        //Ximena Martinez
        // Inicialiar variables
        int numero;
        
        System.out.println("Programa que comprueba si un número es multiplo de 3 y no de 5");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el número para la comprobación: ");
        numero = teclado.nextInt();
        
        //Validación
        if (numero%3==0 && numero%5!=0) {
            System.out.println("El número ingresado es multiplo de 3 y no de 5");
        }else if (numero%3==0 && numero%5==0){
            System.out.println("El número ingresado es multiplo de 3 y de 5");
        }else {
        System.out.println("El número ingresado no es multiplo ni de 3 ni de 5");
        }
        
        
    }
    
}
