
import java.util.Scanner;
public class ProductUserInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductOperation operation;
        int quantity;
        String productName;
        double price, total, discountAmount, netPrice ;
        Product product;
        
        
        System.out.print("How many product do you want to buy = ");
        int noOfProduct = input.nextInt();
        operation = new ProductOperation(noOfProduct);
        System.out.println("");
        
        for (int i = 0; i < noOfProduct; i++) {
            System.out.println("Product = "+ (i+1));
            System.out.println("================");
            System.out.print("Please enter the product name = ");
            productName = input.next()+input.nextLine();
            System.out.print("Please enter the quantity = ");
            quantity = input.nextInt();
            System.out.print("Please enter the price per product = ");
            price = input.nextDouble();
            System.out.println("");
            product = new Product(productName,quantity,price);
            operation.saveProduct(i,product);
            
        }//for loop
            operation.calculateProductAmount();
            total = operation.calculateTotalAmount();
            discountAmount = operation.calculateDiscount(total);
            netPrice = total - discountAmount;
            operation.displayAllProduct();
            
            System.out.printf("The total amount = %.2f%n" , total);
            System.out.printf("The entitled discount = %.2f%n" , discountAmount);
            System.out.printf("The Net price = %.2f%n" , netPrice);           
    } // method main 

} // class ProductUserInterface

