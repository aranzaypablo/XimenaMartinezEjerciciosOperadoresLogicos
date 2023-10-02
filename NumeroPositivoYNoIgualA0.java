package numeropositivoynoiguala0;
import java.util.Scanner;

public class NumeroPositivoYNoIgualA0 {
    
    public static void main(String[] args) {
        // Ximena Martinez
        //Inicializar variables
        int numero;
        
        System.out.println("Programa que comprueba si un número es positivo y no es igual a cero");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Igresa el número a comprobar: ");
        numero = teclado.nextInt();
        
        //validar
        if (numero>0){
            System.out.println(numero + " es positivo y diferente a cero");
        }else {
            System.out.println(numero + " es igual o menor a cero");
        }
    }
    
}
