import java.util.*;

// CLASS 1: Representing a Book (Encapsulation)
class Book {
    private String id;
    private String title;
    private boolean isAvailable;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean status) { isAvailable = status; }
}

// MAIN CLASS: Library Management
public class LibrarySystem {
    private static List<Book> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Adding some initial books to the system
        inventory.add(new Book("B001", "Java Programming Essentials"));
        inventory.add(new Book("B002", "Data Structures & Algorithms"));
        inventory.add(new Book("B003", "Theory of Computation"));
        inventory.add(new Book("B004", "Harry potter"));
        inventory.add(new Book("B005", "Rich Dad Poor Dad"));



        System.out.println("=== Welcome to VIT Library Management (BYOP) ===");
        System.out.println("Developer: Vedant Sunil Patil (24BAI10122)");

        while (true) {
            System.out.println("\n1. View Books\n2. Borrow Book\n3. Return Book\n4. Exit");
            System.out.print("Select Option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": displayBooks(); break;
                case "2": processTransaction(false); break;
                case "3": processTransaction(true); break;
                case "4":
                    System.out.println("Exiting System... Have a great day!");
                    return;
                default: System.out.println("Invalid Choice!");
            }
        }
    }

    private static void displayBooks() {
        System.out.println("\n--- Current Inventory ---");
        for (Book b : inventory) {
            String status = b.isAvailable() ? "[Available]" : "[Borrowed]";
            System.out.println(b.getId() + " - " + b.getTitle() + " " + status);
        }
    }

    private static void processTransaction(boolean isReturn) {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        for (Book b : inventory) {
            if (b.getId().equalsIgnoreCase(id)) {
                if (!isReturn && b.isAvailable()) {
                    b.setAvailable(false);
                    System.out.println("Success: You have borrowed " + b.getTitle());
                } else if (isReturn && !b.isAvailable()) {
                    b.setAvailable(true);
                    System.out.println("Success: You have returned " + b.getTitle());
                } else {
                    System.out.println("Error: Transaction not possible.");
                }
                return;
            }
        }
        System.out.println("Error: Book ID not found!");
    }
}
