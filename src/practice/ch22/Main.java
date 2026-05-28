package practice.ch22;

import practice.ch22.command.*;
import practice.ch22.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Main 자체가 하나의 윈도우가 된다           //마우스 움직이는거 버튼누른상태,안누른상태//윈도우 _ㅁx 나 확대 축소,, 감지
public class Main extends JFrame implements MouseMotionListener, WindowListener {   //다중상속안돼서 인터페이스로 구현
    // 그리기 이력   
    private MacroCommand history = new MacroCommand();
    // 그리는 영역 
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 삭제 버튼
    private JButton clearButton  = new JButton("clear"); //javax.swing.*;에 있는 것


    // 실행 취소 버튼(undo)
    //private JButton undoButton  = new JButton("undo");

    // 생성자 
    public Main(String title) {
        super(title);

        this.addWindowListener(this);

        canvas.addMouseMotionListener(this);//캔버스에서 작업할거니까 canvas에 마우스 모션 리스너 달아주기
        //드래그 할때는 안잡힘 
        
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();  //히스토리를 지우고 캔버스를 다시 그려라~라는 의미. repaint()가 호출되면 자동으로 paint()가 호출된다. 
            // 그래서 paint()에서 history.execute()가 호출되고, 그 결과로 캔버스가 초기화된 상태로 다시 그려진다.
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS); //가로 배치
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS); //세로 배치
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox); //요기에 뭘 해야한대

        pack();
        setVisible(true); //화면이 보여지게함
    }

    // MouseMotionListener용
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouseMoved: " + e.getPoint()); //마우스의 좌표가 터미널에 께속 찍한다
    }

    @Override //커맨드 패턴의 핵심 드래그될떄!  커맨드 패턴의 핵심
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouseDragged: " + e.getPoint());

        Command cmd = new DrawCommand(canvas, e.getPoint()); //명령어 객체가 생성됨.
        history.append(cmd);//명령어 객체를 이력에 추가함
        cmd.execute(); //명령어 객체를 실행함
    }

    // WindowListener용 
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);//x누르면 종료되는 이유 
        //위의 코드없어도 x누르면 종료되긴하는데? ,, 프로그램이 완전히 종료되는게 아니라 창만 닫히는거라서, 창이 닫히면 프로그램도 종료되도록 하는 코드가 필요하다.
       //저거 없으면 그냥 윈도우만 사라지는것
       
        System.out.println("windowClosing");
    }

    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}  //new Main("Command Pattern Sample");이렇게 하면 Main 클래스의 생성자가 호출되고, 
// 그 안에서 윈도우가 만들어지고, 마우스 이벤트 리스너가 등록되고, 버튼이 만들어지고, 화면이 보여지게 됩니다.
