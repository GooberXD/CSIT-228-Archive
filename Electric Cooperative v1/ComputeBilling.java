import java.text.DecimalFormat;

public class ComputeBilling implements ElectricityBilling {

    private String customerName;
    private double usageKwh;
    private int typeIdentifier;

    private static final double RESIDENTIAL_RATE = 12.57;
    private static final double COMMERCIAL_RATE = 11.71;

    public ComputeBilling(String customerName, double usageKwh, int typeIdentifier) {
        this.customerName = customerName;
        this.usageKwh = usageKwh;
        this.typeIdentifier = typeIdentifier;
    }

    public double getRate() {
        return (typeIdentifier == 1) ? RESIDENTIAL_RATE : COMMERCIAL_RATE;
    }

    @Override
    public double calculateBill() {
        return usageKwh * getRate();
    }

    @Override
    public String getCustomerCategory() {
        return (typeIdentifier == 1) ? "Residential" : "Commercial";
    }

    @Override
    public void displayBill() {

        DecimalFormat df = new DecimalFormat("₱#,##0.00");

        System.out.println("\n==========================================");
        System.out.println("       OOP ELECTRIC COOPERATIVE");
        System.out.println("           OFFICIAL RECEIPT");
        System.out.println("==========================================");
        System.out.println("Account Type : " + getCustomerCategory());
        System.out.println("Account Name : " + customerName);
        System.out.println("Total Usage  : " + usageKwh + " kWh");
        System.out.println("Rate per kWh : " + df.format(getRate()));
        System.out.println("------------------------------------------");
        System.out.println("TOTAL DUE    : " + df.format(calculateBill()));
        System.out.println("==========================================");
    }
}