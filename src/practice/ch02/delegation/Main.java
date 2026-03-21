package practice.ch02.delegation;

public class Main {
    
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter02("Hello World");
        print.printWeak();   // (Hello World)
        print.printStrong(); // *Hello World *
    }
}
