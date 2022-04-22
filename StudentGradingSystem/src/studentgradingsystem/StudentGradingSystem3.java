
package studentgradingsystem;
import java.util.Scanner;
public class StudentGradingSystem3 {

    // declaration of instance variables
    public int matricNumber;
    public String name;
    public double mark;
    public char grade;
    public String message;

    public void inputData() // instance method
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your matric number = ");
        matricNumber = input.nextInt();

        System.out.print("Input your name = ");
        name = input.next() + input.nextLine();

        System.out.print("Input your mark = ");
        mark = input.nextDouble();
    }

    public void calculateGrade() {
        if (mark >= 80 && mark <= 100) {
            grade = 'A';
        } else if (mark >= 70 && mark <= 79.99) {
            grade = 'B';
        } else if (mark >= 60 && mark <= 69.99) {
            grade = 'C';
        } else if (mark >= 50 && mark <= 59.99) {
            grade = 'D';
        } else if (mark >= 0 && mark <= 49.99) {
            grade = 'F';
        } else //  marks > 100 and mark < 0
        {
            grade = 'u'; // u is invalid mark
        }
    }//calculateGrade()

    public void getMessage() {
        switch (grade) {
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

        } // switch (grade)
    } // getMessage()

    public void displayData() {
        System.out.println("A list of Students");
        System.out.println("==================");
        System.out.println("Your Matric number = " + matricNumber);
        System.out.println("Your name = " + name);
        System.out.println("Your mark = " + mark);
        System.out.println("Your grade = " + grade);
        System.out.println("Your Message = " + message);

        System.out.println("");
    }

    public static void main(String[] args) {
        StudentGradingSystem3 system = new StudentGradingSystem3();

        for (int i = 1; i <= 2; i++) {
            System.out.println("calling inputData()");
            System.out.println("===================");
            system.inputData();

            System.out.println("\ncalling calculateGrade()");
            System.out.println("===================");
            system.calculateGrade();

            System.out.println("\ncalling getMessage()");
            System.out.println("===================");
            system.getMessage();

            System.out.println("\ncalling displayData()");
            System.out.println("===================");
            system.displayData();
        }

    } //main()
} // StudentGradingSystem3

    

