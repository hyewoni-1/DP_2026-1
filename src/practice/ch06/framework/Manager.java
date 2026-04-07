package practice.ch06.framework;


import java.util.HashMap;
import java.util.Map;

public class Manager {
    //product 부모타입 ->모든 종류의 자식 product 객체를 관리할 수 있다.
    private Map<String,Product> showcase = new HashMap<>(); //key - value 쌍을 관리. new HashMap<String,Product> 이것도 맞는데 자바 7부터는 오른쪽은 생략 가능하다.

    //원본을 등록하는 메소드
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }


    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);//등록할때 이름을 key로 해서 원본 객체를 가져옴
        return p.createCopy();//원본 객체의 복제본을 반환
    }
}
