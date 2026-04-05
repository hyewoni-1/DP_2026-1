package hw.ch04.idcard;

import hw.ch04.framework.Product; 

public class IDCard extends Product {
    private String owner;
    private String issuedDate;
    private int serial;

    IDCard(String owner, int serial, String issuedDate) {
        this.owner = owner;
        this.serial = serial;
        this.issuedDate = issuedDate;
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {

        return "[IDCard:" + owner + "(" + serial + ")] - 발급일: " + issuedDate;
    }

    public String getOwner() { return owner; }
    public String getIssuedDate() { return issuedDate; } 
    public int getSerial() { return serial; }
}
