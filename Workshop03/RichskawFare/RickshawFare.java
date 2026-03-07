import java.util.Scanner;
public class RickshawFare{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base fare.");
        double base=sc.nextDouble();
        System.out.println("Enter the per kilometer charge.");
        double perkm=sc.nextDouble();
        System.out.println("Enter the per minutes charge.");
        double permin=sc.nextDouble();
        System.out.println("Enter the distance needed to travel(in km)");
        double distance= sc.nextDouble();
        System.out.println("Enter the time to reach destination(in mins).");
        double time= sc.nextDouble();
        System.out.println("Is the cusomer a local? (True/False)");
        boolean local=sc.nextBoolean();
        System.out.println("Is the travel during Night?");
        boolean night=sc.nextBoolean();
        double fare=base+ (distance * perkm) + (time * permin);
        String discount=(local==true)
        ? "We offer discounts to locals."
        : "There are no discounts.";
        System.out.println(discount);
        String more=(night==true)
        ? "There will be a surchagre."
        : "There is no surcharge.";
        System.out.println(more);
        System.out.println("The fare price is" + fare);
    sc.close();
    }
}