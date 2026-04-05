package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class IDCardFactory extends Factory {
    private String baseDate;
    private int counter = 100; 

    // 생성자에서 기준 날짜를 받음 
    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        
        return new IDCard(owner, counter++, this.baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}