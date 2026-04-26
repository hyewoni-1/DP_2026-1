package practice.ch10;
import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random; //(=null)이 있는 것과 같다
    private boolean won = false; //=false 지워도 속성은 자동으로 초기화 된다, boolean 타입의 기본값은 false 숫자는0, 참조형은 null 
    // 로컬변수는 초기화 되지않는다\ 메서드 속에 있는 것
    private Hand prevHand; //이전에 낸손
 
    public WinningStrategy(int seed) { //생성자 seed를 받아서 랜덤 객체를 만든다, 랜덤 객체는 다음에 낼 손을 결정할 때 사용한다.
        random = new Random(seed); 
    }

    @Override
    public Hand nextHand() {
        if (!won) {// 이전 게임에서 짐,, 손을 새로 고르기 위해 nextInt(3)을 사용해서 0,1,2, 중에 받음
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;  //들어오는 true or false를 win 으로 받아서 won에 저장
    }
}
