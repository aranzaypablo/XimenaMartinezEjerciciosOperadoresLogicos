package numeromayora10ymenora20;
import java.util.Scanner;

public class NumeroMayorA10YMenorA20 {
    public static void main(String[] args) {
        //Ximena Martinez
        // Inicializar variables
        int numero;
        
        System.out.println("Programa que comprueba si un número es mayor a 10 y menor a 20");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el número a comprobar: ");
        numero = teclado.nextInt();
        
        //Corroborar la información
        if (numero>10 && numero<20){
            System.out.println(numero + " es mayor a 10 y menor a 20 ");
        }else {
            System.out.println(numero + " no es mayor a 10 y menor a 20 ");
        }
    }
    
}
