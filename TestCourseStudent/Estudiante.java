public class Estudiante {
    private String nombre;
    private Course curso;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.curso = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Course getCurso() {
        return curso;
    }

    public void setCurso(Course curso) {
        this.curso = curso;
    }

    public String toString() {
        return nombre;
    }
}