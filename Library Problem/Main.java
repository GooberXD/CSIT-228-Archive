import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Book[] books = new Book[5];

        int count = 0;
        int choice = 0;
        System.out.println("");
        do {
            try {

                System.out.printf("\n===== LIBRARY BOOK SYSTEM =====\n");
                System.out.println("1 - Add Book");
                System.out.println("2 - Display All Books");
                System.out.println("3 - Update Book Availability");
                System.out.println("4 - Exit");
                System.out.print("Enter choice: ");

                choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:

                        if (count == books.length) {
                            System.out.println("Catalog is full.");
                            break;
                        }

                        System.out.print("Enter book title: ");
                        String title = input.nextLine();

                        System.out.print("Enter author: ");
                        String author = input.nextLine();

                        int year;

                        while (true) {
                            System.out.print("Enter year published (1000-2025): ");
                            year = input.nextInt();

                            if (year >= 1000 && year <= 2025) {
                                break;
                            }

                            System.out.println("Invalid year. Must be between 1000 and 2025.");
                        }

                        int copies;

                        while (true) {
                            System.out.print("Enter number of copies: ");
                            copies = input.nextInt();

                            if (copies >= 0) {
                                break;
                            }

                            System.out.println("Copies cannot be negative.");
                        }

                        input.nextLine();

                        books[count] = new Book(title, author, year, copies);
                        count++;

                        System.out.println("Book added successfully!");
                        break;

                    case 2:

                        if (count == 0) {
                            System.out.println("No books recorded.");
                        } else {

                            System.out.println("\n===== ALL BOOKS =====");

                            for (int i = 0; i < count; i++) {
                                System.out.println("[" + (i + 1) + "]");
                                books[i].displayBook();
                            }
                        }

                        break;

                    case 3:

                        if (count == 0) {
                            System.out.println("No books recorded.");
                            break;
                        }

                        System.out.println("\n===== SELECT BOOK =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println("[" + (i + 1) + "] "
                                    + books[i].getTitle()
                                    + " - "
                                    + books[i].getStatus());
                        }

                        System.out.print("Enter book number: ");
                        int index = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter new status (Available / Unavailable): ");
                        String status = input.nextLine();

                        books[index - 1].updateStatus(status);

                        break;

                    case 4:
                        System.out.println("Exiting program. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Enter 1 to 4 only.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Error: please enter a number.");
                input.nextLine();
                choice = 0;

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Invalid book number.");

            } catch (Exception e) {

                System.out.println("Unexpected error occurred.");

            } finally {

                System.out.println("---- end of action ----");
            }

        } while (choice != 4);

        input.close();
    }
}