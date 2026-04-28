package practice.ch12;

//장식자 1: 내용물의 양쪽에 테두리를 붙이는 장식자
public class SideBorder extends Border {
    private char borderChar;  // 장식 문자

    // 내용물이 될 Display와 장식 문자를 지정
    public SideBorder(Display display, char ch) { //첫번쨰 인자:장식대상
        super(display); //부모 생성자 호출
        this.borderChar = ch;
    }

    //예 : hello, world. => |hello, world.|
    @Override
    public int getColumns() {
        // 문자 수는 내용물의 양쪽에 장식 문자만큼 더한 것
        return 1 + display.getColumns() + 1;
    }


    @Override
    public int getRows() {
        // 행수는 내용물의 행수와 같다 
        return display.getRows();
    }

    
    @Override
    public String getRowText(int row) {
        // 지정 행의 내용은 내용물의 지정 행 양쪽에 장식 문자를 붙인 것
        return borderChar + display.getRowText(row) + borderChar;
    }
}
