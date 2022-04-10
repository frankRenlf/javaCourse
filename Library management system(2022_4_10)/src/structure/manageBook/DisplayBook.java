package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

public class DisplayBook implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("Display bookList success");
    }
}
