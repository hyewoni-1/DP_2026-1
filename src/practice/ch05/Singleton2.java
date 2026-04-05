package practice.ch05;

//enum을 이용한 싱글톤 패턴
public enum Singleton2 {
    INSTANCE; //상수, 이 인스턴스에는 싱글톤2 타입의 객체그 생성되어 저장된다  //enum의 특성상 자동으로 생성, 

    public void hello(){
        System.out.println("싱글톤 객체의 hello 메소드가 호출되었습니다");
    }

    
}
