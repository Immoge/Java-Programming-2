package ArrayOfObject;
import java.util.Scanner;
public class CustomerOperation
{
        private Customer [] customers;

    public CustomerOperation() {
        customers = new Customer [5];
    }// constructor
    public void addCustomerRecord(Customer custo, int ind){
        customers [ind] = custo;
    }//addCustomerRecord()
    
    public double calculateRentalAmount(String bookingDay, int numOfCourt, int numOfHours){
          double totalAmount;
          if(bookingDay.equalsIgnoreCase("Saturday")|| bookingDay.equalsIgnoreCase("Sunday"))
              totalAmount = 15.00 * numOfCourt * numOfHours;
          else
               totalAmount = 10.00 * numOfCourt * numOfHours;     
          return totalAmount;
      }//calculateRentalAmount()
        
      public void displaySingleReceipt(Customer client){
          System.out.println("============================");
          System.out.println("      Payment Receipt       ");
          System.out.println("============================");
          System.out.println("Customer Name = " + client.getCustomerName());
          System.out.println("Customer Tyoe = " + client.getCustomerType());
          System.out.println("Customer Phone Number = " + client.getCustomerPhoneNumber());
          System.out.println("Booked Day = " + client.getBookingDay());
          System.out.println("Number of Booked Courts = " + client.getNumOfCourt());
          System.out.println("Numebr of Booked Hours = " + client.getNumOfHours());
          System.out.printf("Total Amount to be paid = RM%.2f %n" , client.getTotalAmount());
          
      }//printReceipt()
      
      public void displayAllCustomerRecords(){
          System.out.println("\n\nA list of customer in this month");
          System.out.println("=====================================");
          
          for (int i = 0; i < customers.length; i++) {
              if(customers[i] != null){
                System.out.println("Customer name = " + customers[i].getCustomerName());
                System.out.println("Customer type = " + customers[i].getCustomerType());
                System.out.println("Customer Phone Number = " + customers[i].getCustomerPhoneNumber());
                System.out.println("Booked Day = " + customers[i].getBookingDay());
                System.out.println("Number of booked Courts = " + customers[i].getNumOfCourt());
                System.out.println("Number of booked hourse = " + customers[i].getNumOfHours());
                System.out.printf("Total Amount to be paid = %.2f %n",customers[i].getTotalAmount());
                System.out.println("");                  
              }
          }
          System.out.println("");
      }//displayAllCustomerRecords
     
}

