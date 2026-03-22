package hw.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index]; // 꽂힌 책의 위치를 반환한다.
    }

    public void appendBook(Book book) { // 책꽂이에 책을 꽂는다.
        this.books[last] = book; // 추가
        last++;
    }

    public int getLength() {
        return last; // 책꽂이에 꽂힌 책의 길이, 개수를 반환
    }

    // 1. 기본 Iterator (모든 책 순회)
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    // 2. 장르별 Iterator를 반환하는 새로운 메서드 
    public Iterator<Book> iteratorByGenre(String genre) {
  
        return new GenreIterator(this.books, genre);
    }

    // 3. 출판연도 역순 Iterator를 반환하는 메서드

public Iterator<Book> iteratorByYear(String genre) {
    return new YearIterator(this.books, genre);
}

}
