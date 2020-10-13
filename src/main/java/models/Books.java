package models;

public class Books {
    private int isbn;
    private int quantity;
    private String title;
    private String author;
    private String genre;
    private float price;

    public Books(int isbn, int quantity, String title, String author, String genre, float price) {
        this.isbn = isbn;
        this.quantity = quantity;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
