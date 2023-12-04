import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Catalog Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. List all books");
            System.out.println("3. Search by title");
            System.out.println("4. Search by author");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    catalog.addBooks(newBook);
                    break;
                case 2:
                    System.out.println("Library Catalog:");
                    for (Book book : catalog) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    System.out.println("Books with the title '" + searchTitle + "':");
                    for (Book book : catalog) {
                        if (book.title().equalsIgnoreCase(searchTitle)) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter author name to search: ");
                    String searchAuthor = scanner.nextLine();
                    System.out.println("Books by the author '" + searchAuthor + "':");
                    for (Book book : catalog) {
                        if (book.author().equalsIgnoreCase(searchAuthor)) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
