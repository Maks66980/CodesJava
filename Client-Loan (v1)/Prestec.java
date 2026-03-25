public class Prestec {
    private Client client;
    private String nom;
    private double quantitatTotal;
    private int durada;

    public Prestec(Client client, String nom, double quantitatTotal, int durada) {
        this.client = client;
        this.nom = nom;
        this.quantitatTotal = quantitatTotal;
        this.durada = durada;
    }
    public double getQuantitatTotal() {
        return quantitatTotal;
    }
    public void setQuantitatTotal(double quantitatTotal) {
        this.quantitatTotal = quantitatTotal;
    }

    public int getDurada() {
        return durada;
    }
    public void setDurada(int durada) {
        this.durada = durada;
    }

    public Client getClient() {
        return client;
    }
    
}