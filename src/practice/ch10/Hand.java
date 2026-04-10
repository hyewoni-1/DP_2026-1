package practice.ch10;

//enum은 상수를 만들떄 사용
public enum Hand {
    // 가위 바위 보를 나타내는 세 개의 enum 상수
    //각 상수는 핸드 타입의 객체로 생성된다.->생성자를 호출,, 생성자는 하단에 정의되어 있다.
    //프로그램 전체를 통해서 손은 딱 3개 존재
    ROCK("바위", 0), //바위와 0을 가진 핸드객체
    SCISSORS("가위", 1),
    PAPER("보", 2);

    // enum이 가진 필드 
    private String name; // 가위 바위 보 손의 이름
    private int handvalue; // 가위 바위 보 손의 값 

    // 손의 값으로 상수를 얻기 위한 배열, static , 클래스에 있는것, 객체에 속한 것이 아니다.(이해 못함)
    private static Hand[] hands = {
        ROCK, SCISSORS, PAPER
    };

    // 생성자 
    private Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue; // 이 둘은 속성이다, 위에 필드로 선언되어있다.
    }

    // 손의 값으로 enum 상수를 가져온다 
    public static Hand getHand(int handvalue) {
        return hands[handvalue]; 
    }

    // this가 h보다 강할 때 true
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1; //메시지를 받는것도, 들어가는것도 손이다, 인자로 들어온 손, 클래스의손을 비교 1=true, -1=false
    }
 
    // this가 h보다 약할 때 true
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 무승부는 0, this가 이기면 1, h가 이기면 -1//현재 손과 인자로 들어온 손을 비교//손 사용할때는 싱클 톤 패턴으로 사용하기 때문에, 객체가 하나만 존재한다. 그래서 this와 h를 비교할 수 있다.
    
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) { 
            return 1;
        } else {
            return -1;
        }
    }

    // 가위 바위 보의 문자열 표현
    @Override
    public String toString() {
        return name; 
    }
}
