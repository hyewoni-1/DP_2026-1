package practice.ch22.drawer;

import practice.ch22.command.Command;
import java.awt.Point;

//점을 그리는 명령 클래스
public class DrawCommand implements Command {
    // 그리는 대상 
    protected Drawable drawable;

    // 그리는 위치 
    private Point position;

    // 생성자 
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable; //어느 도화지에
       
        this.position = position; //  어떤좌표에 그리는지, 
    }

    // 실행
    @Override
    public void execute() {
        drawable.draw(position.x, position.y); //도화지에 그려라~하는 실행
    }
}
