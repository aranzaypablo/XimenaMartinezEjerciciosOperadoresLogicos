package numeromayora5ymenora100mayora20ymenora30;
import  java.util.Scanner;

public class NumeroMayorA5YMenorA100MayorA20YMenorA30 {

    public static void main(String[] args) {
        // Ximena Martinez
        //Inicializar variable
        int numero;
        
        System.out.println("Programa que comprueba si un número es mayor que 5 y menor que 10 o si es mayor que 20 y\n" +
                        "menor que 30");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el número a comprobar: ");
        numero = teclado.nextInt();
        
        //validar
        if(numero>5 && numero<10){
            System.out.println(numero + " es mayor a 5 y menor a 10");
        }else if (numero>20 && numero<30){
            System.out.println(numero + " es mayor a 20 y menor que 30");
        }else {
            System.out.println("El número ingresado no está dentro de los valores válidos");
        }
    }
    
}
