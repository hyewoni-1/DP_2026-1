package ch04.A2.idcard;


import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private final Map<Integer, String> ownerMap = new HashMap<>();
    //이 부분 원래 시리어는 inr안데 t시리얼 만들때는 인티저

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        if (product instanceof IDCard) {
            IDCard idCard = (IDCard) product;
            ownerMap.put(idCard.getSerial(), idCard.getOwner());
            System.out.println(product + "을 등록했습니다.");
            System.out.println("현재 시리얼-오너 매핑: " + ownerMap);
        }
    }

    public Map<Integer, String> getDatabase() {
        return Collections.unmodifiableMap(ownerMap);
    }
}
