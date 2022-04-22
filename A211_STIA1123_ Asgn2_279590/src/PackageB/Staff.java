//Name: Chong Qi Jun
//Matric Number: 279590
package PackageB;
//This class Staff is a superclass
class Staff implements CalculateOperation{
    private String name;
    private int daysWorked;
    private double payRate;
    private double houseAllowance;
    private double EPFContribution;
    private double basicSalary;
    protected double netSalary;

    public Staff(String name, int daysWorked, double payRate, double houseAllowance) {
        this.name = name;
        this.daysWorked = daysWorked;
        this.payRate = payRate;
        this.houseAllowance = houseAllowance;
    }//constructor()
    
    public String getName() {
        return name;
    }//getName()

    public int getDaysWorked() {
        return daysWorked;
    }//getDaysWorked()

    public double getPayRate() {
        return payRate;
    }//getPayRate()

    public double getHouseAllowance() {
        return houseAllowance;
    }//getHouseAllowance()

    public double getEPFContribution() {
        return EPFContribution;
    }//getEPFContribution()

    public double getBasicSalary() {
        return basicSalary;
    }//getBasicSalary()

    public double getNetSalary() {
        return netSalary;
    }//getNetSalary()
    
    public void calculateBasicSalary(){
       basicSalary = daysWorked * payRate;
    }//calculateBasicSalary()
    
    public void calculateEPFContribution(){
        EPFContribution = basicSalary * 0.09;
    }//calculateEPFContribution()
    
    public double calculateNetSalary(){
        netSalary = basicSalary + houseAllowance - EPFContribution;
        return netSalary;
    }//calculateNetSalary()
    
    @Override
    public String toString(){
        String output = ("Name = " + name + "\nNom of days worked = " + daysWorked + "\nPay rate Per Day = " + payRate +
                         "\nBasic Salary = " + basicSalary + "\nHouse Allowance = " + houseAllowance + "\nEPF Contribution = "
                         + EPFContribution + "\nNet Salary = " + netSalary);
        return output;
    } // toString()
}//class Staff implement calculateOperation
