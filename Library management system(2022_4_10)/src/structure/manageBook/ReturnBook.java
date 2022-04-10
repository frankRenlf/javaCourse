package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

public class ReturnBook implements IOperation {


    @Override
    public void work(BookList bookList) {
        System.out.println("Return book success");
    }
}
