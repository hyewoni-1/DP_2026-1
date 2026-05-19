package practice.ch17;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) { //인자가 부모타입, 자식이 누가 올진 모른다.//통지받는 메서드 

        System.out.println("DigitObserver:" + generator.getNumber());//generator.getNumber(), 어떤 숫자를 만들엇는지 출력한다.

        try {
            Thread.sleep(100); //cpu를 내놓고 잠깐쉬었다가 일. 0.1초 대기
        } catch (InterruptedException e) {
        } //.sleep이건 꼭 try-catch로 감싸야한다.(컴파일 오류 방지) InterruptedException이걸 만나면, cpu내놔라 안되면 예외발생ㅡ
    }
}
