package practice.ch16;
//윈도구 제공(GUI),중재자 역할도 한다.
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {  //->버튼에서 행동발생? 로그인 프레임에서 일을한다, ActionListener
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;//변수들 설정

    // Colleague를 생성하고 배치한 후에 표시한다
    public LoginFrame(String title) {
        super(title);

        // 배경색을 설정한다
        setBackground(Color.lightGray);

        // 레이아웃 매니저를 사용해 4×2 그리드를 만든다 . 이거 중요,어떻게 gui컴포넌트 배치할건지 관리하는 객체  
        setLayout(new GridLayout(4, 2));//setLayout를 사용해서 매니저를 넣어준다. grid는 표~ gui컴포넌트를 표 형태로 배치하게된다, 


        // Colleague를 생성한다 =>생성했다고 해서 바로 보이는 것은 아니다, 반드시 배치를 해야 보인다. 
        createColleagues(); 

        // 배치한다 
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);// 4×2 그리드에 맞게 배치

        // 활성/비활성 초기 설정을 한다
        colleagueChanged(); 

        // 표시한다 // 표시하는 문장 2개 반드시~~!!
        pack(); //배치시킨 gui컴포넌트 정리
        setVisible(true); //true를 줬기 때문에 보인다. 
    }

    // Colleague를 생성한다
    @Override
    public void createColleagues() {
        // CheckBox
        CheckboxGroup g = new CheckboxGroup(); //체크박스 그룹g를 생성하고 게스트와 로그인을 넣는다.
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false); //g를 같은걸로 넣음, 한그룹으로 간주

        // TextField
        textUser = new ColleagueTextField("", 10); //컬럼은 기본적으로 10칸
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*'); //비밀번호는 *표시로 지정.

        // Button
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // Mediator를 설정한다 
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Listener 설정 또는 리스너 등록
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this); 
        buttonCancel.addActionListener(this);
    }

    // Colleage의 상태가 바뀌면 호출된다
    @Override //핵심~이게 제일 중요해!!
    public void colleagueChanged() {
        if (checkGuest.getState()) { //true이면 (게스트 로그인이면), ,, 
            // 게스트 로그인 
            textUser.setColleagueEnabled(false); //textuser는 비활성화 
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true); //버든ok는 활성화
        } else {
            // 사용자 로그인 
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    // textUser 또는 textPass의 변경이 있다 
    // 각 Colleage의 활성/비활성을 판정한다
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {//textUser가 비어 있지 않으면,,
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {//textUser가 비어있으면
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {  //->버튼에서 향동발생? 로그인 프레임에서 일을한다.  
        System.out.println(e.toString());
        System.exit(0);
    }
}
