public abstract class Shape implements IDrawable{
    private String color;
    
    public Shape(String color){
        this.color = color;
    }
    
    public abstract void draw();
    
    public String getColor(){
        return color;
    }
    
}