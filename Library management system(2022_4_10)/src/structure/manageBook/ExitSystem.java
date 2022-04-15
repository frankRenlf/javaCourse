package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

public class ExitSystem implements IOperation {


    @Override
    public void work(BookList bookList) {
        System.out.println("Exit System success");
        System.out.println("==================");

        System.exit(0);
    }
}
