package practice.ch05;

public class Main {
    public static void main(String[] args) {
        //Singleton s1= new Singleton(); // 왜 오류? The constructor Singleton() is not visible  프라이빗으로 만들엇자나 그니깡 안보이징
        Singleton s2= Singleton.getInstance();
        Singleton s3= Singleton.getInstance(); //인스턴스 하나 더 추가 //엥 이거 2번 생성 됐다는건싱글턴객체가 아니다

        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
// s2:practice.ch05.Singleton@1f32e575
// s3:practice.ch05.Singleton@1be6f5c3 @뒤의 주소가 다름, 다른객체 2개가 만들어 진것

 Singleton2 s4= Singleton2.INSTANCE;
    s4.hello();



if(s2==s3){ //s2,s3 같은 객체를 참조하는지 비교
System.out.println("둘은 같은 객체임");
}else {System.out.println("둘은 다른 객체임");}
    }

   


    }



