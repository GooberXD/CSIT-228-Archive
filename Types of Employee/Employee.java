public class Employee{
    private String name;
    private double baseSalary;
    
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public double calculateBonus(){
        return 0;
    }
    
    public String getName(){
        return name;
    }
    
    
    public double getBaseSalary(){
        return baseSalary;
    }
}