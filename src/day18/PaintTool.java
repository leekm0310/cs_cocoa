package day18;

import java.awt.*;
import java.awt.event.*;

public class PaintTool {

    public static void main(String[] args) {

        Frame f = new Frame("Paint Tool");
        f.setSize(700,700);
        f.setLayout(null);

        Panel p = new Panel();
        p.setBounds(100,100,500,500);
        Graphics gr = p.getGraphics();
        f.repaint();


        Button b1 = new Button("b1");
        b1.setBounds(50,50,50,50);
        Button b2 = new Button("b2");
        b2.setBounds(100,50,50,50);
        Button b3 = new Button("b3");
        b3.setBounds(150,50,50,50);
        Button b4 = new Button("b4");
        b4.setBounds(200,50,50,50);


        p.addMouseMotionListener(new MouseHandler());

        f.addWindowListener(new EventHandler());

        f.add(p);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setVisible(true);
    }

    static class MouseHandler extends Frame implements MouseMotionListener{
        int x = 0;
        int y = 0;
        public void paint(Graphics g){
//            if (gr == null) return;
//            g.drawLine(0,0,x ,y);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (e.getModifiersEx() != MouseEvent.BUTTON1_DOWN_MASK) return;
//            g.drawLine(x,y, e.getX(), e.getY());
            x = e.getX();
            y = e.getY();
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }
    }



    static class EventHandler implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {}

        @Override
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            e.getWindow().dispose();
            System.exit(0);
        }
        @Override
        public void windowClosed(WindowEvent e) {}
        @Override
        public void windowIconified(WindowEvent e) {}
        @Override
        public void windowDeiconified(WindowEvent e) {}
        @Override
        public void windowActivated(WindowEvent e) {}
        @Override
        public void windowDeactivated(WindowEvent e) {}
    }
}