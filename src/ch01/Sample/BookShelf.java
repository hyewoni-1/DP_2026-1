package ch01.Sample;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index]; //꽃힌 책의 위치를 반환한다.
    }

    public void appendBook(Book book) { //책꽂이에 책을 꽂는다.
        this.books[last] = book; 
        last++;
    }

    public int getLength() {
        return last; //책꽂이에 꽂힌 책의 길이, 개수를 반환
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
