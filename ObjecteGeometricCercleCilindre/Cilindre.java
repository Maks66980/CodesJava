public class Cilindre extends GeometricObject{
    private double radius;
    private double height;
    
    public Cilindre(){
        
    }
    public Cilindre(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public Cilindre(double radius, double height, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
        this.height = height;
    }
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
    
    public double getVolume(){
        return Math.PI * radius * radius * height;
    }
    public void printCilindre(){
        System.out.printf("The cilindre is created %s and the radius is %.2f and the height is %.2f%n", getDateCreated(), radius, height);
    }
}