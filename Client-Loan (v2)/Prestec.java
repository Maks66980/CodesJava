public class Prestec {
    private double quantitatTotal;
    private int durada;
    private Client client;

    public Prestec(double quantitatTotal, int durada, Client client) {
        this.quantitatTotal = quantitatTotal;
        this.durada = durada;
        this.client = client;
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

