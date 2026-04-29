package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public List<Entry> search(String keyword) {
        List<Entry> result = new ArrayList<>();
        
        //디렉토리 자신의 이름 확인
        if (name.contains(keyword)) {
            result.add(this);
        }
        
        //모든 자식의 search() 결과 병합 
        for (Entry entry : directory) {
            result.addAll(entry.search(keyword));
        }
        
        return result;
    }



    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {
        directory.add(entry);//인자로 들어온 자식을 추가
        entry.setParent(this);//현재 디렉토리를 인자로 들어온 자식의 부모로 설정
        return this;//현재디렉토리를 리턴
        
    }
}
