package practice.ch17;
//관찰자 
public interface Observer {
    public abstract void update(NumberGenerator generator); //통지 받을꺠 호출되는 메서드
}
