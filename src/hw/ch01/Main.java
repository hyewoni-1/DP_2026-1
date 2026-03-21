package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000.0));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000.0));
        bookShelf.appendBook(new Book("사피엔스","역사", 2011, 18000.0));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000.0));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000.0));
        bookShelf.appendBook(new Book("레미제라블","소설",1862, 12000.0));
        bookShelf.appendBook(new Book("총균쇠","역사",1997, 22000.0));
        bookShelf.appendBook(new Book("리팩터링","기술",2018, 34000.0));
        bookShelf.appendBook(new Book("로마인 이야기","역사",1992, 25000.0));
        bookShelf.appendBook(new Book("어린왕자","소설",1943, 9000.0));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

      


        System.out.println("=== [4-2] 장르 필터 Iterator 테스트 ===");
        Iterator<Book> novelIt = bookShelf.iteratorByGenre("소설");
        while (novelIt.hasNext()) {
            Book book = novelIt.next();
            // 가격이 소수점으로 나오는 걸 방지하기 위해 (int)로 형변환해서 깔끔하게 출력
            System.out.println("제목: " + book.getName() + 
                               ", 장르: " + book.getGenre() + 
                               ", 출판년도: " + book.getYear() + "년" + 
                               ", 가격: " + (int)book.getPrice() + "원");
        }
        System.out.println(); 


        System.out.println("=== [4-3] 출판연도 역순 Iterator 테스트 ===");
  
        Iterator<Book> yearIt = bookShelf.iteratorByYear();
        while (yearIt.hasNext()) {
            Book book = yearIt.next();
            System.out.println("제목: " + book.getName() + 
                               ", 장르: " + book.getGenre() + 
                               ", 출판년도: " + book.getYear() + "년" + 
                               ", 가격: " + (int)book.getPrice() + "원");
        }
        System.out.println(); 
   

    }
}
