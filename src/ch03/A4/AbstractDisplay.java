package ch03.A4;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    public default void display() { //연습문제 3-4
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
