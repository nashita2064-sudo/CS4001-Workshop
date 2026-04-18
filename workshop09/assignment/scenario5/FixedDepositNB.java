import java.util.Scanner;
public class FixedDepositNB{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    char choice = 'y';
    while (choice=='y' || choice=='Y'){
    System.out.println("Enter the deposit amount. (Minimum Rs.1000)");
    double principal= sc.nextDouble();
    System.out.println("Enter the interest rate. (8 to 12%)");
    double annualRate=sc.nextDouble();
    System.out.println("Enter the number of years. (Maximum 5 years)");
    int years=sc.nextInt();
    if (principal<1000 || annualRate>12 || annualRate<8 || years>5 ){
        System.out.println("Invlid Input! Please check the bank limits.");
    }
    else {
    double annualDecimalRate= annualRate/100;
    int months= 12 * years;
    double maturityAmount= principal * (1 + annualDecimalRate/12);
    double fee = maturityAmount * 0.005;
    double finalAmount= maturityAmount - fee;
    System.out.println("Deposit Amount" + " " + principal);
    System.out.println("Total Months of deposit " + " " + months);
    System.out.println("Processing fee" + " " + fee);
    System.out.println("Your Final Amount will be" + " " + finalAmount);
    }
    System.out.println("Do you want to continue?(Y/N)");
    choice=sc.next().charAt(0);
}
sc.close();
    }
}