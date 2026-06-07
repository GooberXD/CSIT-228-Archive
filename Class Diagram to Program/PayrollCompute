public class PayrollCompute implements Payroll{
    
    double ratePerHour = 500.00;
    double hoursWorked;
    double grossPay;
    
    @Override
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public void computeGrossPay(){
        grossPay = ratePerHour * hoursWorked;
    }
    
    @Override
    public double displayGrossPay(){
        return grossPay;
    }
}