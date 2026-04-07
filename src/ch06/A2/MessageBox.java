package ch06.A2;

import ch06.A2.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    // 복사 생성자 
    public MessageBox(MessageBox prototype) {
        this.decochar = prototype.decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new MessageBox(this);//클론메소드 복사가 아니라 자기 복제. this는 자기 자신을 가리키는 참조변수. 자기 자신을 복사해서 반환한다.
    }
}
