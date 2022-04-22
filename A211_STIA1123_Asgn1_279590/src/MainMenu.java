import java.util.Scanner;
public class MainMenu {
    public static void main(String[] args) {
        
        int numOfProduct = 3;
        Scanner input = new Scanner (System.in);
        ProductOperation operation = new ProductOperation(numOfProduct);
        Product product;
        String productName;
        int quantity;
        double pricePerQuantity,totalPrice;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Product ="+(i+1));
            System.out.print("Input product name = ");
            productName = input.next() + input.nextLine();
            System.out.print("Input quantity = ");
            quantity = input.nextInt();
            System.out.print("Input price = ");
            pricePerQuantity = input.nextDouble();
            System.out.println("");
            
            totalPrice = operation.calculateTotalPrice(quantity,pricePerQuantity);
            product = new Product(productName,quantity,pricePerQuantity,totalPrice);
            operation.addProduct(product, i);
        }//end for loop
        
        System.out.println("================= DISPLAYING ALL PRODUCTS==========");
        operation.displayAllProducts();
        
        System.out.println("\n================= UPDATE THE PRODUCT BY ITS NAME ==========");
        operation.updateProduct("fish", "salmon"); // case 1 -  fish is not found
        operation.updateProduct("rice", "brown rice");  // case 2 -rice is found and it is updated
        System.out.println("");
        
        System.out.println("==== DISPLAYING ALL PRODUCT AFTER THE UPDATE PROCESS ======");
        operation.displayAllProducts();
        
        System.out.println("\n================= DELETE THE PRODUCT BY ITS NAME  - DELETE ICE CREAM==========");
        String productToDelete = "ice cream";
        System.out.println("Product to be deleted = "+productToDelete);
        operation.deleteProduct(productToDelete);
        System.out.println("");
                    
        System.out.println("==== DISPLAYING ALL PRODUCT AFTER THE DELETION PROCESS ======");
        operation.displayAllProducts();
        
    } // method main()

        } //class Main Menu
    

