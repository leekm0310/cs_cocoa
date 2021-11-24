package day18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex {
    public static void main(String[] args) {
        Mine frame = new Mine("ex");
        frame.setVisible(true);
        frame.setBounds(200,200,500,500);
        frame.setLayout(new FlowLayout());
        frame.addComponent();

    }
}

class Mine extends Frame implements ActionListener{
    Button b1,b2,b3;
    int shape;

    static class Shape{
        static final int Line = 1;
        static final int OVAL = 2;
    }

    Mine(String title){
        super(title);
        b1 = new Button("line");
        b2 = new Button("circle");
        b3 = new Button("clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    void addComponent(){
        add(b1);
        add(b2);
        add(b3);
    }

    @Override
    public void paint(Graphics g){
        switch (shape){
            case Shape.Line:
                g.drawLine(100,100,300,300);
                break;
            case Shape.OVAL:
                g.drawOval(100,100,300,300);
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            shape = Shape.Line;
        } else if (e.getSource() == b2){
            shape = Shape.OVAL;
        }
        repaint();
    }
}