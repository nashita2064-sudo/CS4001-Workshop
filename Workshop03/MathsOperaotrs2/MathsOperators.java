import java.util.Scanner;
public class MathsOperators{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); //'=' is an Assignment Operator
        System.out.println("Enter a number");
        double a= sc.nextDouble();
        System.out.println("Enter second number");
        double b=sc.nextDouble();
        String status=(a >= b) //Relational operator
        ? "The first number is greater than or equal to the second."
        : "The second number is greater.";
        System.out.println(status); //Ternary Operator
        System.out.println("Enter the final number");
        double c= sc.nextDouble();
        System.out.println("Is the third number the greatest number?");
        String message=(c > b && c > a) //Logical Operator
        ? "Both conditions have been met.The third number is the greatest."
        : "Both conditions haven't bee met. Hence, third number can't be the greatest";
        System.out.println(message);
        System.out.println("The addition of the increments of the third number.");
        System.out.print(c++ + ++c); //Pre-Increment and Post-Increment
        sc.close();
    }
}