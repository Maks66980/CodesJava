import java.util.Scanner;

public class TestCourseStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course M1 = new Course("Matemáticas", "MAT101");
        int opcion;
        String nombreAlumno;

        do {
            System.out.printf("\nQue desea hacer?\n");
            System.out.printf("1. Matricularse\n");
            System.out.printf("2. Desmatricularse\n");
            System.out.printf("3. Mostrar alumnos\n");
            System.out.printf("4. Salir\n");
            System.out.printf("Opción: ");
            opcion = input.nextInt();
            input.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.printf("Introduce el nombre del alumno a matricular: ");
                    nombreAlumno = input.nextLine();
                    Estudiante alumnoMatricular = new Estudiante(nombreAlumno);
                    M1.matricularse(alumnoMatricular);
                    break;

                case 2:
                    System.out.printf("Introduce el nombre del alumno a desmatricular: ");
                    nombreAlumno = input.nextLine();
                    Estudiante alumnoEncontrado = null;
                    for (Estudiante s : M1.getAlumnos()) {
                        if (s.getNombre().equals(nombreAlumno)) {
                            alumnoEncontrado = s;
                            break;
                        }
                    }
                    if (alumnoEncontrado != null) {
                        M1.desmatricularse(alumnoEncontrado);
                    } else {
                        System.out.printf("El estudiante %s no está matriculado en el curso %s.\n",
                                nombreAlumno, M1.getCourseName());
                    }
                    break;

                case 3:
                    M1.mostrarAlumnos();
                    break;

                case 4:
                    System.out.printf("Saliendo...\n");
                    break;
                default:
                    System.out.printf("Opción no válida.\n");
            }

        } while (opcion != 4);

        input.close();
    }
}