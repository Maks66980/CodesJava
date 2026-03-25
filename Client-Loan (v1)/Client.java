public class Client {
    private final String DNI;
    private String nom;
    Prestec prestec;

    public Client(String DNI, String nom) {
        this.DNI = DNI;
        this.nom = nom;
    }
    public String getDNI() {
        return DNI;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Prestec getPrestec() {
        return prestec;
    }
    public void setPrestec(Prestec prestec) {
        this.prestec = prestec;
    }

}


