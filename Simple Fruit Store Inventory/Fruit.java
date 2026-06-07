public class Fruit {
    String name;
    double pricePerKilo;
    double quantity;

    public Fruit(String name, double pricePerKilo, double quantity) {
        this.name = name;
        this.pricePerKilo = pricePerKilo;
        this.quantity = quantity;
    }

    public void displayFruit() {
        System.out.println("Name           : " + name);
        System.out.printf("Price per Kilo : %.2f%n", pricePerKilo);
        System.out.printf("Quantity (kg)  : %.2f%n", quantity);
    }

    public double getTotalValue() {
        return pricePerKilo * quantity;
    }
}