package hw.ch03;

public abstract class AbstractDisplay {
    //반복 횟수를 저장하는 필드
    protected int repeatCount;

    // 기존 코드 호환성 유지: 반복 횟수를 명시하지 않으면 기본값 5 사용
    public AbstractDisplay() {
        this.repeatCount = 5;
    }

    //생성자에서 반복 횟수를 인자로 받도록 설계
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public abstract void open(); 
    public abstract void print();
    public abstract void close();

    // display() 메서드에서 필드값(repeatCount)을 사용하도록 구현
    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}