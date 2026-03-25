public class TestClientLoan {
    public static void main(String[] args) {
        Client client1 = new Client("12345678A", "Joan");
        for(int i = 0; i < 5; i++) {
            Prestec prestec = new Prestec(1000 + i * 500, 12 + i, client1);
            client1.afegirPrestec(prestec);
            System.out.printf("Préstec %d afegit: Quantitat = %.2f, Durada = %d mesos%n", i + 1, prestec.getQuantitatTotal(), prestec.getDurada());
        }
        System.out.printf("client %s: %s%n", client1.getNom(), client1.getDni());
        System.out.printf("Prestecs Actuals: %d%n", client1.getPrestecs().size());
            for (Prestec prestec : client1.getPrestecs()) {
                System.out.printf("Quantitat: %.2f, Durada: %d mesos%n", prestec.getQuantitatTotal(), prestec.getDurada());
            }
    }
}