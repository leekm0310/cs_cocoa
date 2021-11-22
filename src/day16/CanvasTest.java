package day16;

import java.awt.*;

public class CanvasTest {
    public static void main(String[] args) {
        Frame f = new Frame("CanvasTest");
        f.setSize(300,200);
        f.setLayout(null); //Layout Manager 설정 해제

        Canvas c = new Canvas();
        c.setBackground(Color.pink); //캔버스 배경색 지정
        c.setBounds(50,50,100,100); // 범위 지정

        f.add(c);
        f.setVisible(true); //생성한 프레임 화면에 보이기
    }
}
