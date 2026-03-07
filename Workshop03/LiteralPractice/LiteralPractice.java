public class LiteralPractice{
public static void main(String[] args){
    long value1=-200000l; 
    //'l' is necessary as without it java will recognize the no. as int, by deafult.
    char value2='Z';
    // the unicode for rupee didn't work '/u0B9'. Nor did '/u0000' work.
    float value3=3.9f;
    //'f' is necessary as without it java will recognize the decimal as double, by default.
    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
}
}