
import java.util.Scanner;


public class MainMenu {
    
    public static void main(String[] args) {
        StudentOperation operation = new StudentOperation();
        
        Scanner input = new Scanner (System.in);
        System.out.print("Input your matric number = ");
        int matricValue = input.nextInt();
            
        System.out.print("Input your name = ");
        String nameValue = input.next() + input.nextLine();
        
        System.out.print("Input your mark = ");
        double markValue = input.nextDouble(); // markah = mark
         
        char gradeValue = operation.calculateGrade(markValue);
        
        String messageValue = operation.getMessage(gradeValue);
        // constructor to store one object of student 
        Student stud = new Student(matricValue, nameValue, markValue, gradeValue, messageValue);
        operation.displayMessage(stud);
        
        Student stud2 = new Student(279590, "Jackson Chong", 88, 'A', "Excellent");
        operation.displayMessage(stud2);
    }
    }
    

