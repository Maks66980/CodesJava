import java.util.Scanner;
import java.time.LocalDate;
class Persona {
    private String nom;
    private String cognom1;
    private String cognom2;
    private int anyNaixement;
    private char estatCivil;

    Persona(){
    
    }
    public int getEdatPersona(int anyNaixement){
        int edat,anyActual;
        anyActual = LocalDate.now().getYear();
        edat = anyActual - anyNaixement;
        return edat;

     
    }
    public String ToString(String nom, String cognom1, String cognom2, int anyNaixement, char estatCivil,int edat){
        String dadesPersona;
        dadesPersona = String.format("Nom: %s\nCognom1: %s\nCognom2: %s\n Edat: %d\nAny de Naixement: %d\nEstat Civil: %c", nom, cognom1, cognom2, edat, anyNaixement, estatCivil);
        return dadesPersona;
    }
}
public class TestPersonaV1{
    public static void main(String[] args ){
        Persona persona = new Persona();
        Scanner input = new Scanner(System.in);
        String nom, cognom1, cognom2,dadesPersona;
        int anyNaixement, edat;
        char estatCivil;
        System.out.printf("Introdueix el nom de la persona:");
        nom = input.nextLine();
        System.out.printf("Introdueix el primer cognom de la persona:");
        cognom1 = input.nextLine();
        System.out.printf("Introdueix el segon cognom de la persona:");
        cognom2 = input.nextLine();
        System.out.printf("Introdueix l'any de naixament de la persona:");
        anyNaixement = input.nextInt();
        do{
            System.out.printf("Introdueix l'estat civil de la persona (S per solter/a, C per casat/ada, V per vídu/a, D per divorciat/ada):");
                estatCivil = Character.toUpperCase(input.next().charAt(0));
                if (estatCivil != 'S' && estatCivil != 'C' && estatCivil != 'V' && estatCivil != 'D') {
                    System.out.printf("Entrada no vàlida! Torna-ho a intentar.\n");
                }
        } while (estatCivil != 'S' && estatCivil != 'C' && estatCivil != 'V' && estatCivil != 'D');
        edat = persona.getEdatPersona(anyNaixement);
        dadesPersona = persona.ToString(nom, cognom1, cognom2, anyNaixement, estatCivil, edat);
        System.out.printf("%s", dadesPersona);
        
    }
}