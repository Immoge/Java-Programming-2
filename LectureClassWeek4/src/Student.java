 
public class Student {
      
    private int matricNumber;
    private String name;
    private double mark;
    private char grade;
    private String message;
    
    public Student (){
        
    }
  
    public Student(int newMatricNumber, String newName, double newMark, char newGrade, String newMessage) {
        matricNumber = newMatricNumber;
        name = newName;
        mark = newMark;
        grade = newGrade;
        message = newMessage;
    }
    //=========================== Getter Method=============
    public int getMatricNumber() {
        return matricNumber;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public char getGrade() {
        return grade;
    }

    public String getMessage() {
        return message;
    }
    //=================== Setter Method
    public void setMatricNumber(int newMatricNumber) {
        matricNumber = newMatricNumber;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setMark(double newMark) {
        mark = newMark;
    }

    public void setGrade(char newGrade) {
        grade = newGrade;
    }

    public void setMessage(String newMessage) {
        message = newMessage;
    }
    
    
}
