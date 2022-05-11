import java.util.Scanner;
public class Testing1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        double midSem, assignment, quiz, carryMarks;
        
        System.out.print("Enter midSem: ");
        midSem = input.nextDouble();
        System.out.print("Enter assignment mark: ");
        assignment = input.nextDouble();
        System.out.print("Enter quiz mark : ");
        quiz = input.nextDouble(); 
        carryMarks = midSem + assignment +  quiz;
        
        System.out.println("Carry Marks is: " + carryMarks);
        System.out.printf("Carry Marks in 1 decimal place: %.1f %n", carryMarks);
    }
}
