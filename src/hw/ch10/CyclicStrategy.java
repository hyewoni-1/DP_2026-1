package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int currentHandValue = 0; // 0(바위)부터 시작 [cite: 19]

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(currentHandValue);
        // 0 -> 1 -> 2 -> 0 순으로 순환 
        currentHandValue = (currentHandValue + 1) % 3;
        return hand;
    }

    @Override
    public void study(boolean win) {
        // CyclicStrategy는 승패에 따른 학습 X 비워두기.
    }
}