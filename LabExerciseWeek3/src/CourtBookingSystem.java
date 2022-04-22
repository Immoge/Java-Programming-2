
import java.util.Scanner;

//Version1
public class CourtBookingSystem {
   
    public String customerName;
    public String customerType;
    public int customerPhoneNumber;
    public String bookingDay;
    public int numOfCourt;
    public int numOfHours;
    public double totalAmount;
    
    public void inputCustomerInformation(){
        Scanner input = new Scanner (System.in);
        System.out.print("Input Customer Name: ");
        customerName = input.next()+input.nextLine();
        
        System.out.print("Input Customer Type (Student/Staff): ");
        customerType = input.next();
        
        System.out.print("Input Customer Phone Number: ");
        customerPhoneNumber = input.nextInt();
        
        System.out.print("Input Customer Booking Day: ");
        bookingDay = input.next();
        
        System.out.print("Input Customer Number of Courts: ");
        numOfCourt = input.nextInt();

        System.out.print("Input Customer Number of Hours: ");
        numOfHours = input.nextInt();         
    }//inputCustomerInformation()
      public void calculateRentalAmount(){
          if(bookingDay.equalsIgnoreCase("Saturday")|| bookingDay.equalsIgnoreCase("Sunday"))
              totalAmount = 15.00 * numOfCourt * numOfHours;
          else
               totalAmount = 10.00 * numOfCourt * numOfHours;     
          
      }//calculateRentalAmount()
      
      public void displayReceipt(){
          System.out.println("============================");
          System.out.println("      Payment Receipt       ");
          System.out.println("============================");
          System.out.println("Customer Name = " + customerName);
          System.out.println("Customer Tyoe = " + customerType);
          System.out.println("Customer Phone Number = " + customerPhoneNumber);
          System.out.println("Booked Day = " + bookingDay);
          System.out.println("Number of Booked Courts = " + numOfCourt);
          System.out.println("Numebr of Booked Hours = " + numOfHours);
          System.out.printf("Total Amount to be paid = %.2f %n" , totalAmount);
          
      }//printReceipt()
      public static void main(String[] args) {
        CourtBookingSystem system = new CourtBookingSystem();
        system.inputCustomerInformation();
        system.calculateRentalAmount();
        system.displayReceipt();
        
    }//main
}//CourtBookingSystem
