package practice.ch22.drawer;

import practice.ch22.command.MacroCommand;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrawCanvas extends Canvas implements Drawable {//implements Drawable!!
    // 그리는 색 
    private Color color = Color.red;
    // 그리는 점의 반지름 
    private int radius = 6; //펜두께 반지름이 6인 원을 그려라~라는 의미
    // 이력 
    private MacroCommand history;

    // 생성자 
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    // 이력 전체 다시 그리기 
    @Override
    public void paint(Graphics g) { //repaint()가 호출되면 자동으로 호출죄는 메서드
        history.execute();
    }

    // 그리기  (핵심)
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        //x,y에 그리기 위해 반지름만큼 빼서 그려야함.
    }
}
