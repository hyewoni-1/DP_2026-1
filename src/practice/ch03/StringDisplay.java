package practice.ch03;

public class StringDisplay extends AbstractDisplay {
    private String string;  // 표시해야 하는 문자열 
    private int width;      // 문자열의 길이

    // 생성자 
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override //골뱅이, 어노테이션, 해당 메소드가 상위 클래스나 인터페이스에사 선언된 메소드를 오버라이드하는것, 부모 쪽에 정의된걸 내가 재정의하는구나.
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    // open과 close에서 호출되어 "+----+" 문자열을 표시하는 메소드
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
