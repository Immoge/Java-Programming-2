
public class Product {
    private String name;
    private int quantity;
    private double price;
    private double amount;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        
    }//constructor 
    
    //getter method
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }
    //setter method
    public void setAmount(double amount) {
        this.amount = amount;
    }
        
}// class Product
