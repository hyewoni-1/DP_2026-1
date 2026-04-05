package practice.ch06.framework;

//프로덕트 안터페이스를 구현한 클래스는 clone()매소드를 제공한다..

public interface Product extends Cloneable { //인터페이스 끼리는 상속관계일 수 잇다.
    public abstract void use(String s);
    public abstract Product createCopy();//복제 메서드
}
