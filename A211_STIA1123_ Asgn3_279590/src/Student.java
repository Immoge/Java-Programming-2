
public class Student {
    private int matricNumber;
    private String name;
    private String program;
    private String university;
    private double weight;
    private double height;
    private double bmi;
    private String status;
    
    // constuctor 
    public Student(int matricNumber, String name, String program, String university, double weight, double height, double bmi, String status) {
        this.matricNumber = matricNumber;
        this.name = name;
        this.program = program;
        this.university = university;
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
        this.status = status;
    }
    // getter and setter method
    
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

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}//Student class
