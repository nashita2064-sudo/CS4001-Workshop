class patient{
    String patientName;
    int age;
    int daysAdmitted;
    double dailyCharge;
    
    public patient(String patientName,int age,int daysAdmitted, double dailyCharge){
        this.patientName=patientName;
        this.age=age;
        this.daysAdmitted=daysAdmitted;
        this.dailyCharge=dailyCharge;
    }
    
    public double calculatetotalBill(){
        double totalBill= daysAdmitted * dailyCharge;
        if (daysAdmitted>7) {
            double discount = totalBill*0.10;
            totalBill=totalBill-discount;
        }
        return totalBill;
    }
    
    public void displayDetails(){
        System.out.println("Patient's Name" + patientName + "Age" + age + "Days hospitalized" + daysAdmitted);
        System.out.printf("Final Bill %.2f\n",calculatetotalBill());
    }
    }   
    
    
public class HospitalBilling{
    public static void main(String[] args){
        patient p1= new patient("Susan",60,8,150);
        patient p2=new patient("Frank",25,3,60);
        
        p1.displayDetails();
        p2.displayDetails();
    }
}