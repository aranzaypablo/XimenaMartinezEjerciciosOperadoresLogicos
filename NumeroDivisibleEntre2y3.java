package numerodivisibleentre2y3;
import java.util.Scanner;

public class NumeroDivisibleEntre2y3 {

    public static void main(String[] args) {
        //Ximena Martinez
        //Inicializar variables
        int numero;
        int operacion1;
        int operacion2;
        
        System.out.println("Programa que te dice si un número es divisible entre 2 y 3");
        // Solicitar al usuario el número que se va a tratar
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el número que deseas comprobar: ");
        numero = teclado.nextInt();
        
        //Hacer las comprobaciones
        operacion1 = numero % 2;
        operacion2 = numero % 3;
        
        if (operacion1==0){
            if (operacion2==0) {
                System.out.println(numero + " es divisible entre 2 y 3");
            }else { 
                System.out.println(numero + " es divisible entre 2 pero no entre 3");
            }
        }else
            if (operacion2==0){
                System.out.println(numero + " es divisible entre 3 pero no entre 2");
            }else {
                System.out.println(numero +" no es divisible entre 2 o 3");
            }
        }  
}
