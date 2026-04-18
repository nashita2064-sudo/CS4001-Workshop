import java.util.Scanner;
public class scenario4{
    public static void  main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter GPA (0.0 to 4.0)");
    double gpa= sc.nextDouble();
     if (gpa < 0.0 || gpa> 4.0){
      System.out.println("Invalid GPA Entered! \n Please enter a valid GPA between 0.0 to 4.0");   
     }
     else {
         if (gpa >= 3.6){
             System.out.println("The Student's Grade is an A.");
         }
         else if(gpa >= 3.0){
             System.out.println("The Student's Grade is a B.");
         }
         else if (gpa >= 2.0){
             System.out.println("The Student's Grade is a C.");
         }
         else if (gpa >= 1.0){
             System.out.println("The Stident's Grade is a D.");
         }
         else {
             System.out.println("The Student's Grade is a F");
         }
     }
    sc.close();  
    }
}