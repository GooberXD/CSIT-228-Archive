public class Manager extends Employee{
    
    
    public Manager(String name, double baseSalary){
        super(name, baseSalary);
    }
    
    @Override
    public double calculateBonus(){
        double bonus =  getBaseSalary() * .20;
        return bonus;
    }
    
    
}