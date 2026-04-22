package practice.ch11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        Directory ihw =new Directory("ihw");


        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        rootdir.add(ihw);

        ihw.add(new File("ihw1",100));
        ihw.add(new File("ihw2",200));
        ihw.add(new File("ihw3",300));


        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.printList();
        System.out.println();

        System.out.println("Making user entries...");
        Directory youngjin = new Directory("youngjin");
        Directory gildong = new Directory("gildong");
        Directory dojun = new Directory("dojun");

        usrdir.add(youngjin);
        usrdir.add(gildong);
        usrdir.add(dojun);

        youngjin.add(new File("diary.html", 100));
        youngjin.add(new File("Composite.java", 200));

        gildong.add(new File("memo.tex", 300));

        dojun.add(new File("game.doc", 400));
        dojun.add(new File("junk.mail", 500));

        
        rootdir.printList();

        System.out.println("부모타임으로 변수 선언하고 자식 객체를 참조하는 것이 가능하다. 다형성의 예시");
        Entry root2Entry = new Directory("root2"); //add는 못 부름  업캐스팅, 디렉토리형이  엔트리형으로 변환.
        //업케스팅은 자동변환, 다운캐스팅만 신경쓰면된다.

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");  
        Directory usr = new Directory("usr");


        ((Directory)root2Entry).add(bin); //add는 디렉토리에서만 가능하기 때문에, add를 호출하기 전에 root2Entry를 Directory로 형변환한다.
// 형변환(타입캐스팅) , .연산자가 형변환 연산자보다 우선순위가 높음
//위에서 아래쪽으러 형변환, 다운캐스팅


        ((Directory)root2Entry).add(tmp);
        ((Directory)root2Entry).add(usr);

        ((Directory)root2Entry).printList();






    }
}
