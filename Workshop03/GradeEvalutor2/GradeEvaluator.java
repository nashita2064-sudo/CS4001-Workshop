import java.util.Scanner;
public class GradeEvaluator{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the grade of the student");
        double grade=sc.nextDouble();
        String status=(grade >= 40)
        ? "The student has passed!"
        : "The student has failed";
        System.out.println(status);
        sc.close();
    }
}