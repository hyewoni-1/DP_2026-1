package practice.ch10;

public interface Strategy {
    public abstract Hand nextHand(); //다음 손을 결정할때 사용하는 메서드
    public abstract void study(boolean win);
}
