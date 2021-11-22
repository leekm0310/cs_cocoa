package day16;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameTest {
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setSize(300,200); // 프레임 사이즈
        //f.setLayout(null); //레이아웃 매니저의 설정해제 - 프레임 내에서의 버튼 위치 설정 위함
        f.setLayout(new FlowLayout());

        Choice day = new Choice(); //choice 객체 생성
        day.add("Monday"); //목록에 값 추가
        day.add("Tuesday");
        day.setSize(100,50);
        day.setLocation(100,100);
        f.add(day); //항상 생성하면 프레임에 add 해줘야 한다

        Button b = new Button("check"); //check 버튼 생성
        b.setSize(50,25);// 버튼 크기 설정
        //b.setLocation(200,100); // 프레임 내에서의 버튼 위치 설정.
        f.add(b);// 생성된 버튼을 프레임에 포함시키기

        Label question = new Label("Hi there! How are you?"); //화면에 글자 표시, 설명이나 메시지를 나타낼 때 주로 사용
        //question.setBounds(50,50,200,10);
        f.add(question);

        CheckboxGroup answer = new CheckboxGroup();  //체크박스 그룹 만들기
        Checkbox com1 = new Checkbox("Good", answer, true);
        Checkbox com2 = new Checkbox("Not bad", answer, false);
        Checkbox com3 = new Checkbox("Kill me", answer, false);
        f.add(com1); f.add(com2); f.add(com3);



        Toolkit tk = Toolkit.getDefaultToolkit(); //구현된 툴킷 객체를 얻고
        Dimension screenSize = tk.getScreenSize(); // 화면의 크기를 구한다

        //화면크기 절반값에서 프레임 크기 절반값을 뺀 위치로 하면
        //프레임이 화면 가운데 위치하게 됨
        f.setLocation(screenSize.width/2 - 150, screenSize.height/2 - 100);
        f.addWindowListener(new EventHandler()); // EventHandler 클래스의 객체를 생성해서 Frame의 WindowListener로 등록
        f.setVisible(true); //생성한 프레임 화면에 보이기

    }


    static class EventHandler implements WindowListener{
        @Override
        public void windowOpened(WindowEvent e) {}
        public void windowClosing(WindowEvent e) {      //frame 닫기 버튼을 눌렀을 때 호출
            e.getWindow().setVisible(false);        //frame을 화면세어 보이지 않도록하고
            e.getWindow().dispose();                //메모리에서 제거
            System.exit(0);                   //프로그램을 종료
        }

        public void windowClosed(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}

    }

}