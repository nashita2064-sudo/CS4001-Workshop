class bankAccount{
int accountNumber;
String holderName;
double balance;
    
public void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println(holderName + " " + "deposited" + " " + amount);
        }
    }
    
public void withdraw(double amount){
    if (amount>0 && amount <= balance){
        balance -=amount;
        System.out.println(holderName + " " + "withdrew" + " " + amount);
    } 
    else {
        System.out.println("Insufficient Balance");
    }
}

public void displayBalance(){
    System.out.println("Account Number"+accountNumber+"Account Holder"+holderName+"Balance"+balance);
} 
}

public class Main{
    public static void main(String[] args){
        bankAccount acc1= new bankAccount();
        acc1.accountNumber=001;
        acc1.holderName="John Smith";
        acc1.balance=500.0;
        
        bankAccount acc2= new bankAccount();
        acc2.accountNumber=015;
        acc2.holderName="Jenna Miller ";
        acc2.balance=7500.0;
        
        acc1.deposit(15.0);
        acc2.deposit(60.0);
        
        acc1.withdraw(750.0);
        acc2.withdraw(500.0);
        
        acc1.displayBalance();
        acc2.displayBalance();
    }
}