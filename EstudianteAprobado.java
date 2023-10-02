package estudianteaprobado;
import java.util.Scanner;

public class EstudianteAprobado {

    public static void main(String[] args) {
        // Ximena Martinez
        // Inicializar varibale
        int calificacion;
        
        System.out.println("Programa que determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o\n" +
                        "igual a 100");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la calificación del alumno bajo el formato 0-100: ");
        calificacion = teclado.nextInt();
        
        //validar
        if (calificacion>=60 && calificacion<=100){
            System.out.println("El alumno aprobó");
        }else if (calificacion>100) {
            System.out.println("La calificación ingresada es inválida, intenta de nuevo");
        }else {
            System.out.println("El alumno reprobó");
        }
    }
    
}
