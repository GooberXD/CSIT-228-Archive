import java.util.*;
public class ShapeDrawer{
    private ArrayList<Shape>shapes;
    
    public ShapeDrawer(){
        shapes = new ArrayList<>();
    }
    
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    
    public void drawShapes(){
        
        for(Shape shape : shapes){
            shape.draw();
        }
        
        
    }
    
}