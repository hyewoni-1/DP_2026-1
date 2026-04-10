package practice.ch10;

public class Player {
    private String name;
    private Strategy strategy; //플레리러가 strategy의 속성을 가진다. 부모타임으로 선언됨, 모든 자식타입의 객체를 참조할 수 있다. => 전략 교체가 쉽다
    private int wincount;
    private int losecount;
    private int gamecount;

    // 이름과 전략을 받아서 플레이어를 만든다 
    public Player(String name, Strategy strategy) { // 또 Strategy(부모타입)=>어떤 자식 전략이든 받아서 플레이어를 만들 수 있다. => 전략 교체가 쉽다.
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 손을 결정한다
    public Hand nextHand() {
        return strategy.nextHand(); //전략 객체에게 다음 손을 결정하도록 위임한다. 어떤 전략 객체인지 따라서 결정 방식이 달라진다 
    } 

    // 승리
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    } 

    // 패배
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    } 

    // 무승부 
    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {
        return "["
            + name + ":"
            + gamecount + " games, "
            + wincount + " win, "
            + losecount + " lose"
            + "]";
    } 
}
