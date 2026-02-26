public class CrearRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.printf("Rectangle 1:%n");
        System.out.printf("Amplada: %.1f%n", rect1.getAmplada());
        System.out.printf("Alçada: %.1f%n", rect1.getAlcada());
        System.out.printf("Àrea: %.1f%n", rect1.getArea());
        System.out.printf("Perímetre: %.1f%n", rect1.getPerimeter());
        
        System.out.printf("%nRectangle 2:%n");
        System.out.printf("Amplada: %.1f%n", rect2.getAmplada());
        System.out.printf("Alçada: %.1f%n", rect2.getAlcada());
        System.out.printf("Àrea: %.2f%n", rect2.getArea());
        System.out.printf("Perímetre: %.2f%n", rect2.getPerimeter());
    }
}

class Rectangle {
    double alçada = 1;
    double amplada = 1;

    Rectangle(double a, double b){
        alçada = a;
        amplada = b;
    }

    double getArea(){
        return alçada * amplada;
    }
    
    double getPerimeter(){
        return 2 * (alçada + amplada);
    }
    
    double getAmplada(){
        return amplada;
    }
    
    double getAlcada(){
        return alçada;
    }
    
}