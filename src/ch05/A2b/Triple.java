package ch05.A2b;

public enum Triple {
    ALPHA, BETA, GAMMA;// 각 상수의 Triple 인스턴스 하나씩 생성되어 저장됨, (아 아까 INSTANCE 그게 걍 명칭이아니라 이름이였나봐 enum 하고 변수; 햐면 되는 듯)

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name); //들어오는 String name의 name의 vlaueof르 뱉는건가봐. 
    }
}
