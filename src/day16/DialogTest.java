package day16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {
    public static void main(String[] args) {
        Frame f = new Frame("parent");
        f.setSize(300,200);

        //parent frame 을 f로 하고 modal을 true로 해서 필수 응답 dialog로 만듦
        Dialog info = new Dialog(f, "Information", true);
        info.setSize(150,90);
        info.setLocation(50,50); //parent frame 기준 아닌 화면 위치의 기준
        info.setLayout(new FlowLayout());

        Label msg = new Label("modal dialog", Label.CENTER);
        Button ok = new Button("OK");

        ok.addActionListener(new ActionListener() { //ok를 클릭했을 때의 action을 정의하기 위함.
            @Override
            public void actionPerformed(ActionEvent e) { //ok 버튼을 누르면 수행됨
                info.setVisible(false); // dialog를 안보이게 한다
                info.dispose(); //dialog를 메모리에서 없앤다
            }
        });


        info.add(msg);
        info.add(ok);

        f.setVisible(true);
        info.setVisible(true); //dialog를 화면에 보이게 한다
    }
}
