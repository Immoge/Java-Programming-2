
import java.util.Scanner;


public class CustomerOperation 
{
    public void inputCustomerInformation()
    {
        
        
    } // inputCustomerInformation()
    
    public double calculateRentalAmount(String bookingDay,int numOfCourts, int numOfHours )
    {
        double totalAmount;
        
        if (bookingDay.equalsIgnoreCase("saturday") || bookingDay.equalsIgnoreCase("sunday"))
            totalAmount = 15.00 * numOfCourts * numOfHours;
        else
             totalAmount = 10.00 * numOfCourts * numOfHours;
        
        return totalAmount;
    } // calculateRentalAmount()
    
    public void displayReceipt(Customer client)
    {
        
        System.out.println("======================================");
        System.out.println("              Payment Receipt         ");
        System.out.println("======================================");
        System.out.println("Customer name = "+client.getCustomerName());
        System.out.println("Customer type = "+client.getCustomerType());
        System.out.println("Customer Phone Number = "+client.getCustomerPhoneNumber());
        System.out.println("Booked Day = "+client.getBookingDay());
        System.out.println("Number of booked Courts = "+client.getNumOfCourts());
        System.out.println("Number of booked hourse = "+client.getNumOfHours());
        System.out.printf("Total Amount to be paid = %.2f %n",client.getTotalAmount());
    } // displayReceipt()
}
