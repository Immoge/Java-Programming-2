
import java.util.Scanner;


/*
    Lab Exercise 2 (Week 03)
    version 2.0 -  while loop 
*/
public class CourtBookingSystemV2 
{
    
    public String customerName;
    public String customerType;
    public String customerPhoneNumber;
    public String bookingDay;
    public int numOfCourts;
    public int numOfHours;
    public double totalAmount;
    
    public void inputCustomerInformation()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input your customer name = ");
        customerName = input.next() + input.nextLine();
        
        System.out.print("Input your customer type (student/ staff) = ");
        customerType = input.next() + input.nextLine();
        
        System.out.print("Input your customer phone number = ");
        customerPhoneNumber = input.next() + input.nextLine();
        
        System.out.print("Input your customer booking day= ");
        bookingDay = input.next() + input.nextLine();
        
        System.out.print("Input your customer number of courts = ");
        numOfCourts = input.nextInt();
        
        System.out.print("Input your customer number of hours = ");
        numOfHours = input.nextInt();
        
    } // inputCustomerInformation()
    
    public void calculateRentalAmount()
    {
        if (bookingDay.equalsIgnoreCase("saturday") || bookingDay.equalsIgnoreCase("sunday"))
            totalAmount = 15.00 * numOfCourts * numOfHours;
        else
             totalAmount = 10.00 * numOfCourts * numOfHours;
            
    } // calculateRentalAmount()
    
    public void displayReceipt()
    {
        
        System.out.println("======================================");
        System.out.println("              Payment Receipt         ");
        System.out.println("======================================");
        System.out.println("Customer name = "+customerName);
        System.out.println("Customer type = "+customerType);
        System.out.println("Customer Phone Number = "+customerPhoneNumber);
        System.out.println("Booked Day = "+bookingDay);
        System.out.println("Number of booked Courts = "+numOfCourts);
        System.out.println("Number of booked hourse = "+numOfHours);
        System.out.printf("Total Amount to be paid = %.2f %n",totalAmount);
    } // displayReceipt()
    
    public static void main(String []  args)
    {
        boolean isContinue = true;
        Scanner scan = new Scanner(System.in);
        
        CourtBookingSystemV2 system = new CourtBookingSystemV2();
        
        while (isContinue)
        {            
            system.inputCustomerInformation();
            system.calculateRentalAmount();
            system.displayReceipt();
            
            System.out.print("\n Do you want to continue to input customer information  (yes/ no) = ");
            String answer = scan.next();
            
            if (answer.equalsIgnoreCase("yes"))
                isContinue = true;
            else 
                isContinue = false;
        
        }
        
        System.out.println("\nThanks for using this system");
        
    } // main()
} // CourtBookingSystem class
