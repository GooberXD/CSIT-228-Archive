public class Rectangle extends Shape{
    private double width;
    private double height;
    
    
    public Rectangle(String color, double width, double height) throws InvalidShapeException{
        super(color);
        if(width <= 0 || height <= 0){
            throw new InvalidShapeException();
        } 
        
        else{
            this.width = width;
            this.height = height;
        }
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing a " + getColor() + " rectangle of width " + width
        + " and height " + height + ".");
    }
    
    
}