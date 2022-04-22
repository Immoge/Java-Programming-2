
public class Customer {
    private String customerName;
    private String customerType;
    private String customerPhoneNumber;
    private String bookingDay;
    private int numOfCourts;
    private int numOfHours;
    private double TotalAmount;

    public Customer(String customerName, String customerType, String customerPhoneNumber, String bookingDay, int numOfCourts, int numOfHours, double TotalAmount) {
        this.customerName = customerName;
        this.customerType = customerType;
        this.customerPhoneNumber = customerPhoneNumber;
        this.bookingDay = bookingDay;
        this.numOfCourts = numOfCourts;
        this.numOfHours = numOfHours;
        this.TotalAmount = TotalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public int getNumOfCourts() {
        return numOfCourts;
    }

    public void setNumOfCourts(int numOfCourts) {
        this.numOfCourts = numOfCourts;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(double TotalAmount) {
        this.TotalAmount = TotalAmount;
    }
    
    @Override
    public String toString(){
        
        String output = "toString from customer class";
        return output;
    }
    
    
}
