package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreIterator implements Iterator<Book> {
    private Book[] books;
    private String targetGenre; // 1. 찾고자 하는 장르를 저장할 변수 추가
    private int currentIndex = 0;

    // 2. 생성자에서 책 배열과 찾을 장르를 함께 입력받음
    public GenreIterator(Book[] books, String targetGenre) {
        this.books = books;
        this.targetGenre = targetGenre;
    }

    @Override
    public boolean hasNext() {
        // 3. 배열 범위 내에서  책이 존재하는 동안 반복
        while (currentIndex < books.length && books[currentIndex] != null) {
            // 현재 인덱스의 책 장르가 우리가 찾는 장르와 일치하면 탐색 성공
            if (books[currentIndex].getGenre().equals(targetGenre)) {
                return true;
            }
            // 일치하지 않으면 건너뛰고 다음 책을 확인
            currentIndex++; 
        }

        return false; 
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        // hasNext()에서 찾아둔 일치하는 책을 꺼내고 인덱스를 다음으로 넘김
        Book book = books[currentIndex];
        currentIndex++;
        return book;
    }
}