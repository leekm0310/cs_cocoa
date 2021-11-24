package day18;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PaintTool {
    public static void main(String[] args) {
        Frame f = new Frame("Paint Tool");
        f.setSize(700,700);
        f.setLayout(null);

        Canvas c = new Canvas();
        c.setBackground(Color.lightGray);
        c.setBounds(100,100,500,500);

        f.addWindowListener(new EventHandler());
        f.add(c);
        f.setVisible(true);


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