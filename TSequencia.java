import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Seqüència {
    private int[] vector;
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    /** Constructor per defecte (llargada 5) */
    Seqüència() {
        vector = new int[5];
    }

    /** Configurar llargada del vector */
    void configurarLlargada() {
        System.out.print("Llargada del vector: ");
        int llargada = input.nextInt();
        input.nextLine(); // consumir salt de línia
        vector = new int[llargada];
    }

    /** Introduir valors manualment */
    void introduirValors() {
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Valor %d: ", i + 1);
            vector[i] = input.nextInt();
        }
        input.nextLine(); // consumir newline restant
    }

    /** Assignar valors aleatoris */
    void assignarAleatoris(int max, int min) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = min + random.nextInt(max);
        }
    }

    /** Assignar un valor a una posició concreta */
    void setValor(int pos, int val) {
        if (pos >= 0 && pos < vector.length) {
            vector[pos] = val;
        } else {
            System.out.printf("Posició fora de límit: %d%n", pos);
        }
    }

    /** Retorna el valor d'una posició concreta */
    int getValor(int pos) {
        if (pos >= 0 && pos < vector.length) {
            return vector[pos];
        } else {
            System.out.printf("Posició fora de límit: %d%n", pos);
            return Integer.MIN_VALUE;
        }
    }

    /** Mostra el contingut complet del vector */
    void mostrarContingut() {
        System.out.println(Arrays.toString(vector));
    }

    /** Comprova seqüències de 3 elements consecutius ascendent */
    int comptarSeqAscendent() {
        int comptador = 0;
        for (int i = 0; i < vector.length - 2; i++) {
            if (vector[i] < vector[i + 1] && vector[i + 1] < vector[i + 2]) {
                comptador++;
            }
        }
        return comptador;
    }

    /** Comprova seqüències de 3 elements consecutius descendent */
    int comptarSeqDescendent() {
        int comptador = 0;
        for (int i = 0; i < vector.length - 2; i++) {
            if (vector[i] > vector[i + 1] && vector[i + 1] > vector[i + 2]) {
                comptador++;
            }
        }
        return comptador;
    }

    /** Menu per assignar valors manual o aleatoris */
    void menu() {
        System.out.print("Vols introduir els valors del vector? (s/n): ");
        String resposta = input.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            introduirValors();
        } else {
            System.out.println("S'assignaran valors aleatoris.");
            assignarAleatoris(100, 10);
        }
    }

    /** Menu opcional per canviar un valor o llegir-lo */
    void menu2() {
        System.out.print("Vols introduir o llegir un valor en una posició? (s/n): ");
        String resposta = input.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Opció (1: Introduir valor, 2: Llegir valor): ");
            int opcio = input.nextInt();
            input.nextLine(); // consumir newline
            if (opcio == 1) {
                System.out.print("Posició: ");
                int pos = input.nextInt();
                System.out.print("Valor: ");
                int val = input.nextInt();
                input.nextLine();
                setValor(pos, val);
            } else if (opcio == 2) {
                System.out.print("Posició: ");
                int pos = input.nextInt();
                input.nextLine();
                int valor = getValor(pos);
                System.out.println("Valor llegit: " + valor);
            } else {
                System.out.println("Opció no vàlida.");
            }
        }
    }
}


public class TSequencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Seqüència vector = new Seqüència();

        System.out.print("Vols canviar la llargada del vector? (s/n): ");
        String resposta = input.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            vector.configurarLlargada();
        } else {
            System.out.println("S'utilitzarà la llargada per defecte (5).");
        }

        vector.menu();
        vector.menu2();

        System.out.println("Vector final:");
        vector.mostrarContingut();

        // Comptar seqüències
        int asc = vector.comptarSeqAscendent();
        int desc = vector.comptarSeqDescendent();

        System.out.printf("Seqüències ascendents de 3 elements: %d%n", asc);
        System.out.printf("Seqüències descendents de 3 elements: %d%n", desc);
    }
}