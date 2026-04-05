package practice.ch04.idcard;


import practice.ch04.framework.Factory;
import practice.ch04.framework.Product;

public class IDCardFactory extends Factory { //팩도리는 producr를 리턴래. 그래서 여기서 프로덕트,,를 타입을 맞퉈서 저렇게 만듬,
    @Override  
    protected Product createProduct(String owner) {
        return new IDCard(owner); //오너를 받아서 아이디카드를 만든다.
    } //IDCard2로바꾸고싶다면? 아이지카드.자바에서 public class IDCard2 extends Product 이것도 같이 바꿔주면 끝, 메인에 영향이 없어


//  @Override  
//     protected IDCard createProduct(String owner) { //이것도 된다는듯
//         return new IDCard(owner);
//     }



    @Override
    protected void registerProduct(Product product) { //여기도 좀 더 유연하게 프로덕트를 등록
        System.out.println(product + "을 등록했습니다.");
    }
}
