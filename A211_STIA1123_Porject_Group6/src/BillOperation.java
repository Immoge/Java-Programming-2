import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BillOperation {
    //private ArrayList <Owner> owners = new ArrayList<Owner ()>;
    private ArrayList <Owner> ownerAL;
    
    public BillOperation() {
    ownerAL = new ArrayList <>();
    }
    
    public int calculateTotalUnit(int currentReading, int previousReading){      
        int totalUnit = currentReading - previousReading;     
        return totalUnit;
        }
  
    public double calculateCurrentCharge(int totalUnit){
        double currentCharge = 0.0;
        
        if(totalUnit >=1 && totalUnit <= 200){
            currentCharge = totalUnit * 0.218;
        }
        else if (totalUnit >=201 && totalUnit <= 300){
            currentCharge = 43.6 + ((totalUnit - 200) * 0.334);
        }
        else if (totalUnit >=301 && totalUnit <= 600){
            currentCharge = 77 + ((totalUnit - 300) * 0.516);
        }
        else if (totalUnit >=601 && totalUnit <= 900){
            currentCharge = 231.8 + ((totalUnit - 600) * 0.546);
        }
        else if (totalUnit >= 901){
            currentCharge = 395.6 + ((totalUnit - 900) * 0.571);  
        }
         return currentCharge;
     }
    public double calculatTotalBill(double currentCharge, double arreas){
        double totalBill;
        return totalBill = arreas + currentCharge;
    }
    
    public void addRecord (Owner owner){
        try
        {
            File outFile = new File("ElectricalBillRecord.txt");
            FileWriter outFileStream =  new FileWriter(outFile,true);
            PrintWriter outStream = new PrintWriter(outFileStream);         
            outStream.println(owner.getAccountNo());
            outStream.println(owner.getBillDate());
            outStream.println(owner.getOwnerName());
            outStream.println(owner.getOwnerAddress());
            outStream.println(owner.getArrears());
            outStream.println(owner.getPreviousMeterReading());
            outStream.println(owner.getCurrentMeterReading());
            outStream.println(owner.getTotalUnit());
            outStream.println(owner.getCurrentCharge());
            outStream.println(owner.getTotalBill());      
            outStream.close();
        }
        catch (IOException ex)
        {
            ex.getMessage();
        }
        ownerAL.add(owner);
    }//addRecord
    
    public String displayAllRecord(){
        
        String output = null;
        String accountNo = null, previousMeterReading = null, currentMeterReading = null, totalUnit = null;
        String billDate = null, ownerName = null, ownerAddress = null ,arrears = null;
        String currentCharge = null, totalBill = null; 
        StringBuilder stringBuilder = new StringBuilder();
        
        try
        {
            File inFile = new File("ElectricalBillRecord.txt");
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            
            String dataNo = br.readLine();
            while (dataNo != null)
            {
                accountNo = dataNo;
                billDate = br.readLine();
                ownerName = br.readLine();
                ownerAddress = br.readLine();
                arrears = br.readLine();
                previousMeterReading = br.readLine();
                currentMeterReading = br.readLine();
                totalUnit = br.readLine();
                currentCharge = br.readLine();
                totalBill = br.readLine();
                dataNo = br.readLine();
                
                output = accountNo + "\t" + billDate+ "\t" + ownerName + "\t" + ownerAddress + "\t" + arrears + "\t" + previousMeterReading
                        + "\t" + currentMeterReading + "\t" + totalUnit + "\t" + currentCharge + "\t" + totalBill + "\n";                
                stringBuilder.append(output);
            } // while()
            br.close();
        } // try
        catch(FileNotFoundException excep)
        {
            System.out.println("File is not found");
            excep.getStackTrace();
            excep.getMessage();
        }
        catch(IOException ioEx)
        {
            ioEx.getStackTrace();
            ioEx.getMessage();
        }
        return output;
    }
    
    public Owner searchRecord(int searchAccountNo){
        Owner owner = null;       
        String accountNo = null, previousMeterReading = null, currentMeterReading = null, totalUnit = null;
        String billDate = null, ownerName = null, ownerAddress = null;
        String currentCharge = null, totalBill = null, arrears = null;  
        try
        {
            File inFile = new File("ElectricalBillRecord.txt");
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            
            String dataNo = br.readLine();
            while (dataNo != null)
            {
                accountNo = dataNo;
                billDate = br.readLine();
                ownerName = br.readLine();
                ownerAddress = br.readLine();
                arrears = br.readLine();
                previousMeterReading = br.readLine();
                currentMeterReading = br.readLine();
                totalUnit = br.readLine();
                currentCharge = br.readLine();
                totalBill = br.readLine();                         
                if(accountNo.equals(searchAccountNo)){
                owner = new Owner(accountNo, billDate, ownerName, ownerAddress, arrears,previousMeterReading,
                                 currentMeterReading, totalUnit, currentCharge,totalBill);
            }
                dataNo = br.readLine();//dataNo = br.readLine();
            } // while()
            br.close();
        } // try
        catch(FileNotFoundException excep)
        {
            System.out.println("File is not found");
            excep.getStackTrace();
            excep.getMessage();
        }
        catch(IOException ioEx)
        {
            ioEx.getStackTrace();
            ioEx.getMessage();
        }
        return owner;
    } // searchStaff
    
    public void updateRecord(Owner owner){
        
        ArrayList<Owner> ownerAL = new ArrayList<Owner>();
        Owner owr; // owr - owner               
        String accountNo = null, previousMeterReading = null, currentMeterReading = null, totalUnit = null;
        String billDate = null, ownerName = null, ownerAddress = null;
        String currentCharge = null, totalBill = null, arrears = null;  
        try
        {
            File inFile = new File("ElectricalBillRecord.txt");
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            
            String dataNo = br.readLine();
            while (dataNo != null)
            {
                accountNo = dataNo;
                billDate = br.readLine();
                ownerName = br.readLine();
                ownerAddress = br.readLine();
                arrears = br.readLine();
                previousMeterReading = br.readLine();
                currentMeterReading = br.readLine();
                totalUnit = br.readLine();
                currentCharge = br.readLine();
                totalBill = br.readLine();                                                   
                owr = new Owner(accountNo, billDate, ownerName, ownerAddress, arrears, previousMeterReading, currentMeterReading, totalUnit, 
                                 currentCharge, totalBill);
                ownerAL.add(owr);  // add each record/ object into arraylist
                dataNo = br.readLine();                         
            } // while()
            br.close();
        } // try
        catch(FileNotFoundException excep)
        {
            System.out.println("File is not found");
            excep.getStackTrace();
            excep.getMessage();
        }
        catch(IOException ioEx)
        {
            ioEx.getStackTrace();
            ioEx.getMessage();
        }
        
        // do a comparison and update in the array list
        String searchAccountNo = owner.getAccountNo();
        for (int i=0; i < ownerAL.size();i++)
        {
            if (ownerAL.get(i).getAccountNo().equals(searchAccountNo))
            {
                // update other data in array list
                ownerAL.get(i).setAccountNo(owner.getAccountNo());
                ownerAL.get(i).setBillDate(owner.getBillDate());
                ownerAL.get(i).setOwnerName(owner.getOwnerName());
                ownerAL.get(i).setOwnerAddress(owner.getOwnerAddress());
                ownerAL.get(i).setArrears(owner.getArrears()); 
                ownerAL.get(i).setPreviousMeterReading(owner.getPreviousMeterReading());
                ownerAL.get(i).setCurrentMeterReading(owner.getCurrentMeterReading());
                ownerAL.get(i).setTotalUnit(owner.getTotalUnit());
                ownerAL.get(i).setCurrentCharge(owner.getCurrentCharge());
                ownerAL.get(i).setTotalBill(owner.getTotalBill());

            }
        }     
            // save all record into text file
        try
        {
            File outFile = new File("ElectricalBillRecord.txt");
            FileWriter outFileStream =  new FileWriter(outFile);
            PrintWriter outStream = new PrintWriter(outFileStream);
            
            for (int i=0; i<ownerAL.size(); i++)
            {
            outStream.println(owner.getAccountNo());
            outStream.println(owner.getBillDate());
            outStream.println(owner.getOwnerName());
            outStream.println(owner.getOwnerAddress());
            outStream.println(owner.getArrears());
            outStream.println(owner.getPreviousMeterReading());
            outStream.println(owner.getCurrentMeterReading());
            outStream.println(owner.getTotalUnit());
            outStream.println(owner.getCurrentCharge());
            outStream.println(owner.getTotalBill());      
            outStream.close();
            }
            outStream.close();
        }
        catch (IOException ex)
        {
            ex.getMessage();
        }       
    }// updateStaff
  
     public void deleteRecord(int searchAccountNo) 
    {  
       ArrayList<Owner> ownerAL = new ArrayList<Owner>();
       Owner owr; // owr - owner
                   
       String accountNo = null, previousMeterReading = null, currentMeterReading = null, totalUnit = null;
        String billDate = null, ownerName = null, ownerAddress = null;
        String currentCharge = null, totalBill = null, arrears = null;  
        try
        {
            File inFile = new File("ElectricalBillRecord.txt");
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            
            String dataNo = br.readLine();
            while (dataNo != null)
            {
                accountNo = dataNo;
                billDate = br.readLine();
                ownerName = br.readLine();
                ownerAddress = br.readLine();
                arrears = br.readLine();
                previousMeterReading = br.readLine();
                currentMeterReading = br.readLine();
                totalUnit = br.readLine();
                currentCharge = br.readLine();
                totalBill = br.readLine();                                                   
                owr = new Owner(accountNo, billDate, ownerName, ownerAddress, arrears, previousMeterReading, currentMeterReading, totalUnit, 
                                 currentCharge, totalBill);
                ownerAL.add(owr);  // add each record/ object into arraylist                                 
                owr = new Owner(accountNo, billDate, ownerName, ownerAddress, arrears, previousMeterReading, currentMeterReading, totalUnit, 
                                 currentCharge, totalBill);
                ownerAL.add(owr);  // add each record/ object into arraylist
                dataNo = br.readLine();                         
            } // while()
            br.close();
        } // try
        catch(FileNotFoundException excep)
        {
            System.out.println("File is not found");
            excep.getStackTrace();
            excep.getMessage();
        }
        catch(IOException ioEx)
        {
            ioEx.getStackTrace();
            ioEx.getMessage();
        }
        
        // do a comparison and remove data in the array list
        
        for (int i=0; i<ownerAL.size(); i++)
        {
            if (ownerAL.get(i).getAccountNo().equals(searchAccountNo))
            {
                // delete record in array list
                ownerAL.remove(i);
                
            }
        }
    }
}   