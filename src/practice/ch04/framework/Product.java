package practice.ch04.framework;

public abstract class Product {
    public abstract void use();
    //public abstract Product(String name); //제품이 생성되럐떄 이름을 부여받도록 하는 생성자 , 상속받는 애들도 이걸 받드니 만들겠지,
}

//제품 사용할때 사용하는 메소드 Product는 일반적 제품을 의미, 모든 제품 사용 시 use호출필요
// use();제품사용할떄 필요한 api