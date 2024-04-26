//BookShelf内の本を順番にアクセスする

class BookshelfIterator implements IIterator {
    private Bookshelf bookShelf;
    private int index;

    public BookShelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookshelf.getLength()){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public Object next() {
        Book book = bookshelf.getBookAt(index);
        index++;
        return book;
    }
}