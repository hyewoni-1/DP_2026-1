package practice.ch20;

public class Main {
    public static void main(String[] args) {
        // 메모리를 많이 차지함
       BigChar bigChar = new BigChar('3');
        bigChar.print();

        //공장을 통해서 BigChar 인스턴스를 얻는다.
        BigCharFactory factory = BigCharFactory.getInstance();
        BigChar bigChar1 = factory.getBigChar('1');
        bigChar1.print();   
        BigChar bigChar2 = factory.getBigChar('1');
        bigChar2.print();

        if (bigChar1 == bigChar2) {
            System.out.println("bigChar1과 bigChar2는 같은 인스턴스입니다.");
        } else {
            System.out.println("bigChar1과 bigChar2는 다른 인스턴스입니다.");
        }
    // BigString이용
    BigString bigString = new BigString("1212123");
bigString.print();      
    }
}
