
public class ProductOperation {
    
    private Product [] products;
    
    public ProductOperation(int nomOfProduct) {
       products = new Product [nomOfProduct];
    }// constructor
    
    public double calculateTotalPrice (int quantity, double price){
        double totalAmount = quantity * price;
        return totalAmount;
    }//calculateTotalPrice()
            
    public void addProduct (Product product, int i){
        products [i] = product;    
    }//addProduct()

    public void displayAllProducts(){
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null){
                System.out.println("Name =  " + products[i].getName());
                System.out.println("Quantity = " + products[i].getQuantity());
                System.out.printf("Price = %.1f%n" , products[i].getPrice());
                System.out.printf("Total = %.1f%n" , products[i].getTotal());
                System.out.println("");
            }//if condition
        }//end for loop
    }//displayAllProducts
   
    public void updateProduct(String oldProductName, String newProductName){
        for (int i = 0; i < products.length; i++) {
            if(products[i].getName().equalsIgnoreCase(oldProductName)){
                products[i].setName(newProductName);
                System.out.println("The product " + oldProductName + " has already been updated successfully to brown rice");
            }else if (i == products.length)
                System.out.println("The product " + oldProductName + " cannot be updated because it does not exist");                  
    }//end for loop
    }//updateProduct()
  
    public void deleteProduct(String target){
        for (int i = 0; i < products.length; i++) {
            if(products[i].getName().equalsIgnoreCase(target)){
                products[i] = null;
                System.out.println("The product of " + target + " has been deleted successfully");
            }
    }//end for loop
    }// deleteProduct()
}//class ProductOperation