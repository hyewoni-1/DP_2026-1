package practice.ch10;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public void study(boolean win) {
    }

    @Override
    public Hand nextHand() { //핵심전략
        return Hand.getHand(random.nextInt(3)); //0,1,2 중에 나옴
    }
}
