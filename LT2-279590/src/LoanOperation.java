
public class LoanOperation {
    private Client [] clients;
    public LoanOperation() {
        clients = new Client [5];
    }
    
     public double calculateLoanAmount(double interestRate, double loanAmount, int noOfYears){
        double interestPerYear = (interestRate/100) * loanAmount;
        double totalInterest = interestPerYear * noOfYears;
        double totalAmount = loanAmount + totalInterest;         
        return (totalAmount);
    }//calculateBMI
     
     public double calculateMonthlyPayment(double totalAmount, int noOfYears){
         int noOfMonth = noOfYears * 12;
         double monthlyPayment = totalAmount / noOfMonth;
         return Math.round(monthlyPayment);
     }//calculateMonthlyPayment
     
     public void saveClient(Client client, int i){
         clients[i] = client;
     } //saveClient
     
      public String displayAllClients(){
        System.out.println("");
        String name = null, organizationType = null;
        double loanAmount = 0.0, interestRate = 0.0, totalLoanAmount = 0.0, monthlyPayment = 0.0;
        int noOfYear = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String output = null;
       
        for (int i = 0; i < clients.length; i++) 
        {
            if (clients[i] != null) 
            {
                name = clients[i].getName();
                organizationType = clients[i].getOrganizationType();
                loanAmount = clients[i].getLoanAmount();
                interestRate = clients[i].getInterestRate();
                noOfYear = clients[i].getNoOfYear();
                totalLoanAmount = clients[i].getTotalLoanAmount();
                monthlyPayment = clients[i].getMonthlyPayment();
                
                output = name + "\t" + organizationType + "\t" + loanAmount + "\t" + interestRate + "\t" + noOfYear + "\t" + totalLoanAmount + "\t" +
                         monthlyPayment;
                
                stringBuilder.append(output);
            }
            System.out.println("");
        }
        String outputFinal = stringBuilder.toString();
        return outputFinal;
    }//displayAllClients
}// class LoanOperation
