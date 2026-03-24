package hw.ch03;

public class NumberDisplay extends AbstractDisplay{
    private int number;

    public NumberDisplay(int number, int repeatCount) {
        // 부모 클래스(AbstractDisplay)의 생성자를 호출하여 repeatCount 세팅
        super(repeatCount); 
        this.number = number;
    }

    @Override
    public void open() {
        //  "<<Number>>"를 출력한다
        System.out.print("<<Number>>\n");
       
    }

    @Override
    public void print() {
        System.out.println(number);
        
    }

    @Override
    public void close() {
        //  "<<Number>>"를 출력한다
        System.out.println("<<Number>>");
    }




}
