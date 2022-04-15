package structure.manageBook;

import structure.IO.IOperation;
import structure.book.Book;
import structure.book.BookList;

import java.util.Objects;
import java.util.Scanner;

public class DelBook implements IOperation {

    @Override
    public void work(BookList bookList) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String name = sc.nextLine();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (Objects.equals(bookList.getBook(i).getName(), name)) {
                for (int j = i; j < bookList.getUsedSize() - 1; j++) {
                    bookList.setBook(j, bookList.getBook(j + 1));
                }
                bookList.setUsedSize(bookList.getUsedSize() - 1);
                bookList.setBook(bookList.getUsedSize(), null);

                System.out.println("Delete book success");
                return;
            }
        }
        System.out.println("No such book");
    }
}
