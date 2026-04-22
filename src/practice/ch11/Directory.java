package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>(); //컬렉션, 자식(엔트리)를 보관할 리스트,Entry:부모 타입, 원소타입이 엔트리라는 얘기는 파일과 디렉터리를 모두 보관할 수 있다는 얘기

    public Directory(String name) {
        this.name = name; 
    } //size는 없다 왜?:

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() { //자기 자식들의 크기를 모두 더함.
        int size = 0;
        for (Entry entry: directory) { //형식 for (원소 변수: 컬렉션)
            size += entry.getSize(); //자식 엔트리의 크기를 얻어서 size에 더한다
        } //엔드리가 파일일때는 사이즈가 리턴되고, 디렉터리 일때는 다시 getsize이면 이 코드가 다시 시작되어, 그 자식의 엔트리에 대해서 gersize가 호출된다. 
        return size;
    }

    @Override
    protected void printList(String prefix) { //prefix: 상위 디렉터리까지의 경로
        System.out.println(prefix + "/" + this);//this는 toString()을 호출, 자기출력,
        for (Entry entry: directory) {  //자식에 대해서 
            entry.printList(prefix + "/" + name);  //이전 경로에 자기 이름을 붙임
            //여기도 재귀적 호출
        }
    }


    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this; //디렉토리만 add가 필요하다 
    }
}
