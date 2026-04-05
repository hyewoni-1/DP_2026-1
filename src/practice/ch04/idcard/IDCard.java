package practice.ch04.idcard;

import practice.ch04.framework.Product; //그래서 임포트 함

public class IDCard extends Product {  //Product상속, use를 구현해야하는데, 패키지가 달라..
    private String owner; //신분증주인(필드)
    private int serial;

    
     IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner; //생성자
    }

    @Override
    public void use() {
        System.out.println(this +"을 사용합니다.");  //use를 구현
    }

    @Override
    //이 객체의 문자열이필요할떄 자동으로 호출되는 메소드 //부모에는 없는데,, 어디서 상속받은거지?
    //Object 클래스의  toString()메소드를 오버라이드.
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
