import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruit[] fruits = new Fruit[5];
        int count = 0;
        int choice = 0;

        System.out.println("");

        do {
            System.out.println("\n===== FRUIT STORE INVENTORY =====");
            System.out.println("1 - Add Fruit");
            System.out.println("2 - Display All Fruits");
            System.out.println("3 - Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        if (count >= fruits.length) {
                            System.out.println("Inventory is full.");
                            break;
                        }

                        System.out.print("Enter fruit name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter price per kilo: ");
                        double pricePerKilo = Double.parseDouble(sc.nextLine());

                        System.out.print("Enter quantity (kg): ");
                        double quantity = Double.parseDouble(sc.nextLine());

                        fruits[count] = new Fruit(name, pricePerKilo, quantity);
                        count++;

                        System.out.println("Fruit added successfully!");
                        break;

                    case 2:
                        if (count == 0) {
                            System.out.println("No fruits recorded.");
                        } else {
                            System.out.println("\n===== ALL FRUITS =====");
                            double totalStockValue = 0;

                            for (int i = 0; i < count; i++) {
                                System.out.println("[" + (i + 1) + "]");
                                fruits[i].displayFruit();
                                System.out.println("----------------------------");
                                totalStockValue += fruits[i].getTotalValue();
                            }

                            System.out.printf("Total Stock Value: PHP %,.2f%n", totalStockValue);
                        }
                        break;

                    case 3:
                        System.out.println("Exiting program. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter the correct type.");
            }
        } while (choice != 3);

        sc.close();
    }
}