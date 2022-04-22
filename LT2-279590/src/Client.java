
public class Client {
    private String name;
    private String organizationType;
    private double loanAmount;
    private double interestRate;
    private int noOfYear;
    private double totalLoanAmount;
    private double monthlyPayment;

    public Client(String name, String organizationType, double loanAmount, double interestRate, int noOfYear, double totalLoanAmount, double monthlyPayment) {
        this.name = name;
        this.organizationType = organizationType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.noOfYear = noOfYear;
        this.totalLoanAmount = totalLoanAmount;
        this.monthlyPayment = monthlyPayment;
    }// constructor
    
    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNoOfYear() {
        return noOfYear;
    }

    public void setNoOfYear(int noOfYear) {
        this.noOfYear = noOfYear;
    }

    public double getTotalLoanAmount() {
        return totalLoanAmount;
    }

    public void setTotalLoanAmount(double totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

}//class Client
