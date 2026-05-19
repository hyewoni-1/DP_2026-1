package ch17.A2;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(1000); //cpu를 내놓고 잠깐쉬었다가 일. 1초 대기
        } catch (InterruptedException e) {
        }
    }
}
