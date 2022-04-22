
package studentgradingsystem;
import java.util.Scanner;
public class StudentGradingSystem 
{
    public static void main(String [] args)
    { 
        int matricNumber = 0;
        String name = "";
        double mark = 0.0;
        char grade;
        String message;
        
        Scanner input = new Scanner(System.in);
        for (int i=0; i < 1; i++)
        { 
            System.out.print("Input your matric number = ");
            matricNumber = input.nextInt();
            
            System.out.print("Input your name = ");
            name = input.next()+input.nextLine();
            
            System.out.print("Input your mark = ");
            mark = input.nextDouble();
        }  
                    
            if (mark >=80 && mark<=100)
                grade = 'A';
            else if (mark >=70 && mark<=79.99)
                grade = 'B';
            else if (mark >=60 && mark<=69.99)
                grade = 'C';
            else if (mark >=50 && mark<=59.99)
                grade = 'D';
            else if (mark >=0 && mark<=49.99)
                grade = 'F';
            else //  marks > 100 and mark < 0
                grade = 'u'; // u is invalid mark
            

            switch(grade)
            {
                case 'A': 
                    message = "excellent";
                    break;
                case 'B': 
                    message = "Good";
                    break;
                case 'C': 
                    message = "moderate";
                    break;
                case 'D': 
                    message = "low";
                    break;
                case 'F': 
                    message = "bad";
                    break;  
                default:  // grade = u
                    message = "Invalid mark";
                 
            }
            
  
            System.out.println("");
            System.out.println("A list of Students");
            System.out.println("==================");
            System.out.println("Your Matric number = "+matricNumber);
            System.out.println("Your name = "+name);
            System.out.println("Your mark = "+mark);
            System.out.println("Your grade = "+grade);
            System.out.println("Your Message = "+message);
            
            System.out.println("");
        }
    }
