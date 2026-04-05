package practice.ch05;
//싱글톤 적용하기
public class Singleton {

    //3. 제일 중요~. Singleton객체를 미리 만들어서 ststic 변수에 저저아해놓는다
        private static Singleton singleton = new Singleton(); //클래스 로드시 실행됨,


    //1. 생성자를 provate로 한다.
    private Singleton(){
        System.out.println("Singleton 객체가 생성됩니다");

    }

    //2. Singleton객체를 얻어가는 메소드를 정의한다. 
    public static Singleton getInstance() {
        return singleton;
    }

    } //생성자없더라고 얘 호출하면 객체 얻을 수 있다 , 이 메서드를 호출하려면 생성자가 있어야한다, 그래서 ststic을 붙여서 클래스에 속하게 한다

    



