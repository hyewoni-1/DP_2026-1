package practice.ch12;

public class FullBorder extends Border {
    public FullBorder(Display display) { //장식대상을 인자로 받음
        super(display); //부모생성자 호출
    }

    @Override
    public int getColumns() {
        // 문자 수는 내용물 양쪽에 좌우 장식 문자만큼 더한 것
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수에 상하 장식 문자만큼 더한 것
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {                                             	// 상단 테두리
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {      //내용물의 행수 +1            	// 하단 테두리
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                    		// 기타
            return "|" + display.getRowText(row - 1) + "|";} //내용물 붙어서 리턴//row - 1? 내용물의 행수는 0부터 시작하므로, row - 1이 내용물의 행수가 된다. 
            //왜,,? 이해 못함 
    }

    // 문자 ch로 count 수만큼 연속한 문자열을 만든다
    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder(); //문자열을 내용을 바꾸면서 만들어 나갈 때 쓰는 StringBuilder
        for (int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
