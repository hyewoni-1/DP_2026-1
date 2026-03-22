package practice.ch02.delegation;

public class Main {
    
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter02("Hello World");//부모타입으로 선언한 이유메서드 호출할떄, 선언된 메소드만 호출하겠다는 뜻

        // 프린트배너어댑터에 있는모든 메서드를 사용하려면 Print PrintBannerAdapter02 = new PrintBannerAdapter02("Hello World"); 
        //부모타입인 프린트로 한정하면 프린트.java에 있는거만 사용(뷰모타입에있는 메서드만 사용 제한)
        print.printWeak();   // (Hello World)
        print.printStrong(); // *Hello World *

            //PrintBannerAdapter02.print.getyourname(); // 부모타입인 프린트로 선언했기 때문에 getyourname() 메서드 호출 불가능
            ((PrintBannerAdapter02) print).getyourname(); //자식 타입으로 (형변환)타입캐스팅하여 getyourname() 메서드 호출 가능
            //괄호? 우선 순위 때문 , 형변화 이전에 . 이지 때문에 형변화 시키고 getyourname() 메서드 호출하겠다는 뜻
        }
}
