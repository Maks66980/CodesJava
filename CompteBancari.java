import java.util.Scanner;
class Acount {
    private String id;
    private String name;
    private int balance;
    //Scanner input = new Scanner(System.in);

    public Acount(String id, String name) {
        this.id = id;
        this.name = name;

    }
    public Acount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
   public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void credit(int amount) {
        balance += amount;
    }
    public int debit(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.printf("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Acount another, int amount) {
        if (balance >= amount) {
            balance -= amount;
            another.balance += amount;
        } else {
            System.out.printf("Amount exceeded balance");
        }
        return balance;
    }
     public String toString() {
        return "Acount[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}

public class CompteBancari {
    public static void main(String[] args) {
        Acount ac1 = new Acount("1","john",122);
        System.out.printf("%s\n", ac1);/**To string */
        Acount ac2 = new Acount("2","michael");/**default balance */
        System.out.printf("%s\n", ac2);

        /**Test Geters */
        System.out.printf("ID: %s\n",ac1.getId());
        System.out.printf("Name: %s\n",ac1.getName());
        System.out.printf("Balance: %d\n",ac1.getBalance());

        /** Test Credit() and Debit() */
        ac1.credit(100);
        System.out.printf("ID: %s, name: %s, Balance after credit: %d\n", ac1.getId(), ac1.getName(), ac1.getBalance());
        ac1.debit(50);
        System.out.printf("ID: %s, name: %s, Balance after debit: %d\n", ac1.getId(), ac1.getName(), ac1.getBalance());
        ac1.debit(200); /**debit amount exceeds balance */
        System.out.printf("\nID: %s, name: %s, Balance after debit: %d\n", ac1.getId(), ac1.getName(), ac1.getBalance());

        /** Test transferTo() */
        ac1.transferTo(ac2, 100);
        System.out.printf("ID: %s, name: %s, Balance after transfer: %d\n", ac1.getId(), ac1.getName(), ac1.getBalance());
        System.out.printf("ID: %s, name: %s, Balance of recipient: %d\n", ac2.getId(), ac2.getName(), ac2.getBalance());

    }
}