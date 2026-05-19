package practice.ch19;
//주간상태를 나타내는 클레스
public class DayState implements State {
    private static DayState singleton = new DayState();
    //1.
    private DayState() { //2.싱글턴패텅, 셍성자는 프라이빗
    }

    public static State getInstance() {
        return singleton;
    }//3. 공개된 정적 메소드로 객체를 반환

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
