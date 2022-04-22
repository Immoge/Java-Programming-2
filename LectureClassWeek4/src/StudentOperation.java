
import java.util.Scanner;


public class StudentOperation {
     public char calculateGrade(double mark){
        
         char grade;
         if( mark >= 80 && mark<= 100)
            grade = 'A';
        else if ( mark >= 70 && mark<= 79.99)
            grade = 'B';
        else if ( mark >= 60 && mark<= 69.99)
            grade = 'C';
        else if ( mark >= 50 && mark<= 59.99)
            grade = 'D';
        else if ( mark >= 0 && mark<= 49.99)
            grade = 'F';    
        else //mark more than 100 || mark < 0 
            grade = 'u'; // u = invalid mark
         return grade;
     }//calculateGrade();
    
    public String getMessage(char grade){
        String message;
        switch(grade){
            case 'A': 
                message = "Excellent";
                break;
            case 'B': 
                message = "Good";
                break;
            case 'C': 
                message = "Moderate";
                break;
            case 'D': 
                message = "Low";
                break;
            case 'F': 
                message = "Fail";
                break;
            default: //grade is u 
                message = "Invalid mark";          
        }
        return message;
    }//getMessga();
  
    public void displayMessage(Student stude){
            
        System.out.println("\n A Student Inoformation");
            System.out.println("============================");
            System.out.println("Matric Number = "+ stude.getMatricNumber());
            System.out.println("Student Name = "+  stude.getName());
            System.out.println("Mark = "+  stude.getMark());
            System.out.println("Grade = "+  stude.getGrade());
            System.out.println("Your Message = "+  stude.getMessage() + "\n");
       
    }//displayMessage()
    
    /*public static void main(String[] args) {
        StudentGradingSystem system = new StudentGradingSystem();
        
        for (int i = 0; i < 2; i++) {
        System.out.println("calling inputData()");
        System.out.println("==================");
        system.inputData();
        
        System.out.println("\ncalling calculateGrade()");
        System.out.println("==================");
        system.calculateGrade();
        
        System.out.println("\ncalling GetMessage()");
        System.out.println("==================");
        system.getMessage();
        
        System.out.println("\ncalling displayMessage()\n");
        System.out.println("==================");
        system.displayMessage();
        
        }//end for loop*/
        }//main()       

