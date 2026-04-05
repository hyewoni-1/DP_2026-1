package ch04.A2;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import ch04.A2.idcard.IDCardFactory;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();

        if (factory instanceof IDCardFactory) {
            IDCardFactory idCardFactory = (IDCardFactory) factory;
            System.out.println("등록된 시리얼-오너 대응표: " + idCardFactory.getDatabase());

            // forEach로 순회 코드
            idCardFactory.getDatabase().forEach((serial, owner) -> {
                System.out.println("시리얼: " + serial + " -> 오너: " + owner);
            });

            // 간단한 추가 테스트
            Map<Integer, String> map = idCardFactory.getDatabase();
            assert map.get(100).equals("Youngjin Kim");
            assert map.get(101).equals("Heungmin Son");
            assert map.get(102).equals("Kane");
            System.out.println("해시맵 검증 통과: " + map);
        }
    }
}
