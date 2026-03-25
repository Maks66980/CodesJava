public class TestClientLoan {
    public static void main(String[]args){
        Client client = new Client("13412345A", "John Doe"); 
        Prestec prestec = new Prestec(client, "Personal Loan", 5000.0, 24);
        client.setPrestec(prestec);

        System.out.printf("Client: %s, DNI: %s\n", client.getNom(), client.getDNI());
        System.out.printf("Loan: %s, Amount: %.2f, Duration: %d mesos\n", prestec.getClient().getNom(), prestec.getQuantitatTotal(), prestec.getDurada());
    /**Creado por Maksym Samodurov */
    }
}