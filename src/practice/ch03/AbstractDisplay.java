package practice.ch03;
public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
protected abstract void open();
protected abstract void print();
protected abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    } //큰 틀을 제공하는 메소드 =>템플릿 메소드
    //final이 의미하는 것은? : 말그대로 끝이당,, final이 붙은 메소그는 하위클래서에서 오버라이드 할 수 없다(자식을이 큰 흐름을 변경하지 못하도록함)
}//공통로직 유지
