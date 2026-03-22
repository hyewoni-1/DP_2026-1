package hw.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class YearIterator implements Iterator<Book> {
    private Book[] sortedBooks;
    private int currentIndex = 0;

    public YearIterator(Book[] books, String targetGenre) {
        // 1. GenreIterator를 생성해서 필터링을 맡김
        GenreIterator genreFilter = new GenreIterator(books, targetGenre);
        
        // 2. 필터링된 결과(소설 등)만 임시 리스트에 담기
        List<Book> filteredList = new ArrayList<>();
        while (genreFilter.hasNext()) {
            filteredList.add(genreFilter.next());
        }

        // 3. 리스트를 배열로 변환한 뒤 연도 내림차순으로 정렬
        sortedBooks = filteredList.toArray(new Book[0]);
        Arrays.sort(sortedBooks, (b1, b2) -> b2.getYear() - b1.getYear());
    }

    @Override
    public boolean hasNext() {
        return currentIndex < sortedBooks.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) throw new NoSuchElementException();
        return sortedBooks[currentIndex++];
    }
}