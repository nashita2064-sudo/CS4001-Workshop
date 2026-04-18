public class AushadhiPasal{
    public static void main(String[] args){
        String medicineName1= "Penicilin";
        double price1=15.00;
        int stock1=500;
        boolean prescription1=true;
        
        String medicineName2="Paracetamol";
        double price2=20.00;
        int stock=10;
        boolean prescription2=false;
        
        String medicineName3="Tylenol";
        double price3=5.00;
        int stock3=150;
        boolean prescription3=false;
        
        System.out.println("Aushahi Pasal \nInventory Repot");
        System.out.println(medicineName1 + price1);
        System.out.println("Prescription:" + " " + prescription1);
        System.out.println(medicineName2 + price2);
        System.out.println("Prescription:" + " " + prescription2);
        System.out.println(medicineName3 + price3);
        System.out.println("Prescription:" + " " + prescription3);
    }
}