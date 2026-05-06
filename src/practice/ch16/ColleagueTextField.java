package practice.ch16;

import java.awt.Color;
import java.awt.TextField;//extends TextField
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague { //implements TextListener 간단한 구현을 위해 리스너도 한다
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns); //생성자, 디폴트텍스트& 몇컬럼을 할건지, 부모생성자에 호출
    }

    // Mediator를 설정한다 
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        // 활성/비활성에 맞게 배경색을 변경한다
        setBackground(enabled ? Color.white : Color.lightGray);//Color.white, ture.... Color.lightGray,false
    }

    @Override
    public void textValueChanged(TextEvent e) {
        // 문자열이 변화했으면 Mediator에 알린다 ->/텍스트 입력 하나하나 마다 이게 호출된다. -> 중재자에게 알림
        mediator.colleagueChanged(); 
    }
}
