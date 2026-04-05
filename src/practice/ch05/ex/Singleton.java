package practice.ch05.ex;


public class Singleton {
    private static Singleton singleton = null; //싱글턴 객체에는 아직 변수가없다, 

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); //생성시간이 오래 걸리도록 함
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton(); //지금 없으니까 하나 만들고 만든걸 리턴한다. 2번째에는 ? false가 되니까 걍 리턴만..
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); //cpu를 내놓고 1초간 쉰다. 1000ms
        } catch (InterruptedException e) {
            //Thread.currentThread().interrupt();
        }
    }
}
