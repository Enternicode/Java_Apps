import java.util.Scanner;

public class Library {
    private Scanner scanner = new Scanner(System.in); // Shared scanner for all methods

    public void start() {
        while (true) { // Loop to keep the program running until user exits
            System.out.println("What would you like to do?");
            System.out.println("Please choose an option:");
            System.out.println("1. Add books");
            System.out.println("2. Return a book");
            System.out.println("3. Find a book");
            System.out.println("4. Exit program");

            System.out.print("Enter your choice: ");
            int choice;

            // Validate user input to ensure it's a number
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer for the next input
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continue; // Restart the loop
            }

            // Handle the user's choice
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    returnBook();
                    break;
                case 3:
                    findBook();
                    break;
                case 4:
                    exitProgram(); // Exit the program
                default:
                    System.out.println("Invalid choice! Please choose between 1 and 4.");
            }
            System.out.println(); // Blank line for better readability
        }
    }

    public void addBook() {
        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("The book \"" + bookTitle + "\" has been added successfully!");
    }

    public void findBook() {
        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Searching for the book \"" + bookTitle + "\"...");
        // You can add your search logic here
    }

    public void returnBook() {
        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("The book \"" + bookTitle + "\" has been returned successfully!");
    }

    public void exitProgram() {
        System.out.println("Exiting the program. Goodbye!");
        scanner.close();
        System.exit(0); // Safely exit the program
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.start(); // Start the program
    }
}
