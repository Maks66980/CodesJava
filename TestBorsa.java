import java.util.Scanner;

class Borsa {
    private String denominacio;
    private double valorDeTancamentPrevi;
    private double preuActual;
    
    public Borsa(String denominacio, double valorDeTancamentPrevi, double preuActual) {
        this.denominacio = denominacio;
        this.valorDeTancamentPrevi = valorDeTancamentPrevi;
        this.preuActual = preuActual;
    }
    Borsa(){

    }
    public String getDenominacio() {
        System.out.println("Introdueix el nom de la empresa:");
        Scanner scanner = new Scanner(System.in);
        denominacio = scanner.nextLine();
        return denominacio;
    }
    public double getValorDeTancamentPrevi() {
        System.out.println("Introdueix el valor de tancament previ:");
        Scanner scanner = new Scanner(System.in);
        valorDeTancamentPrevi = scanner.nextDouble();
        return valorDeTancamentPrevi;
    }
    public double getPreuActual() {
        System.out.println("Introdueix el preu actual:");
        Scanner scanner = new Scanner(System.in);
        preuActual = scanner.nextDouble();
        return preuActual;
    }
    public double getPercentatgeDeCanvi() {
        return ((preuActual - valorDeTancamentPrevi) / valorDeTancamentPrevi) * 100;
    }
}
public class TestBorsa {
    public static void main(String[] args) {
        Borsa borsa = new Borsa();
        String denominacio = borsa.getDenominacio();
        double valorDeTancamentPrevi = borsa.getValorDeTancamentPrevi();
        double preuActual = borsa.getPreuActual();
        double percentatgeDeCanvi = borsa.getPercentatgeDeCanvi();

        System.out.printf("Denominació: %s%n", denominacio);
        System.out.printf("Valor de tancament previ: %.2f%n", valorDeTancamentPrevi);
        System.out.printf("Preu actual: %.2f%n", preuActual);
        System.out.printf("Percentatge de canvi: %.2f%%%n", percentatgeDeCanvi);
    
       
    }
    
}
