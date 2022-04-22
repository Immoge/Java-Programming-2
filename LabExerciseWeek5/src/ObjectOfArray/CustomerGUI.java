package ArrayOfObject;
import java.util.Scanner;

 
public class CustomerGUI 
{
    public static void main(String[] args)
    {
        String customerName, customerType, bookingDay, customerPhoneNumber;
        int numOfCourt, numOfHours;
        double totalAmount;
        boolean isContinue = true;
        int index = -1;
        Customer cust;// Cust = customer (reference variable)
        Scanner input = new Scanner (System.in);
        CustomerOperation operation = new CustomerOperation();
        
        while(isContinue){
        System.out.print("Input Customer Name: ");
        customerName = input.next()+input.nextLine();
        
        System.out.print("Input Customer Type (Student/Staff): ");
        customerType = input.next();
        
        System.out.print("Input Customer Phone Number: ");
        customerPhoneNumber = input.next();
        
        System.out.print("Input Customer Booking Day: ");
        bookingDay = input.next();
        
        System.out.print("Input Customer Number of Courts: ");
        numOfCourt = input.nextInt();

        System.out.print("Input Customer Number of Hours: ");
        numOfHours = input.nextInt();         
    
        totalAmount = operation.calculateRentalAmount(bookingDay,numOfCourt,numOfHours);
        
        //Customer(String customerName, String customerType, String customerPhoneNumber, String bookingDay, int numOfCourt, int numOfHours, double totalAmount)
        // to store data into an object of customer
        cust = new Customer(customerName, customerType, customerPhoneNumber, bookingDay, numOfCourt, numOfHours, totalAmount);
        index++;
        operation.addCustomerRecord(cust, index);
       
        System.out.println("");
        operation.displaySingleReceipt(cust);
        
        System.out.println("\nDo u want to continue to input customer information = (yes/no) ");
        String answer = input.next();
        
        if(answer.equalsIgnoreCase("yes" )) 
            isContinue = true;
        else 
            isContinue = false;          
                
    }//while loop    
        System.out.println("Display all records when there is no customer");
        operation.displayAllCustomerRecords();            
        System.out.println("\nThanks for using this system");
    }//main method
}// class CustomerGUI