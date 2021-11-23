package day17;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Practice1 {
    public static void main(String[] args) {
        Frame f = new Frame("textarea");
        f.setSize(400,400);
        f.setLayout(new FlowLayout());

        TextArea comments = new TextArea("textarea test",10,50);

        Button b = new Button("confirm");
        b.setSize(10,10);

        Label contents = new Label("contents: ");
        contents.setBounds(350,350,10,10);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String c = "contents: " + comments.getText();
                contents.setText(c);
            }
        });


        f.add(comments);
        f.add(b);
        f.add(contents);

        f.addWindowListener(new EventHandler());
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