package ch04.A2.idcard;

import ch04.A2.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    IDCard(String owner, int serial) {

        //super(); 한객체가 생성될때는 기본적으로 부모의 인자없는 생성자가 가장먼저 호출된다, 인자 있는 생성자를 호출하려먼 super("ss",1213); 이런식으로 ㅈ정 필요]
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")]";
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
