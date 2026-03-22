package practice.ch02.delegation;

//어턉터
//자바에서는 다중상속이 불가능(부모가 두 개 이상은 허용이 안됨)
//그래서 위임을 이용!!
public class PrintBannerAdapter02 extends Print { // 추상클래스 이미로 implements 아니고 extends
    private Banner banner; //배너 클래스의 인스턴스를 생성하여 필드에 할당

    public PrintBannerAdapter02(String string) {
        this.banner = new Banner(string); //banner클래스의 인스턴스를 생성하려 필드에할당
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); //배너 클래스의 메서들 르 호출하여 기능을 수행
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
 
    public String getyourname() {
        return "내이름";
    }


}  