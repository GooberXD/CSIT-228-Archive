import java.util.*;

public class DrivingLicense{
    private Vehicle vehicle;
    private Driver driver;
    
    public DrivingLicense(){
        this.vehicle = null;
        this.driver = null;
        System.out.print("No vehicle or driver assigned.");
    }
    
    public DrivingLicense(Vehicle vehicle, Driver driver){
        this.vehicle = vehicle;
        this.driver = driver;
        
    }
    
    public Vehicle getVehicle(){
        return vehicle;
    }
    
    public Driver getDriver(){
        return driver;
    }
    
}