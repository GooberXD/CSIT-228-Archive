public class Appliance{
    private String brand;
    private double powerUsage;
    private boolean isOn;
    
    public Appliance(String brand, double powerUsage, boolean isOn){
        this.brand = brand;
        this.powerUsage = powerUsage;
        this.isOn = isOn;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public double getPowerUsage(){
        return powerUsage;
    }
    
    public boolean getIsOn(){
        if (isOn) return true;
        
        return false;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setPowerUsage(double powerUsage){
        this.powerUsage = powerUsage;
    }
    
    public void togglePower(){
        if(!isOn) this.isOn = true;
        else this.isOn = false;
    }
    
    public void printInfo(){
        
        String onOff;
        
        if(isOn) onOff = "on.";
        else onOff = "off.";
        
        System.out.printf("Appliance %s uses %.1f watts and is currently %s", brand, powerUsage, onOff);
    }
    
    
}