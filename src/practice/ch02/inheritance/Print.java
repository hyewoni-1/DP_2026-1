package practice.ch02.inheritance;

//클라이언트가 원하는 인터페이스, Target 인터페이스, 필요로하는 인터페이스
// public abstract class Print {
//     public abstract void printWeak(); //괄호
//     public abstract void printStrong(); //별표
// }
public interface Print {
    void printWeak();   // 괄호
    void printStrong(); // 별표
}