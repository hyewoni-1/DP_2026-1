package practice.ch04.framework;

public abstract class Factory {
    //템플릿 메소드. //여기서도 프로덕트를 리턴해
    public final Product create(String owner) { //크리에잇 호출 한번에 생성, 등록, 리턴까지~

        // 실제로는 iIDCard 객체가 생성되지만 부모타입으로 받을 수 있다. (부모는 자긷을 가르킬수 있다!)
        Product p = createProduct(owner); //실제 제품 생성 (부모가 자식을 담을수 있다는것)
        registerProduct(p);//생성된 제품을 등록
        return p; //공장에대해 크리에잇을하면 제품이 나오는구나, 어떤 제품이나올지는? 공장이 구현하기 때문에 모른다
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product); //애네들은 구체적인 공장이 구현 해야하는 메소드
}
