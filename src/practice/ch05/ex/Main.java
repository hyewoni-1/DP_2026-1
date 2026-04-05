package practice.ch05.ex;

public class Main extends Thread{
    public static void main(String[] args) {
        //스레드를 2개 만듦
        Thread a = new Main("Tread A");
        Thread b = new Main("Treas B");
        Thread c = new Main("Treas C");
        
        

        a.start();
        b.start();
        c.start();


    }


    @Override
    //thread의 run()메소드를 오버라이드함
    //이 스레드 실행할 코드
    public void run() {  //이거 스레드가 하는일이 담겨있어서 꼭 구현해야함
            Singleton s= Singleton.getInstance();//싱글턴 인스턴스를 얻음
            System.out.println(getName() +":"+s); //인스턴스 참조값을 출력
    }
    public Main(String name){
        super(name);//thread 클래스의 생성자에 이름전달
    }
    

}
