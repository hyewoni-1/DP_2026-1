package hw.ch17;

public class RangeObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        if (number < 10) {
            System.out.println("RangeObserver: [Low] " + number);
        } else if (number < 20) {
            System.out.println("RangeObserver: [Mid] " + number);
        } else {
            System.out.println("RangeObserver: [High] " + number);
        }
    }
    
}
