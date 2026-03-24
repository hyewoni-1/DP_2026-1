package hw.ch02;

public class Main {
    public static void main(String[] args) {

        
        // KoreanOutletAdapter 생성
        Charger adapter = new KoreanOutletAdapter(); 
        
        // Smartphone에 전달 
        Smartphone myPhone = new Smartphone(adapter); 

        //스마트폰이 어댑터를 이용해서 충전이 가능해 짐
        myPhone.charge(); 
    }
}