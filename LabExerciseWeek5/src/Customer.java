
public class Customer {
    private String customerName;
    private String customerType;
    private String customerPhoneNumber;
    private String bookingDay;
    private int numOfCourt;
    private int numOfHours;
    private double totalAmount;
    
   //constructor is used to store data into an object

    public Customer(String customerName, String customerType, String customerPhoneNumber, String bookingDay, int numOfCourt, int numOfHours, double totalAmount) 
    {
        this.customerName = customerName;
        this.customerType = customerType;
        this.customerPhoneNumber = customerPhoneNumber;
        this.bookingDay = bookingDay;
        this.numOfCourt = numOfCourt;
        this.numOfHours = numOfHours;
        this.totalAmount = totalAmount;
    }
    //Getter and setter method
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

    public int getNumOfCourt() {
        return numOfCourt;
    }

    public void setNumOfCourt(int numOfCourt) {
        this.numOfCourt = numOfCourt;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
}
