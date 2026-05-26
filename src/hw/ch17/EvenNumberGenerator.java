package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;	
    private int end;	

    public EvenNumberGenerator(int start, int end) {
        this.number = start;
        this.end = end;
    }

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += 2;
        }
    }
    
}
