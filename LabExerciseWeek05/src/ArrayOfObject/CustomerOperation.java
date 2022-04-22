package ArrayOfObject;

import java.util.Scanner;


public class CustomerOperation 
{
    private Customer [] customers;

    public CustomerOperation() 
    {
        customers = new Customer[5]; // index 0, 1, 2, 3, 4
    }
    
    public void addCustomerRecord(Customer custo, int ind)
    {
         customers[ind] = custo;   
    }    
    
    public double calculateRentalAmount(String bookingDay,int numOfCourts, int numOfHours )
    {
        double totalAmount;
        
        if (bookingDay.equalsIgnoreCase("saturday") || bookingDay.equalsIgnoreCase("sunday"))
            totalAmount = 15.00 * numOfCourts * numOfHours;
        else
             totalAmount = 10.00 * numOfCourts * numOfHours;
        
        return totalAmount;
    } // calculateRentalAmount()
    
    // display only one customer in one receipt
    public void displaySingleReceipt(Customer client)
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
    
    public void displayAllCustomerRecords() 
    {
        System.out.println("\n\nA list of customer in this month");
        System.out.println("================================");
        
        for (int i=0; i < customers.length; i++)
        {
            if (customers[i] != null)
            {
                System.out.println("Customer name = "+customers[i].getCustomerName());
                System.out.println("Customer type = "+customers[i].getCustomerType());
                System.out.println("Customer Phone Number = "+customers[i].getCustomerPhoneNumber());
                System.out.println("Booked Day = "+customers[i].getBookingDay());
                System.out.println("Number of booked Courts = "+customers[i].getNumOfCourts());
                System.out.println("Number of booked hourse = "+customers[i].getNumOfHours());
                System.out.printf("Total Amount to be paid = %.2f %n",customers[i].getTotalAmount());
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
