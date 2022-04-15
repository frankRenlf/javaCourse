package structure.manageBook;

import structure.IO.IOperation;
import structure.book.Book;
import structure.book.BookList;

import java.util.Scanner;

public class AddBook implements IOperation {

    @Override
    public void work(BookList bookList) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String name = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter type: ");
        String type = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        bookList.setBook(bookList.getUsedSize(), new Book(name, author, type, price, false));
        bookList.setUsedSize(bookList.getUsedSize() + 1);

        System.out.println("Add book success");
    }

}
