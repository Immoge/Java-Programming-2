
public class Customer 
{
    private String customerName;
    private String customerType;
    private String customerPhoneNumber;
    private String bookingDay;
    private int numOfCourts;
    private int numOfHours;
    private double totalAmount;
    
    // contructor is used to store data into an object

    public Customer(String custName, String custType, String customerPhoneNumber, String bookingDay, int numOfCourts, int numOfHours, double totalAmount) 
    {
        customerName = custName;
        customerType = custType;
        this.customerPhoneNumber = customerPhoneNumber;
        this.bookingDay = bookingDay;
        this.numOfCourts = numOfCourts;
        this.numOfHours = numOfHours;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public int getNumOfCourts() {
        return numOfCourts;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public void setNumOfCourts(int numOfCourts) {
        this.numOfCourts = numOfCourts;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    
}
