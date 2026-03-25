import java.util.ArrayList;

public class Course {
    private String nombre;
    private ArrayList<String> alumnos;

    public Course(String string) {
        this.nombre = string;
        this.alumnos = new ArrayList<>();
    }
    public void matricularse(String alumno) {
            alumnos.add(alumno);
    }
    public void desmatricularse(String alumno) {
 
        
        if (alumnos.contains(alumno)) {

        alumnos.remove(alumno);
        }else {
            System.out.printf("El alumno %s no está matriculado en %s.%n", alumno, nombre);
        }
    }
    public void  mostrarAlumnos() {
        System.out.printf("Alumnos matriculados en %s:%n", nombre);
        for (String alumno : alumnos) {
            System.out.printf("- %s%n", alumno);
        }
    }
}
