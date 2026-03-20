package practice.ch02.inheritance;
//이미 제공되는 클래스 ,vendor클래스 , 수정불가
public class Banner {
    private String string;

   //이미 존재하는 클래스 

    public Banner(String string) {
        this.string = string; //부모생성자
    }

    public void showWithParen() { // 아 이건 내가 원하는 인터페이스가 아니다. 
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
