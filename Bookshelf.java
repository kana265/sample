import java.util.ArrayList;

class Bookshelf implements IAggregate {

    private ArrayList<Book> bookList;

    public Bookshelf(int num){
        this.bookList = new ArrayList<>(num);
    }

    public int getLength() {
        return bookList.size();
    }

    public void appendBook(Book book) {
        bookList.add(book);
    }

    public Book getBookAt(int index) {
        return bookList.get(index);
    }

    @Override
    public IIterator createIterator() {
        return new BookshelfIterator(this);
    }
}
