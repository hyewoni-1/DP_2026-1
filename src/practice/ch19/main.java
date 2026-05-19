package practice.ch19;

public class main {
    public static void main(String[] args) {
        //UI 프레임 생성
        SafeFrame frame = new SafeFrame("금고 경비 시스템");
        // 시계
        while(true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour); // 시간 설정
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }}







