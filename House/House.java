public class House{
    
    private String location;
    private double price;
    private int bedrooms;
    
    public House(String location, double price, int bedrooms){
        this.location = location;
        this.price = price;
        this.bedrooms = bedrooms;
    }
    
    
    public String getLocation(){
        return location;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getBedrooms(){
        return bedrooms;
    }
    
    
    public void setLocation(String location){
        this.location = location;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setBedrooms(int bedrooms){
        if(bedrooms < 0) this.bedrooms = 1;
        
        else{
            this.bedrooms = bedrooms;
        }
        
    }
    
    
    @Override
    public String toString(){
        return String.format("House in %s - P%.2f - %d bedrooms", location, price, bedrooms);
    }
    
    
}