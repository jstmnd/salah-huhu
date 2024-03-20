import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class BookMain {
    private ArrayList<Book> books;

    public BookMain() {
        books = new ArrayList<>();
    }

    public void createBook(String title, String author, String category) {
        Book book = new Book(title, author, category);
        books.add(book);
        System.out.println("Book created! \n" + book + "\n==");
    }

    public void getAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("==ALL BOOKS==");
        for (Book book : books) {
            System.out.println("==\n" + book + "\n==");
        }
    }

    public Book getBookById(UUID id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void updateBook(UUID id, String title, String author, String category) {
        Book book = getBookById(id);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
            book.setCategory(category);
            System.out.println("Book updated! \n" + "===\n" + book + "\n===");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void deleteBook(UUID id) {
        Book book = getBookById(id);
        if (book != null) {
            books.remove(book);
            System.out.println("Book deleted!");
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookMain manager = new BookMain();

        int option;
        do {
            System.out.println("Welcome to book management app");
            System.out.println("Please choose your menu:");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();

            String title, author, category;
            UUID id;

            switch (option) {
                case 1:
                    System.out.print("Enter title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    author = scanner.nextLine();
                    System.out.print("Enter category: ");
                    category = scanner.nextLine();
                    manager.createBook(title, author, category);
                    break;
                case 2:
                    manager.getAllBooks();
                    break;
                case 3:
                    System.out.print("Enter book ID: ");
                    id = UUID.fromString(scanner.nextLine());
                    Book book = manager.getBookById(id);
                    if (book != null) {
                        System.out.println("==\n" + book + "\n==");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter book ID: \n");
                    id = UUID.fromString(scanner.nextLine());
                    System.out.print("Enter new title: \n");
                    title = scanner.nextLine();
                    System.out.print("Enter new author: \n");
                    author = scanner.nextLine();
                    System.out.print("Enter new category: \n");
                    category = scanner.nextLine();
                    manager.updateBook(id, title, author, category);
                    break;
                case 5:
                    System.out.print("Enter book ID: ");
                    id = UUID.fromString(scanner.nextLine());
                    manager.deleteBook(id);
                    break;
                case 6:
                    System.out.println("Bye...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 6);

        scanner.close();
    }
}
