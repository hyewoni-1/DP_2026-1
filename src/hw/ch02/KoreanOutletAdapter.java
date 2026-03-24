package hw.ch02;

class KoreanOutletAdapter implements Charger { // Charger 인터페이스 구현
    private KoreanOutlet koreanOutlet; // KoreanOutlet을 내부적으로 포함

    public KoreanOutletAdapter() {
        this.koreanOutlet = new KoreanOutlet();
    }

    @Override
    public int charge() {
        
        return koreanOutlet.provide(); 
    }
}