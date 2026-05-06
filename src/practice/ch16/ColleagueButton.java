package practice.ch16;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague { //버튼상속(java.awt.Button;) implements(구현) Colleague
    private Mediator mediator; //본인 중재자 가지기 위한 코드

    public ColleagueButton(String caption) { //생성자, 캡션을 받아 부모생성자를 호출, 캡션:버튼에 나타나는 text
        super(caption);
    }

    // Mediator를 설정한다 
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다
    @Override
    public void setColleagueEnabled(boolean enabled) { //true,false에 따라 활성화 비활성화,, 
        setEnabled(enabled);// 부모인 버튼의 setEnabled호출, 중재자가 메시지를 보낼텐데 이걸 따라 활성화, 비활성화 지정
    }
}
