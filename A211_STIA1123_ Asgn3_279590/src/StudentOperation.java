
public class StudentOperation {
    private Student [] students;
    public StudentOperation() {
        students = new Student[5];
    }
    public double calculateBMI(double weight, double height){
        double bmi =  weight/(height * height);
        return Math.round(bmi);
    }//calculate BMI
    
    public String getStatusBMI(double bmi){
        if(bmi>35.0)
            return "Severely Obese";
        else if (bmi>=30.1 && bmi <= 35.0)
            return "Moderately Obese";
        else if (bmi>=25.1 && bmi <= 30.0)
            return "Overweight";
        else if (bmi>=18.6 && bmi <= 25.0)
            return "Normal Weight";
        else if (bmi>=16.0 && bmi <= 18.5)
            return "Underweight";
        else 
            return "Severly Underweight";
    }//getStatusBMI
    
    public void saveRecord(Student student, int i){
        students[i] = student;
    }//saveRecord
    
    public String readAllRecord(){
        System.out.println("");
        int matricNumber = 0;
        String name = null, status = null, program = null, university = null;
        double weight = 0.0, height = 0.0, bmi = 0.0;
        StringBuilder stringBuilder = new StringBuilder();
        String output = null;
        for (int i = 0; i < students.length; i++) //for loop
        {
            if (students[i] != null) //determine whether the record is empty or not 
            {
                matricNumber = students[i].getMatricNumber();
                name = students[i].getName();
                program = students[i].getProgram();
                university = students[i].getUniversity();
                weight = students[i].getWeight();
                height = students[i].getHeight();
                bmi = students[i].getBmi();
                status = students[i].getStatus();
           
                System.out.println("Matric Number = " + matricNumber);
                System.out.println("Name = " + name);
                System.out.println("Program = " + program);
                System.out.println("University = " + university);
                System.out.println("Weight = " + weight);
                System.out.println("Height = " + height);
                System.out.println("BMI = " + bmi);
                System.out.println("Status = " + status);
                
                output = matricNumber + "\t" + name + "\t" + program + "\t" + university + "\t" + weight + "\t" + height + "\t" +
                         bmi + "\t" + status + "\n";
                
                stringBuilder.append(output);
            }
            System.out.println("");
        }//end for loop
        String outputFinal = stringBuilder.toString();
        return outputFinal;
    }//readAllRecord
    
    public String searchRecord(int searchMatricNumber){
        String searchOutput = null;
        for(int i = 0; i  < students.length; i++){ 
            if(students[i] != null){ 
                if(students[i].getMatricNumber() == searchMatricNumber){// check the search matric number equal to the matric number
                    int matricNumber = students[i].getMatricNumber();
                    String name = students[i].getName();
                    String program = students[i].getProgram();
                    String university = students[i].getUniversity();
                    double weight = students[i].getWeight();
                    double height = students[i].getHeight();
                    double bmi = students[i].getBmi();
                    String status = students[i].getStatus();
                    searchOutput = (matricNumber + "\t" + name + "\t" + program + "\t" + university + "\t" + weight
                          + "\t" + height + "\t" + bmi+ "\t" + status);                }
            }
        }// end for loop
        return searchOutput; // return searched record
    }//searchOutput   
}// class StudentOperation
 