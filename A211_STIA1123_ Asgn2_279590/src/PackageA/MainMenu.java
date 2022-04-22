//Name: Chong Qi Jun
//Matric Number: 279590
package PackageA;
//This class used to excute main method
public class MainMenu {
    public static void main(String[] args) {
       Staff waiter = new Staff("Kamal Hassan",25,50.0,350.0);
       waiter.calculateBasicSalary();
       waiter.calculateEPFContribution();
       waiter.calculateNetSalary();
       System.out.println(waiter);
       System.out.println();
       
       Chef chef = new Chef("Jamal Husin",25,150.0,500.0,350.0);
       chef.calculateBasicSalary();
       chef.calculateEPFContribution();
       chef.calculateNetSalary();
       System.out.println(chef);
    }// main method        
}// end MainMenu
