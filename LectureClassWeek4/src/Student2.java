
public class Student2 {
    private int matricNumber;
    private String name;
    private double mark;
    private char grade;
    private String message;

    public Student2(int matricNumber, String name, double mark, char grade, String message) {
        this.matricNumber = matricNumber;
        this.name = name;
        this.mark = mark;
        this.grade = grade;
        this.message = message;
    }

    public int getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(int matricNumber) {
        this.matricNumber = matricNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
