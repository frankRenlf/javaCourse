package structure.manageBook;

import structure.IO.IOperation;
import structure.book.BookList;

public class DisplayBook implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println(bookList);
        for(int i =0;i< bookList.getUsedSize();i++){
            System.out.println(bookList.getBook(i));
        }
        System.out.println("Display bookList success");
    }
}
