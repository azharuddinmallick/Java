abstract class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public abstract void display();

    public abstract double calculateLateFees(int daysLate);
}

class Fiction extends Book {
    private String genre;

    public Fiction(String title, String author, int yearOfPublication, String genre) {
        super(title, author, yearOfPublication);
        this.genre = genre;
    }

    public void display() {
        System.out.println("Fiction Book:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getYearOfPublication());
        System.out.println("Genre: " + genre);
    }

    public double calculateLateFees(int daysLate) {
        return daysLate * 0.50;
    }
}

class NonFiction extends Book {
    private String topic;

    public NonFiction(String title, String author, int yearOfPublication, String topic) {
        super(title, author, yearOfPublication);
        this.topic = topic;
    }

    public void display() {
        System.out.println("Non-Fiction Book:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getYearOfPublication());
        System.out.println("Topic: " + topic);
    }

    public double calculateLateFees(int daysLate) {
        return daysLate * 0.25;
    }
}

class Library {
    private Book[] books;
    private int bookCount;

    public Library(int maxBooks) {
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void displayAllBooks() {
        System.out.println("All Books in the Library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].display();
            System.out.println();
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double totalLateFees = 0.0;
        for (int i = 0; i < bookCount; i++) {
            totalLateFees += books[i].calculateLateFees(daysLate);
        }
        return totalLateFees;
    }
}

public class Library {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");
        NonFiction nonFiction = new NonFiction("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011, "History");

        Library library = new Library(2);
        library.addBook(fiction);
        library.addBook(nonFiction);

        library.displayAllBooks();

        System.out.println("Total late fees for all books: $" + library.calculateTotalLateFees(3));
    }
}
