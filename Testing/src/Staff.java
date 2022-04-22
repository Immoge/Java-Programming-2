
public class Staff {
    private String staffName;
    private int staffId;

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
 
 

     public Staff(String staffName, int staffId) {
        this.staffName = staffName;
        this.staffId = staffId;
    }
    public static void main(String[] args) {
        String staff1 = "Ahmad";
        String staff2 = "Ahmad";
        Staff employee = new Staff ("Zabidin",16);
 
            System.out.println(staff1.length());
        
        System.out.println(employee);
    }
}
