package practice.ch17;
import java.util.ArrayList;
import java.util.List;

//관찰 대상, Subject     관찰자 리스트를 관리해야한다. 
public abstract class NumberGenerator { 
    //Observer를 저장한다  
    //Observer는 부모타일 -> 모든 종류의 관찰자들을 저장할 수 있다.
    //관찰대상은 구체적으로 어떤 관찰자가 자기를 관찰하는지 모른다. (알 필요가 없다, -> 느슨한 결합) 느슨해야 좋당~~
    private List<Observer> observers = new ArrayList<>(); //List of observers //부모타입, 자식이 뭐가 와도 가능

    // Observer를 추가한다 
    public void addObserver(Observer observer) {
        observers.add(observer); //observer를 인자로 받아서 추가
    }

    // Observer를 제거한다 
    public void deleteObserver(Observer observer) {
        observers.remove(observer); //observer를 인자로 받아서 제거
    }

    // Observer에 통지한다  제일중요!!!!
    public void notifyObservers() { 
        for (Observer o: observers) { //(원소를 ~? 하는 객체 :집합체)
            o.update(this); //통지 받을 때 호출되는 메서드, 통지 받을 때 자신을 인자로 전달한다.
        }
    }

    // 수를 취득한다 
    public abstract int getNumber();

    // 수를 생성한다 
    public abstract void execute();
}
