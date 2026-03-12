import java.util.Scanner;
import java.time.LocalDate;

class Persona {
    private String nom;
    private String cognom1;
    private String cognom2;
    private int anyNaixement;
    private char estatCivil;
    Scanner input = new Scanner(System.in);

    Persona(){}

    public boolean setNom(String nouNom) {
        boolean canviat = false;
        if (nouNom.length() > (nom != null ? nom.length() : 0)) {
            nom = nouNom;
            canviat = true;
        }
        return canviat;
    }

    public boolean setAnyNaixement(int nouAny) {
        boolean canviat = false;
        if (nouAny >= 1900) {
            anyNaixement = nouAny;
            canviat = true;
        }
        return canviat;
    }

    public int getEdatPersona(int anyNaixement){
        int edat, anyActual;
        anyActual = LocalDate.now().getYear();
        edat = anyActual - anyNaixement;
        return edat;
    }

    public String ToString(String nom, String cognom1, String cognom2, int anyNaixement, char estatCivil,int edat){
        String dadesPersona;
        dadesPersona = String.format(
        "Nom: %s\nCognom1: %s\nCognom2: %s\nEdat: %d\nAny de Naixement: %d\nEstat Civil: %c",
        nom, cognom1, cognom2, edat, anyNaixement, estatCivil);
        return dadesPersona;
    }

    public int menu(){
        int opcio;
        System.out.printf("\n1. Modificar nom\n2. Modificar any de naixement\n3. Mostrar dades de la persona\n4. Sortir\n");
        opcio = input.nextInt();
        return opcio;
    }
}

public class TestPersonaV2{
    public static void main(String[] args ){
        Persona persona = new Persona();
        Scanner input = new Scanner(System.in);

        String nom, cognom1, cognom2, dadesPersona, nouNom;
        int anyNaixement, edat, nouAny;
        char estatCivil;
        int opcio;

        System.out.printf("Introdueix el nom de la persona: ");
        nom = input.nextLine();

        System.out.printf("Introdueix el primer cognom de la persona: ");
        cognom1 = input.nextLine();

        System.out.printf("Introdueix el segon cognom de la persona: ");
        cognom2 = input.nextLine();

        System.out.printf("Introdueix l'any de naixement de la persona: ");
        anyNaixement = input.nextInt();

        do{
            System.out.printf("Introdueix l'estat civil (S,C,V,D): ");
            estatCivil = Character.toUpperCase(input.next().charAt(0));

            if (estatCivil!='S' && estatCivil!='C' && estatCivil!='V' && estatCivil!='D'){
                System.out.printf("Entrada no vàlida!\n");
            }

        }while(estatCivil!='S' && estatCivil!='C' && estatCivil!='V' && estatCivil!='D');

        do{

            opcio = persona.menu();

            if(opcio == 1){
                input.nextLine(); 
                System.out.printf("Introdueix el nou nom: ");
                nouNom = input.nextLine();

                if(persona.setNom(nouNom)){
                    nom = nouNom;
                    System.out.println("Nom modificat correctament");
                } else {
                    System.out.println("El nou nom ha de ser més llarg");
                }
            }

            else if(opcio == 2){
                System.out.printf("Introdueix el nou any de naixement: ");
                nouAny = input.nextInt();

                if(persona.setAnyNaixement(nouAny)){
                    anyNaixement = nouAny;
                    System.out.println("Any modificat correctament");
                } else {
                    System.out.println("L'any ha de ser >= 1900");
                }
            }

            else if(opcio == 3){
                edat = persona.getEdatPersona(anyNaixement);
                dadesPersona = persona.ToString(nom, cognom1, cognom2, anyNaixement, estatCivil, edat);
                System.out.printf("\n%s\n", dadesPersona);
            }

            else if(opcio == 4){
                System.out.println("Sortint del programa...");
            }

        }while(opcio != 4);
    }
}