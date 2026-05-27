package hw.ch20;

public class BigString {

    private BigChar[] bigchars;

    public BigString(String string){
            BigCharFactory factory = BigCharFactory.getInstance();
            bigchars = new BigChar[string.length()];

        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }

    }

 public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }

    public void print(String[] colors) {
        for (int i = 0; i < bigchars.length; i++) {
            // bigchars[i].print(colors[i]) 형태로 각 문자 출력
            bigchars[i].print(colors[i]);
        }
    }

}
