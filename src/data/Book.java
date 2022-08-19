package data;

public class Book {

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    private Author author;
    private int ISBNNumber;
    private String title;
    private String description;
    private double price;

    public void displayDetailsOfBook() {
        System.out.println("ISBNNumber = " +getISBNNumber());
        System.out.println("title = " +getTitle());
        System.out.println("description = " +getDescription());
        System.out.println("price = " +getPrice());
        System.out.println("author = " +author);
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
