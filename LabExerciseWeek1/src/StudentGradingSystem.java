import java.util.Scanner;
public class StudentGradingSystem {
    public static void main(String[] args) {
    int matricNumber;
    String studentName,message;
    double mark;
    char grade;
    Scanner input = new Scanner (System.in);
       
        for (int i = 0; i < 2; i++) {
            System.out.print("Input your matric number = ");
            matricNumber = input.nextInt();
            
            System.out.print("Input your name = ");
            studentName = input.next() + input.nextLine();
            
            System.out.print("Input your mark = ");
            mark = input.nextDouble();
            
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
   
            System.out.println("List of Student");
            System.out.println("============================");
            System.out.println("Matric Number = "+ matricNumber);
            System.out.println("Student Name = "+ studentName);
            System.out.println("Mark = "+ mark);
            System.out.println("Grade = "+ grade);
            System.out.println("Your Message = "+ message + "\n");

        } 
        
    }
    
  
    
}
