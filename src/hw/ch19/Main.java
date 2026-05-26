package hw.ch19;


public class Main {
    public static void main(String[] args) {

        SafeFrame frame = new SafeFrame("State Sample");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("4.1 17시 정각이 되었을 때 출력");
        int hour = 17;
   
        frame.setClock(hour);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        hour = 18;
        frame.setClock(hour);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
       

        System.out.println("\n4.2 ClosingState 상태에서 [금고 사용 버튼] 클릭 시 출력 ");
     
        System.out.println("[금고 사용 버튼]");
        ClosingState.getInstance().doUse(frame); 


        System.out.println("\n4.3 ClosingState 상태에서 [일반 통화 버튼] 클릭 시 출력");
    
        System.out.println("[일반 통화 버튼]");
        ClosingState.getInstance().doPhone(frame);


        System.out.println("\n4.4 ClosingState 상태에서 [비상벨 버튼] 클릭 시 출력");
     
        System.out.println("[비상벨 버튼]");
        ClosingState.getInstance().doAlarm(frame); 
    }
}