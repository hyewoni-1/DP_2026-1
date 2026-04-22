package practice.ch11;

//내영물을 나타냄
public abstract class Entry {
    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    //printList는 메소드 오버로딩(인자 있없 차이)

    // 목록을 표시한다
    public void printList() {
        printList(""); 
    }
    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix);



    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";  //일종의 템플릿메서드라고 할수 있다
    }
}
