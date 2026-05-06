package practice.ch16;
//멤버 혹은 동료를 나타내는 인터페이스

public interface Colleague { 
    // Mediator를 설정한다/ 중재자를 설정하는 메소드, 자기 중재자가 누구인지 설정? 하기 위해서 
    public abstract void setMediator(Mediator mediator);

    // Mediator에서 활성/비활성을 지시한다. true->활성화 false->비활성화
    public abstract void setColleagueEnabled(boolean enabled);
}
