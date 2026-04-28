package practice.ch12;

//중심컴포넌트("hello, world."라는 문자열을 표시하는 클래스)

public class StringDisplay extends Display {
    private String string; // 표시할 문자열 

    public StringDisplay(String string) {
        this.string = string; //생성자
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string; //0번째 행
    }
}
