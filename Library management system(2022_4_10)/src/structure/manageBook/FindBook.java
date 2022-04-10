package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

public class FindBook implements IOperation {


    @Override
    public void work(BookList bookList) {
        System.out.println("Find book success");
    }
}
