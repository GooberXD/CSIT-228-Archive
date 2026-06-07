public class WashingMachine extends Appliance{
    
    private int washCycles;
    public WashingMachine(String brand, double powerUsage){
        super(brand, powerUsage, false);
        this.washCycles = 0;
    }
    
    public void startWashCycle(){
        washCycles += 1;
    }
    
    public int getWashCycles(){
        return washCycles;
    }
    
    @Override  
    public void printInfo(){
        System.out.printf("WashingMachine %s has completed %d wash cycles.", getBrand(), washCycles);
    }
    
    
}