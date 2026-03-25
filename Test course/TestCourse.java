import java.util.Scanner;
public class TestCourse {
    public static void main(String[] args) {
        Course M1 = new Course("Programacion");
        Scanner input = new Scanner(System.in);
        int opcio;
        do{
            System.err.printf("Que quieres hacer? Opciones:\n1. Matricularse \n2. Desmatricularse\n3. Mostrar alumnos\n4.Salir\n");
            opcio = input.nextInt();
            switch (opcio){
                case 1:
                    System.out.printf("Introduce el nombre del alumno a matricular:");
                    String alumnoMatricular = input.next();
                    M1.matricularse(alumnoMatricular);
                    break;
                case 2:
                    System.out.printf("Introduce el nombre del alumno a desmatricular:");
                    String alumnoDesmatricular = input.next();
                    M1.desmatricularse(alumnoDesmatricular);
                    break;
                case 3:
                    M1.mostrarAlumnos();
                    break;
                case 4:
                    System.out.printf("Saliendo...");
                    break;
                default:
                    System.out.printf("Opción no válida. Intente de nuevo.");
            }
        }while (opcio !=4);
    }
}