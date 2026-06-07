import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        PayrollCompute pr = new PayrollCompute();
        
        boolean loop = false;
        
        while(loop == false){
            
            try{
                System.out.print("Enter hours worked: ");
                int hours = sc.nextInt();
                
                if(hours < 0){
                    throw new IllegalArgumentException("Invalid input! Please enter a positive value.");
                }
                
                pr.setHoursWorked(hours);
                pr.computeGrossPay();
                double res = pr.displayGrossPay();
                
                System.out.printf("Gross Pay: PHP %,.2f", res);
                
                loop = true;
            }
        
            catch(InputMismatchException e){
                System.out.println("Invalid input! Please enter a valid value.");
                sc.nextLine();
            }
            
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            
            
            
        }
        
        
        
        
    }
}