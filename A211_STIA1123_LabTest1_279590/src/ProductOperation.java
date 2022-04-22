
public class ProductOperation {

    private Product [] products;
    
    public ProductOperation(int noOfProduct)
    {
        products = new Product[noOfProduct];    
    }//constructor 
    
    public void saveProduct(int i, Product product)
    {
        products [i] = product ;
    } //saveProduct()
    
    public void calculateProductAmount()
    {
        for (int i = 0; i < products.length; i++) {
            double amount = products[i].getPrice() * products[i].getQuantity();
            products[i].setAmount(amount);
        
      }           
    } //calculateProductAmount()

    public double calculateTotalAmount()
    {
     double totalAmount = 0.0;
     for (int i = 0; i < products.length; i++) {
         if(products[i] != null)
         totalAmount += products [i].getAmount();          
    } // for loop
     return totalAmount; 
    }//calculateTotalAmount()
    
    public double calculateDiscount(double total)
    {
        double totalDiscount = 0.0;
        if(total <= 50)
            totalDiscount = total * 0;
        else if (total >= 50.1 && total <= 100)
            totalDiscount = total * 0.05;
        else if (total >= 100.1 && total <= 200)
            totalDiscount = total * 0.10;    
        else if (total >= 200.1 && total <= 300)
            totalDiscount = total * 0.15;
        else if (total > 300)
            totalDiscount = total * 0.20;      
        
        return totalDiscount;
    } // calculateDiscount()
       
    public void displayAllProduct()
    {
        System.out.println("Item Name                           Price             Quantity               Amount ");
        System.out.println("====================    =================    =================    ================= ");
        for (int i = 0; i < products.length; i++) {
        if(products[i] != null){ 
            System.out.print(products[i].getName() + "\t\t\t\t");
            System.out.printf("%.1f", products[i].getPrice());
            System.out.print("\t\t\t");
            System.out.print(products[i].getQuantity());
            System.out.print("\t\t");
            System.out.printf("%.1f",products[i].getAmount());
            System.out.println("");

        }// if statement       
        }// for loop  
         System.out.println("");
    } // displayAllProduct

} // class ProductOperation

