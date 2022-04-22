
public class Product 
{
    private String name;
    private int quantity;
    private double price;
    private double total;

     public Product(String name, int quantity, double price, double total) 
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }//constructor

    //getter and setter 
    public void setTotal(double total) 
    {
        this.total = total;
    }

    public String getName() 
   {
        return name;
    }

    public int getQuantity() 
   {
        return quantity;
    }

    public double getPrice() 
    {
        return price;
    }

    public double getTotal() 
    {
        return total;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
}//class Product
