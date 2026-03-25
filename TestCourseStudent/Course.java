import java.util.ArrayList;

public class Course {
    private String CourseName;
    private String CourseCode;
    private ArrayList<Estudiante> alumnos;

    public Course(String courseName, String courseCode) {
        this.CourseName = courseName;
        this.CourseCode = courseCode;
        this.alumnos = new ArrayList<>();
    }

    public void matricularse(Estudiante estudiante){
        if (estudiante.getCurso() != null) {
            System.out.printf("El estudiante %s ya está matriculado en el curso %s (%s).\n", 
                              estudiante.getNombre(), estudiante.getCurso().getCourseName(), estudiante.getCurso().getCourseCode());
            return;
        }
        alumnos.add(estudiante);
        estudiante.setCurso(this);
        System.out.printf("El estudiante %s se ha matriculado en el curso %s (%s).\n", 
                          estudiante.getNombre(), CourseName, CourseCode);
    }

    public void desmatricularse(Estudiante estudiante){
        if(alumnos.contains(estudiante)){
            alumnos.remove(estudiante);
            estudiante.setCurso(null);
            System.out.printf("El estudiante %s se ha desmatriculado del curso %s (%s).\n", 
                              estudiante.getNombre(), CourseName, CourseCode);
        } else {
            System.out.printf("El estudiante %s no está matriculado en el curso %s (%s).\n", 
                              estudiante.getNombre(), CourseName, CourseCode);
        }
    }

    public void mostrarAlumnos(){
        System.out.printf("Alumnos matriculados en el curso %s (%s):\n", CourseName, CourseCode);
        if(alumnos.isEmpty()){
            System.out.println("  (ninguno)");
        } else {
            for (Estudiante alumno : alumnos) {
                System.out.println("- " + alumno); 
            }
        }
    }

    public ArrayList<Estudiante> getAlumnos() {
        return alumnos;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }
}