//Name: Chong Qi Jun
//Matric Number: 279590
package PackageB;
// This class Chef is the subclass of Staff
class Chef extends Staff{
    private double cookingAllowance;

    public Chef(String name, int daysWorked, double payRate, double houseAllowance,double cookingAllowance) {
        super(name, daysWorked, payRate, houseAllowance);//super class constructor
        this.cookingAllowance = cookingAllowance;
    }//constructor
 
    @Override
    public double calculateNetSalary(){
        netSalary = super.calculateNetSalary() + cookingAllowance;
        return netSalary;
    }//calculateNetSalary()
    
    @Override
    public String toString(){
          String output = ("Name = " + super.getName() + "\nNom of days worked = " + super.getDaysWorked() + "\nPay rate Per Day = " + super.getPayRate() +
                         "\nBasic Salary = " + super.getBasicSalary() + "\nHouse Allowance = " + super.getHouseAllowance() +  "\nCooking Allowance = " + cookingAllowance +
                         "\nEPF Contribution = "+ super.getEPFContribution() + "\nNet Salary = " + netSalary);
          return output;
    }//toString()
}//class chef
