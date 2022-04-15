package structure.book;

public class Book {

    private String name;
    private String author;
    private String type;
    private double price;
    private Boolean isBorrowed;

    public Book(String name, String author, String type, double price, Boolean state) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.isBorrowed = state;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price + '\'' +
                ", loanable='" + (!isBorrowed ? "yes'" : "no'") +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}
