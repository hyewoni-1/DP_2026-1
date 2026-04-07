package practice.ch06;

import practice.ch06.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) { //문자열이 들어오면 문자열+2 만큼의 데코문자를 출력한다.
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
        Product p = null;
        try {
            p = (Product)clone(); //자기 복제
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
