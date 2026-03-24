package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.printf("[3-1] 기본 테스트, 기존 코드 호환성 확인\n");
        AbstractDisplay d1 = new CharDisplay('H');          // 기본 5회 
        AbstractDisplay d2 = new StringDisplay("Hello");    // 기본 5 회 
        d1.display(); 
        d2.display(); 
        
        System.out.printf("[3-2] Step 1 테스트: 반복 횟수 제어\n");
        AbstractDisplay dd1 = new CharDisplay('X', 3);      // 3 회 
        AbstractDisplay dd2 = new StringDisplay("Test", 7); // 7 회 
        dd1.display(); 
        dd2.display();

        System.out.printf("[3-3] Step 2 테스트: 새로운 Display\n");

        AbstractDisplay num = new NumberDisplay(42, 4); 
        num.display(); 
    }
}
