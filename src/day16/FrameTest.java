package day16;

import java.awt.*;

public class FrameTest {
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setSize(300,200); // 프레임 사이즈
        f.setLayout(null); //레이아웃 매니저의 설정해제 - 프레임 내에서의 버튼 위치 설정 위함
        Button b = new Button("check"); //check 버튼 생성
        b.setSize(50,25);// 버튼 크기 설정
        b.setLocation(200,100); // 프레임 내에서의 버튼 위치 설정.
        f.add(b);// 생성된 버튼을 프레임에 포함시키기

        Choice day = new Choice(); //choice 객체 생성
        day.add("Monday"); //목록에 값 추가
        day.add("Tuesday");
        day.setSize(100,50);
        day.setLocation(100,100);
        f.add(day); //항상 생성하면 프레임에 add 해줘야 한다

        Label label = new Label("Hi there! How are you?"); //화면에 글자 표시, 설명이나 메시지를 나타낼 때 주로 사용
        label.setBounds(50,50,70,10);
        f.add(label);

        Toolkit tk = Toolkit.getDefaultToolkit(); //구현된 툴킷 객체를 얻고
        Dimension screenSize = tk.getScreenSize(); // 화면의 크기를 구한다

        //화면크기 절반값에서 프레임 크기 절반값을 뺀 위치로 하면
        //프레임이 화면 가운데 위치하게 됨
        f.setLocation(screenSize.width/2 - 150, screenSize.height/2 - 100);
        f.setVisible(true); //생성한 프레임 화면에 보이기

    }
}
