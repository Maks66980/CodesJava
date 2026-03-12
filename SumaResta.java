import java.util.Scanner;

class SumaiResta {
    private double numA,numB;


    SumaiResta(){
    
    }
    public void setNumA(double num1){
         numA = num1;
        


    }
    public void setNumB(double num2){
        numB = num2;
    }


    public double mesGran(){
         double masGrande;
            if(numA > numB){
                masGrande = numA;
            } else {
                masGrande = numB;
            }
            return masGrande;
    }
    public double mesPetit(){
        double masPequeño;
        if(numA < numB){
            masPequeño = numA;
        } else {
            masPequeño = numB;
        }
        return masPequeño;
    }
    
    public double diferencia(double masGrande, double masPequeño){
         double diferencia;
        diferencia = masGrande - masPequeño;
        return diferencia;
    }
    public double suma(double numA, double numB){
        double suma;
        suma = numA + numB;
        return suma;
    }
}

public class SumaResta{
    public static void main(String[] args) {
        SumaiResta sumaiResta = new SumaiResta();
        Scanner input =new Scanner(System.in);
        double num1, num2,masGrande,masPequeño,diferencia,suma;

            System.out.printf("Introdueix el numero1:");
            num1 = input.nextDouble();
            System.out.printf("Introdueix el numero2:");
            num2 = input.nextDouble();
            sumaiResta.setNumA(num1);
            sumaiResta.setNumB(num2);
            masGrande = sumaiResta.mesGran();
            masPequeño = sumaiResta.mesPetit();
            System.out.printf("El numero mas grande es: %.2f%n", masGrande);
            System.out.printf("El numero mas pequeño es: %.2f%n", masPequeño);
            diferencia = sumaiResta.diferencia(masGrande, masPequeño);
            System.out.printf("La diferencia entre el numero1 y el numero2 es: %.2f%n", diferencia);
            suma = sumaiResta.suma(num1, num2);
            System.out.printf("La suma de los dos numeros es: %.2f%n", suma);
            System.out.printf("Qieres volver a ejecutar el programa? (s/n): ");
            String respuesta = input.nextLine();
            if(respuesta.equalsIgnoreCase("s")){
                main(args);
        
        }
    }
}