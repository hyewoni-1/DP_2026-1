package ch05.A2a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    //클래스 로드 시 실행
    private static Map<String,Triple> map = new HashMap<>();
    static {
        String[] names = { "ALPHA", "BETA", "GAMMA" }; 
        //names 배열의 각 요소에 대해 Triple 인스턴스 생성하여 map에 저장
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s))); //s는 원소(ALPHA 등)을 입력받으먄 알파하나, 알파 트리플객체하나를 해시맵에 추가한다, 
        //이런게 있다는게 기억해주세요, 어려운건가봐. 
    }  //->람다 함수

    private String name;

    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
