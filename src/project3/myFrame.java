package project3;

import Project2.BarMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class myFrame extends JFrame {
    private String n;
    private JButton button;
    private JPanel p4o;
    private JPanel p4m;
    private JPanel p4b;
    private JLabel label;
    private HashMap<String, String[]> liqMenus;
    private ArrayList<String> r = new ArrayList<>();
    private ArrayList<JLabel> lL = new ArrayList<>();
    private BarMenu b = new BarMenu();

    String[] list = new String[]{"소주", "진", "보드카","위스키",
    "탄산수","콜라","라임","레몬", "완료", "리셋"};

    public void run() throws IOException {
        liqMenus = b.init();
        
    }


    public myFrame() {
        super("TEST");
        setLayout(new FlowLayout());
        setSize(700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void WindowTest() {
        panelMaker();
        buttonList();
        setVisible(true);
    }

    void panelMaker(){
        p4o = new JPanel();
        p4o.setLayout(new FlowLayout());
        p4o.setPreferredSize(new Dimension(700,400));
        p4o.setBackground(Color.LIGHT_GRAY);

        add(p4o);

        p4m = new JPanel();
        p4m.setLayout(new FlowLayout());
        p4m.setPreferredSize(new Dimension(700,50));
        p4m.setBackground(Color.ORANGE);
        add(p4m);

        p4b = new JPanel();
        p4b.setLayout(new FlowLayout());
        p4b.setPreferredSize(new Dimension(700,50));
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


     ArrayList actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("리셋")) {
            r.clear();
        } else if (e.getActionCommand().equals("완료")){
            System.out.println(r);

        } else {
            r.add(e.getActionCommand());
//            String a = e.getActionCommand();
//            showIn(r);
//            label = new JLabel(a);
//            label.setVisible(true);
//            p4m.add(label);
        }
        return r;
    }

//    void showIn(ArrayList r){
//        for (Object object : r){
//            String element = (String) object;
//            label = new JLabel(element);
//            label.isVisible();
//            p4m.add(label);
//
//        }
//    }
}


class Test{
    public static void main(String[] args) {
        myFrame m = new myFrame();
        m.WindowTest();
    }
}
