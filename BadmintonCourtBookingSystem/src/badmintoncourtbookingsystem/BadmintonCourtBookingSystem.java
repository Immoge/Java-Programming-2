//finalAmount = numberOfCourtBooked * numOfHours * 10;
package badmintoncourtbookingsystem;
import java.util.Scanner;
public class BadmintonCourtBookingSystem {
    public String customerName;
    public char customerType;
    public int phoneNumber;
    public String nameOfDay;
    public int numberOfCourtBooked;
    public int numOfHours;
    public int finalAmount;
     
   public void inputData(){
    Scanner input = new Scanner(System.in);
    System.out.println("=================Badminton Court Booking System========================");
    System.out.print("Enter ur name : ");
    customerName = input.next() + input.nextLine();
    System.out.print("Enter customer type (U - UUM Staff , S - Student : ");
    customerType = input.next().charAt(0);
    System.out.print("Enter ur phone number : ");
    phoneNumber = input.nextInt();
    System.out.print("Enter name of day: ");
    nameOfDay = input.next();
    System.out.print("Enter number of court to be booked: ");
    numberOfCourtBooked = input.nextInt();
    System.out.print("Enter number of hours to be booked : ");
    numOfHours = input.nextInt();
}
    
    public void calculateRate(){
        if(nameOfDay.equalsIgnoreCase("Saturday") || nameOfDay.equalsIgnoreCase("Sunday") ){
            finalAmount = numberOfCourtBooked * numOfHours * 15;
        }else
            finalAmount = numberOfCourtBooked * numOfHours * 10;
    }
    
    public void displayReceipt(){
       System.out.println("\n========================================");
       System.out.println("              Payment Receipt             ");
       System.out.println("========================================\n");
       System.out.println("Customer Name: " + customerName);
       System.out.println("Customer Type: " + customerType);
       System.out.println("Phone Number: " + phoneNumber);
       System.out.println("Day Booked: " + nameOfDay);
       System.out.println("Number of Court Booked: " + numberOfCourtBooked);
       System.out.println("Number of Hours Booked: " + numOfHours);
       System.out.println("Total Amount: RM" + finalAmount);
       
    }
    public static void main (String []args){
        BadmintonCourtBookingSystem system = new BadmintonCourtBookingSystem ();
        Scanner input = new Scanner(System.in);
        int answer = 1;
        while(answer == 1){
        system.inputData();
        system.calculateRate();
        system.displayReceipt();
        System.out.print("\nDo u wish to continue? (1 - yes, 0 - No)\n");
        answer = input.next().charAt(0);   
        }
    }
}//BadmintonCourtBookingSystem class 
