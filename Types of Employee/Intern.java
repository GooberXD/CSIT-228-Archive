public class Intern extends Employee{
    
    
    public Intern(String name, double baseSalary){
        super(name, baseSalary);
    }
    
    @Override
    public double calculateBonus(){
        
        
        double bonus =  getBaseSalary() * .05;
        return bonus;
    }
        
    
    
    
}