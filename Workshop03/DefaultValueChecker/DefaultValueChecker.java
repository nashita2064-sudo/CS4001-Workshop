public class DefaultValueChecker{
    int a;
    boolean values;
    char letter;
    float point; //there data types have no values assigned.
    double points;
    long b;
    short c;
    byte d;
    public static void main (String[] args){
        DefaultValueChecker obj = new DefaultValueChecker(); //Reserves memory for java and 'obj' give a name to find said memory.
        System.out.println(obj.a);
        System.out.println(obj.values);
        System.out.println(obj.letter);
        System.out.println(obj.point); //All of these are member variabbles that have defaults hence we can print without initilization.
        System.out.println(obj.points);    //Local variables do not have default values, you need to initilize them.
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}