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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
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
public class Books {
    public static void main(String[] args) {
        Fiction f = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");
        NonFiction nf = new NonFiction("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011, "History");
        f.display();
        System.out.println("Late Fee for Fiction book: $" + f.calculateLateFees(5));
        System.out.println();
        nf.display();
        System.out.println("Late Fee for Non-Fiction book: $" + nf.calculateLateFees(3));
    }
}
