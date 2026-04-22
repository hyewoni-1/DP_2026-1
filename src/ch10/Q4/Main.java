package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서(오름차순)
        list.sort(new Comparator<String>() { //Cpmparator : Funtioncal interface , compare메서드 하나만 존재
            //문자열을 비교하는 비교기다. 인처페이스를 new할수 없어, 그런데 가능한 경우가 있는데, 인터페이스가 정의하는 메소드를 여기서 구현해주면 된다. 인터페이스의 메소드는 하나뿐이야, 그래서 람다식으로도 표현할 수 있다. 
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2); //s1의 문자코드-s2의 문자코드, 실행 
                //s1이 s2보다 사전순으로 작으면 음수, 같으면 0, 크면 양수 //인터페이스에있는 메소드를 구현해주면 익명의 내부클래스가 생긴다. 
            }//이거 하나만 구현해주면 인스턴스를 만들어 준다 
            //s1이 s2보다사전순으로  작으면 음스, 같으면 0 크면 양수 반환


 
        } ); // 오름차순을 위한 Coomparator를 넣어줌
        System.out.println(list);


        list.sort((s1, s2)-> s1.compareTo(s2)); // Funtioncal interface를 람다식으로 표현, 인터페이스의 메소드가 하나뿐이야, 그래서 람다식으로도 표현할 수 있다.
        System.out.println(list); //

        // 사전순으로 큰 순서 (내림차순)
        list.sort( new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); //s2의 문자코드-s1의 문자코드, 실행 
                //s1이 s2보다 사전순으로 작으면 음수, 같으면 0, 크면 양수 //인터페이스에있는 메소드를 구현해주면 익명의 내부클래스가 생긴다. 
            }
        }


         ); //여기도 내침차순을 위한 Comparator를 넣어줌
        System.out.println(list);
    }
}


//https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html