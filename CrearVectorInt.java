import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class CrearVectorInt {
    public static void main(String[] args){
        VectorInt vector = new VectorInt();
        vector.configurarLlargada();
        vector.assignarAleatoris(100, 10);
        System.out.printf("Vector aleatori:%n");
        vector.mostrarContingut();

        // els mètodes interactius demanen posició i valor a l'usuari
        vector.setValor(0, 0);           // els arguments no s'usen
        System.out.printf("valor seleccionat = %d%n", vector.getValor(0));

        vector.ordenar();                         // ordenar el vector
        System.out.printf("Vector ordenat:%n");
        vector.mostrarContingut();
    }
}

    class VectorInt {
        int[] vector;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

    /** Constructor per defecte (llargada 5)*/
     VectorInt() {
        vector = new int[5];
    }
    
    /** Configurar la llargada del vector */
    void configurarLlargada() {
        System.out.print("Vols canviar la llargada del vector? (s/n): ");
        String resposta = input.nextLine();
        if (resposta.equals("s")) {
            System.out.print("Introdueix la llargada del vector: ");
            int llargada = input.nextInt();
            input.nextLine(); /**consumir el salto de línea*/
            vector = new int[llargada];
        }else {
            System.out.println("S'utilitzarà la llargada per defecte (5).");
        }
    }

    /** Assignar un valor a una posició concreta amb comprovació */
    void setValor(int pos, int val) {
        System.out.printf("Introdueix la posicio al qual vols accedir: ");
        pos = input.nextInt();
        System.out.printf("Introdueix el valor que vols assignar: ");
        val = input.nextInt();
        if (pos >= 0 && pos < vector.length) {
            vector[pos] = val;
        } else {
            System.out.printf("Posició fora de límit: %d%n", pos);
        }
    }

    /** Retorna el valor d'una posició donada, o Integer.MIN_VALUE si és invàlid */
    int getValor(int pos) {
        System.out.printf("Introdueix la posicio al qual vols accedir: ");
        pos = input.nextInt();
        if (pos >= 0 && pos < vector.length) {
            return vector[pos];
        } else {
            System.out.printf("Posició fora de límit: %d%n", pos);
            return Integer.MIN_VALUE;
        }
    }

    /** Mostra el contingut complet del vector en una sola línia */
    void mostrarContingut() {
        System.out.printf("%s%n", Arrays.toString(vector));
    }

    /** Assigna valors aleatoris amb amplada i mínim especificats */
    void assignarAleatoris(int amplada, int minim) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = minim + random.nextInt(amplada);
        }
    }

    /** Ordena el vector d'enters ascendentment */
    void ordenar() {
        Arrays.sort(vector);
    }

}
