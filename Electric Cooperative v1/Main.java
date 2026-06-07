import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static int type;
    static double usage;
    static String name;

    public static void main(String[] args) {

        boolean isEnabled = true;

        System.out.println("OOP ELECTRIC COOPERATIVE - BILLING SYSTEM");
        System.out.println("[1] Residential (₱12.57/kWh)");
        System.out.println("[2] Commercial  (₱11.71/kWh)");

        while (isEnabled) {
            System.out.print("Select Type: ");

            try {
                type = Integer.parseInt(scan.nextLine());

                if (type == 1 || type == 2) {
                    isEnabled = false;
                } else {
                    System.out.println(">> Error: Please select 1 or 2.");
                }

            } catch (NumberFormatException e) {
                System.out.println(">> Error: Invalid entry. Please enter a number.");
            }
        }

        System.out.print("Enter Name: ");
        name = scan.nextLine();

        isEnabled = true;

        while (isEnabled) {
            System.out.print("Enter Usage (kWh): ");

            try {
                usage = Double.parseDouble(scan.nextLine());

                if (usage >= 0) {
                    isEnabled = false;
                } else {
                    System.out.println(">> Error: Usage cannot be negative.");
                }

            } catch (NumberFormatException e) {
                System.out.println(">> Error: Invalid entry. Please enter a number.");
            }
        }

        ElectricityBilling bill = new ComputeBilling(name, usage, type);

        bill.displayBill();
    }
}