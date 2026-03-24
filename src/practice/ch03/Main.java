package practice.ch03;

public class Main {
    public static void main(String[] args) {
        
        //CharDisplay d1= new CharDisplay('H');//'h' 는 charm "h"는 문자열

        AbstractDisplay d1=new CharDisplay('0');//자식 객체를 부모타임으로 선언해도 가능
        d1.display(); //부모로부터 물려받은걸 쓸거야

        //StringDisplay d2= new StringDisplay("hello world");
        AbstractDisplay d2= new StringDisplay("hello world");
        d2.display();

        //AbstractDisplay d3 //자식을 모두 가리킬수 있어 char,string 디스플레이를 모두 가리킬수 있다
       // = new AbstractDisplay() {}; //이건 불가 추상클래스는 인스턴스를 만들 수 없어
            
        
    }
}
