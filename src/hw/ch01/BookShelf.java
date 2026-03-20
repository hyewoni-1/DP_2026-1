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
    // 매개변수로 어떤 장르(genre)를 찾을지 입력받는다.
    public Iterator<Book> iteratorByGenre(String genre) {
        // 우리가 직전에 수정한 GenreIterator 생성자에 맞게 책 배열과 장르를 함께 넘겨줍니다.
        return new GenreIterator(this.books, genre);
    }
// BookShelf.java 클래스 내부의 맨 아래 쪽에 추가합니다.

    // 3. 출판연도 역순 Iterator를 반환하는 메서드
    public Iterator<Book> iteratorByYear() {
        return new YearIterator(this.books);
    }
}
