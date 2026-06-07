public class Circle extends Shape{
    private double radius;
    
    
    public Circle(String color, double radius) throws InvalidShapeException{
        super(color);
        if(radius <= 0){
            throw new InvalidShapeException();
        } 
        
        else{
            this.radius = radius;
        }
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing a " + getColor() + " circle with radius " + radius + ".");
    }
    
    
}