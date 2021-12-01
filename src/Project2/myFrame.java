package Project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class myFrame extends JFrame {
    private String n;
    private JButton button;
    private JPanel mp;
    private JPanel p4o;
    private JPanel p4b;
    String[] list = new String[]{"소주", "진", "보드카","위스키",
    "탄산수","콜라","라임","레몬", "완료", "다시 만들기"};


    public myFrame() {
        super("TEST");
        setLayout(new FlowLayout());
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void WindowTest() {
        panelMaker();
        buttonList();
        setVisible(true);
    }

    void panelMaker(){
        mp = new JPanel();
        mp.setLayout(new FlowLayout());
        mp.setPreferredSize(new Dimension(600,400));
        mp.setBackground(Color.LIGHT_GRAY);
        add(mp);

        p4o = new JPanel();
        p4o.setLayout(new FlowLayout());
        p4o.setPreferredSize(new Dimension(600,50));
        p4o.setBackground(Color.ORANGE);
        add(p4o);

        p4b = new JPanel();
        p4b.setLayout(new FlowLayout());
        p4b.setPreferredSize(new Dimension(600,50));
        p4b.setBackground(Color.PINK);
        add(p4b);
    }

    void buttonMaker(String name){
      button = new JButton(name);
      button.setText(name);
      button.addActionListener(this::actionPerformed);
      p4b.add(button);
    }

    void buttonList() {
        for (String i : list){
            buttonMaker(i);
        }
    }


    public void actionPerformed(ActionEvent e){
        System.out.println(e.getActionCommand());
    }
}

class Test{
    public static void main(String[] args) {
        myFrame m = new myFrame();
        m.WindowTest();
    }
}
