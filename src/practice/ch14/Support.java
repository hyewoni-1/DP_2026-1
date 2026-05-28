package practice.ch14;

// 트러블 해결자
public abstract class Support {
    private String name;    // 이 트러블 해결자 이름
    private Support next;   // 떠넘길 곳(support가 부모타임 : 모든종류의 트러블 해결자를 가리킬수있다)

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    // 떠넘길 곳을 설정한다
    public Support setNext(Support next) {
        this.next = next;
        return next; //사슬 만들떄 중요하게 작용
    }

    // 트러블 해결을 요청하는 메소드 이게 핵심메소드
    public void support(Trouble trouble) {
        if (resolve(trouble)) { //자기가 해결하려고함, 
            done(trouble); //해결했다
        } else if (next != null) { //자기가 해결못했는데 뒷사람이 있으면,, 떠넘길 것이 있으면 떠넘긴다
            next.support(trouble); //뒷사람에게 해결을 떠넘긴다.
        } else { //자기도 해결못할때, 근데 떠넘길 사람이 없을 때
            fail(trouble); //해결 못했다고 선언한다
        }
    }

    // 트러블 해결자의 문자열 표현
    @Override
    public String toString() {
        return "[" + name + "]";
    }

    // 해결하려고 한다
    protected abstract boolean resolve(Trouble trouble); //자식들이 해결방법을 구현한다, 뭔자모르지만 자식들이 결정

    // 해결했다 
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결되지 않았다 
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
