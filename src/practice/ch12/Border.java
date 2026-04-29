package practice.ch12;
//장식자를 대표하는클래스
public abstract class Border extends Display {
    protected Display display;             
    // 이 장식틀이 감싸는 '내용물', 장식대상을 가리킴 =>Display 부모타입 . 중심, 자식자 모두 가리킬수 있다.

    protected Border(Display display) { 
        // 인스턴스 생성 시 '장식 대상, 내용물'을 인수로 지정
        this.display = display;
    }
}
