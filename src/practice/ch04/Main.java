package practice.ch04;

import practice.ch04.idcard.IDCardFactory;
import practice.ch04.framework.Product;

public class Main{
    public static void main(String[] args){
        //아이디 카드 직접 만들자
        //IDCard c= new IDCard("임혜원");
        //c.use();

        //공장을 통해서 id  카드를 만들어보자
        IDCardFactory f= new IDCardFactory();5
        Product c = f.create("임혜원"); //자식객제인 IDCard c = f.create("임혜원"); IDCard로 받으려고 하면, 오류낭.
         //아이디 c 로 하면 오류나, 왜??? idcardfactory에서 프로덕트를 리턴하니까 
        c.use(); //타입을 잘 맞춰야해.
//     Idcard c = f.create("임혜원"); //idcardfactory에 주석처리된걸로 바꾸면 얘도 가능함, 이거 중요하다는데 나 솔직히 모르겠어 . 3.26 수업,
    }


}