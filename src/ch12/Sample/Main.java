package ch12.Sample;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");//중심객체, b1이라는 이름, StringDisplay
        Display b2 = new SideBorder(b1, '#'); //b1을 감싸는 첫번쨰 장식한결과물, 또 장식 대상이 될수있다!
        Display b3 = new FullBorder(b2);//b2를 감싸는 두번째 장식한결과물, b3라는 이름, FullBorder
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("Hello, world.") //중심객체
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b4.show();
    }
}
