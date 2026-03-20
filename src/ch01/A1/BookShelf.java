package ch01.A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> books; //왜 arraylist가 아니라 list? 인터페이스 이기 때문 //부모타입 설정

    public BookShelf(int initialsize) { // 초기 크기를 지정하여 ArrayList를 생성
        this.books = new ArrayList<>(initialsize); //책을 계소 ㄱ꽂아도 자동으로 증가. 배열과 차이점
    }

    public Book getBookAt(int index) {
        return books.get(index); 
    }

    public void appendBook(Book book) {
        books.add(book); 
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
