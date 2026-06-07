public class Vehicle{
    private String make;
    private String model;
    
    public Vehicle(String make, String model){
        this.model = model;
        this.make = make;
        
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
}