package hw.ch04.licensecard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.time.LocalDate;

public class LicenseCardFactory extends Factory {
    private String baseDate;
    private int licenseCounter = 100;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        LocalDate issued = LocalDate.parse(this.baseDate);
        String expiryDate = issued.plusYears(5).minusDays(1).toString();

        return new LicenseCard(owner, licenseCounter++, this.baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}