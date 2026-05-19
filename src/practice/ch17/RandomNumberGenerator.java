package practice.ch17;
import java.util.Random;

//관찰 대상, Subject     관찰자 리스트를 관리해야한다.
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random(); 	// 난수 생성기 
    private int number;                   	// 현재 수 

    // 수를 취득한다 
    @Override 
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override  //여기가 핵심!!
    public void execute() { 
        for (int i = 0; i < 20; i++) { 
            number = random.nextInt(50); // 0~49 사이의 정수인 난수를 생성한다.
            notifyObservers(); // 숫자가 생성되면 관찰자들에게 통지함. 통지만 하다!!
        }
    }
}
