class person{
    int Id;
    String name;
    double basicSalary;
    static String collegeName="Islington College";
    
    public person(int Id, String name,double basicSalary){
        this.Id=Id;
        this.name=name;
        this.basicSalary=basicSalary;
    }
    
    public double calculateAnnualSalary(){
        return basicSalary*12;
    }
}

class teacher extends person{
    private String subject;
    private double bonus;
    
    public teacher(int Id, String name, double basicSalary,String subject,double bonus){
        super(Id,name,basicSalary);
        this.subject=subject;
        this.bonus=bonus;
    }
    
    @Override  public double calculateAnnualSalary(){
        return super.calculateAnnualSalary() + bonus;
    }
}

class staff extends person{
    private double workingHours;
    private double ratePerHour;
    
    public staff(int Id,String name, double basicSalary, double workingHours, double ratePerHour){
        super(Id,name,basicSalary);
        this.workingHours=workingHours;
        this.ratePerHour=ratePerHour;
    }
    
    public double calculateSalary(){
        return workingHours*ratePerHour;
    }
}

public class schoolApp{
    public static void main(String[] args){
        teacher t1= new teacher(001,"Jasmine",10000,"Maths",60);
        staff s1= new staff(015,"Kevin",700,8,30);
        
        System.out.println("College:" + " " + person.collegeName);
        System.out.println("Teacher" + t1.name + "Annual Salary" + t1.calculateAnnualSalary());
        System.out.println("Staff" + s1.name + "Annual Salary" + s1.calculateAnnualSalary());
    }
}