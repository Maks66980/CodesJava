class InvoiceItem{
    private String id;
    private String desc;
    private int qty;
    private double UnitPrice;

    public InvoiceItem(String id,String description, int quantity, double pricePerItem) {
        this.id = id;
        this.desc = description;
        this.qty = quantity;
        this.UnitPrice = pricePerItem;
    }
    public String getId() {
        return id;
    }

    public String getDescription() {
        return desc;
    }

    public int getQuantity() {
        return qty;
    }
    public void setQuantity(int Quantity) {
        this.qty = Quantity;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }
    public void setUnitPrice(double pricePerItem) {
        this.UnitPrice = pricePerItem;
    }

    public double getTotalPrice() {
        return qty * UnitPrice;
    }
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",UnitPrice=" + UnitPrice + "]";
    }
}

public class ElementDeFactura{
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("A101","Pen Red",888,0.08);
        System.out.printf("\n %s",inv1.toString());

        /**Test Geters and Seters */
        inv1.setQuantity(999);
        inv1.setUnitPrice(0.99);
        System.out.printf("\n %s",inv1.toString());
        System.out.printf("\n id is: %s  ",inv1.getId());
        System.out.printf("\n desc is: %s  ",inv1.getDescription());
        System.out.printf("\n qty is: %s  ",inv1.getQuantity());
        System.out.printf("\n UnitPrice is: %s  ",inv1.getUnitPrice());

        /*Test getTotal */
        System.out.printf("\nThe total is:%f",inv1.getTotalPrice());
        /**ESCRITO POR MAKSYM SAMODUROV */
    }
}