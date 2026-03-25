import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String dni;
    private String nom;
    private List<Prestec> prestecs;
    private static final int MAX_PRESTECS = 4;

    public Client(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
        this.prestecs = new ArrayList<>();
    }
     public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Prestec> getPrestecs() {
        return prestecs;
    }
    public void afegirPrestec(Prestec prestec) {
        if (prestecs.size() < MAX_PRESTECS) {
            prestecs.add(prestec);
        } else {
            System.out.printf("El client %s ja té el màxim de préstecs permesos.", dni);
        }
    }
    public void eliminarPrestec(Prestec prestec) {
        prestecs.remove(prestec);
    }
}


