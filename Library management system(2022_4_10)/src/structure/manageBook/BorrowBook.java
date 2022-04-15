package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

import java.util.Objects;
import java.util.Scanner;

public class BorrowBook implements IOperation {

    @Override
    public void work(BookList bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String name = sc.nextLine();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (Objects.equals(bookList.getBook(i).getName(), name)){
                bookList.getBook(i).setIsBorrowed(true);
                System.out.println("Borrow book success");
                return;
            }
        }
        System.out.println("No such book");
    }
}
