
class Empleat {
    private int id;
    private String nom;
    private String cognom;
    private int salari;

    public Empleat(int id, String nom, String cognom, int salari) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.salari = salari;
    }
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
        
    }
    public String getCognom(){
        return cognom;
    }
    public String getName(){
        return nom + " " + cognom;
    }
    public int getSalari(){
        return salari;
    }
    public void SetSalari(int salari){
        this.salari = salari;
    }
    public int getAnualSalari(){
        int anualSalari = salari * 12;
        return anualSalari;
    }
    public int augmentarSalary(int parcentatge){
        int augment = salari * parcentatge / 100;
        salari += augment;
        return salari;
    }
    public String toString(){
        return "Empleat[" + "id=" + id + ", nom=" + nom + ", cognom=" + cognom + ", salari=" + salari + "]";
    }
}


public class TestEmpleat {
    public static void main(String[] args){
        /**Test constructor and to string */
        Empleat emp1 = new Empleat(1, "Maksym", "Samodurov", 1500);
        System.out.printf("\n %s", emp1.toString());

        /**Test Geters and Seters */
        emp1.SetSalari(2000);
        System.out.printf("\n %s", emp1.toString());
        System.out.printf("\n id is: %s  ", emp1.getId());
        System.out.printf("\n nom is: %s  ", emp1.getNom());
        System.out.printf("\n cognom is: %s  ", emp1.getCognom());
        System.out.printf("\n salari is: %s  ", emp1.getSalari());

        System.out.printf("\n Nombre is: %s  ", emp1.getName());
        System.out.printf("\n Anual Salari is: %s  ", emp1.getAnualSalari());

        /**Test augment Salary */
        System.out.printf("\n Augmented Salary is: %s  ", emp1.augmentarSalary(10));
        System.out.printf("\n %s", emp1.toString());
        /**ESCRITO POR MAKSYM SAMODUROV */

    }
}