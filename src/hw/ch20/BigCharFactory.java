package hw.ch20;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private Map<String,BigChar> pool=new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    
//생성자
    private BigCharFactory(){}

//유일한 인터페이스를 얻는다
public static BigCharFactory getInstance(){
    return singleton;
}

//빅차 인스턴스 생성
public synchronized BigChar getBigChar(char charname){
    BigChar bc = pool.get(String.valueOf(charname));
        if (bc == null) {
            // 여기서 BigChar 인스턴스를 생성 
            bc = new BigChar(charname);
            pool.put(String.valueOf(charname), bc);
        }
        return bc;

}

}