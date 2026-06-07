public class Developer extends Employee{
    
    
    public Developer(String name, double baseSalary){
        super(name, baseSalary);
    }
    
    @Override
    public double calculateBonus(){
        double bonus = getBaseSalary() * .15;
        return bonus;
    }
    
    
}