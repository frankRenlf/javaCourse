package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

public class DelBook implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("Delete book success");
    }
}
