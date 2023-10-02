package numeromenora50omayora100;
import java.util.Scanner;

public class NumeroMenorA50OMayorA100 {
    
    public static void main(String[] args) {
        // Ximena Martinez
        // Inicializar variables
        int numero;
        
        System.out.println("Programa que verifica si un número es menor que 50 o mayor que 100");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el número a evaluar: ");
        numero = teclado.nextInt();
        
        //Validación
        if (numero<50){
            System.out.println(numero + " es menor a 50");
        }else if (numero>100){
            System.out.println(numero + " es mayor a 100");
        }else{
            System.out.println(numero + " no es un número válido, se encuentra en el rango de 50-100");
        }
    }
    
}
