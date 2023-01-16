package Part_4.IntroTo_OOP.Part04_07;

public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " +this.quantity + " pcs");
    }
}
