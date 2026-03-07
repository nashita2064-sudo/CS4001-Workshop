public class DataTypeInspector{
    public static void main(String[] args){
    byte a= -127;
    short b= 1000;
    long c= 250000l;
    int d=64;
    char e='A';
    double f= 38.5;
    float g=6.7f;
    boolean h=false;
    System.out.println("Byte data type is" + a);
    System.out.println("A byte data type is used in large arrays to save memory.");
    System.out.println("Short data type is" + b);
    System.out.println("A short data type is 2 times smaller than int.");
    System.out.println("Long data type is" + c);
    System.out.println("Long provides a wider range than int.");
    System.out.println("Int data type is" + d);
    System.out.println("Int is the default for integral numbers.");
    System.out.println("Char data type is" + e);
    System.out.println("Char is used to store any type of characters.");
    System.out.println("Double data type is" + f);
    System.out.println("Double is the most precise for decimal numbers.");
    System.out.println("Float data type is" + g);
    System.out.println("Float is never used for precision.");
    System.out.println("Boolean data type is" + h);
    System.out.println("Boolen data types have only 2 values (true/false)");
    }
}