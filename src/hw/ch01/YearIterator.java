package hw.ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearIterator implements Iterator<Book> {
    private Book[] sortedBooks;
    private int currentIndex = 0;

    public YearIterator(Book[] books) {
        // 1. 배열에 들어있는 실제 책의 개수 파악
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }

        // 2. 실제 책들만 담을 새로운 배열 생성 및 복사
        sortedBooks = new Book[count];
        int index = 0;
        for (Book book : books) {
            if (book != null) {
                sortedBooks[index++] = book;
            }
        }

        // 3. 출판연도 기준 최신순 정렬
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getYear() - b1.getYear();
            }
        });
    }

    @Override
    public boolean hasNext() {
        // 정렬된 배열의 끝에 도달했는지 확인
        return currentIndex < sortedBooks.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        // 현재 인덱스의 책을 반환하고 인덱스를 1 증가시킴
        return sortedBooks[currentIndex++];
    }
}