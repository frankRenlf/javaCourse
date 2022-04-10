package structure.book;

import java.util.Arrays;

public class BookList {

    private Book[] bookList = new Book[10];
    private int usedSize;

    public BookList() {
        bookList[0] = new Book("1", "a", "history", 13.0, false);
        bookList[1] = new Book("2", "b", "journal", 20.3, false);
        bookList[2] = new Book("3", "c", "novel", 15.6, false);

        this.usedSize = 3;
    }

    public Book getBook(int pos) {
        return bookList[pos];
    }

    public void setBook(int pos, Book book) {
        bookList[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(bookList) +
                ", usedSize=" + usedSize +
                '}';
    }
}
