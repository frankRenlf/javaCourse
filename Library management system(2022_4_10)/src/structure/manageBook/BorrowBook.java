package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

public class BorrowBook implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("Borrow book success");
    }
}
