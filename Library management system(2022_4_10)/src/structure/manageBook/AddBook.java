package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

public class AddBook implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("Add book success");
    }

}
