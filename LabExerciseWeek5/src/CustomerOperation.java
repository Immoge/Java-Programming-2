
import java.util.Scanner;
public class CustomerOperation
{
     public double calculateRentalAmount(String bookingDay, int numOfCourt, int numOfHours){
          double totalAmount;
          if(bookingDay.equalsIgnoreCase("Saturday")|| bookingDay.equalsIgnoreCase("Sunday"))
              totalAmount = 15.00 * numOfCourt * numOfHours;
          else
               totalAmount = 10.00 * numOfCourt * numOfHours;     
          return totalAmount;
      }//calculateRentalAmount()
        
      public void displayReceipt(Customer client){
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
}
