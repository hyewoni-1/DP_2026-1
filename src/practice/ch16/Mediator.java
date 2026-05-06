package practice.ch16;

//중재자를 위한 인터페이스 
public interface Mediator {
    // Colleague를 생성한다, 중재자가 각 동료들의 생성까지 맡기 위해서 
    public abstract void createColleagues();

    // Colleage의 상태가 변화했을 때 호출된다//이 메시지를 통해서 ,, 상태 변환.
    public abstract void colleagueChanged();
}
