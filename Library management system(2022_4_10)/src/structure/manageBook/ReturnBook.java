package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

import java.util.Objects;
import java.util.Scanner;

public class ReturnBook implements IOperation {


    @Override
    public void work(BookList bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String name = sc.nextLine();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (Objects.equals(bookList.getBook(i).getName(), name)){
                bookList.getBook(i).setIsBorrowed(false);
                System.out.println("Return book success");
                return;
            }
        }
        System.out.println("No such book");
    }
}
