package practice.ch17;
public class Main {
    public static void main(String[] args) {
       //관찰 대상 설정
        NumberGenerator generator = new RandomNumberGenerator();

       //관찰자 생성
       Observer observer1 = new DigitObserver();
       Observer observer2 = new GraphObserver();

       // 관찰대상에 관찰자 등록
       generator.addObserver(observer1);
       generator.addObserver(observer2);

       //관찰 대상을 실행(숫자 생성)
       generator.execute();
        
        // 연습문제 1번
        // NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        // Observer observer1 = new DigitObserver();
        // Observer observer2 = new GraphObserver();
        // generator.addObserver(observer1);
        // generator.addObserver(observer2);
        // generator.execute();
        // 연습문제 2번->a2가서 확인

       
    }
}
