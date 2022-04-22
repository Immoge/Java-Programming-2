
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class CustomerGUI 
{
    public static void main(String[] args) 
    {
        String customerName, customerType, customerPhoneNumber, bookingDay;
        int numOfCourts, numOfHours;
        double totAmount; // totalAmount
        Customer cust; // cust means customer
        boolean isContinue = true;
        
        Scanner input = new Scanner(System.in);
        CustomerOperation operation = new CustomerOperation();
        
        while (isContinue)
        {
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

            totAmount = operation.calculateRentalAmount(bookingDay,numOfCourts, numOfHours );

            // public Customer(String custName, String custType, String customerPhoneNumber, String bookingDay, int numOfCourts, int numOfHours, double totalAmount) 
            // to store data into an object of customer
            cust = new Customer(customerName,customerType,customerPhoneNumber,bookingDay,numOfCourts, numOfHours,totAmount);
            System.out.println("");
            operation.displayReceipt(cust);
            
            System.out.print("\n Do you want to continue to input customer information  (yes/ no) = ");
            String answer = input.next();
            
            if (answer.equalsIgnoreCase("yes"))
                isContinue = true;
            else 
                isContinue = false;
        } // 
            
        System.out.println("\nThanks for using this system");
        
        
    }// main method
} // class CustomerGUI
