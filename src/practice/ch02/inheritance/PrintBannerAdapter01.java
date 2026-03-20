package practice.ch02.inheritance;
//import practice.ch02.inheritance.Print;

//어댑터, 클라이언트가 이용하는, 
//extends Banner 부모를  물려받은, 지금 물려받아서 내가 제공돤것처럼 보임
public class PrintBannerAdapter01 extends Banner implements Print{   
    //1. 인자없는 생성자는 자동으로 생성이 됨, 2. 생성자는 상속되지 않는다. 
    // 타겟인터페이스를 제공한다
//인자가 없는 생성자는 자동으로 만들어짐 
//생성자는 상속되지않는다

    public PrintBannerAdapter01(String text) {
        super(text);} // 부모의 생성자 호출함

    @Override
    public void printWeak() {
        showWithParen(); // 멍멍() this내가 재공한 메소드 중에 이걸 호출할거다. this는 생략ok, 
    }

    @Override
    public void printStrong() {
        showWithAster(); // 별별()
    }
    
}
