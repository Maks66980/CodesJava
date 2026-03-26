public class TestCercleCilindre {
    public static void main(String[]args){
        Circle circle = new Circle(2.5, "red", true);
        Cilindre cilindre = new Cilindre(2.5, 5.0, "blue", false);
        
        System.out.printf("Circle:");
        circle.printCircle();
        System.out.printf("Area: %.2f%n", circle.getArea());
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());
        System.out.printf("Diameter: %.2f%n", circle.getDiameter());
        
        System.out.printf("\nCilindre:");
        cilindre.printCilindre();
        System.out.printf("Area: %.2f%n", cilindre.getArea());
        System.out.printf("Volume: %.2f%n", cilindre.getVolume());
    }
}