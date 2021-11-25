package day18;

import java.awt.*;
import java.awt.event.*;

class G3 extends Frame {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int dx1;
    private int dy1;
    private boolean isdrawing = false;
    private Image img = null;
    private Graphics gImg = null;
    private Button b1;

    public G3(String title){
        super(title);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setBounds(500,500,1000,1000);
        setLayout(new FlowLayout());

        addMouseListener(new Mouse());
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (isdrawing) {
                    dx1 = e.getX();
                    dy1 = e.getY();
                }
            }
        });

        b1 = new Button("line");
        add(b1);


        setVisible(true);
        img = createImage(500, 500);
        gImg = img.getGraphics();
        repaint();

    }




    public void paint(Graphics g){

        g.drawLine(x1,y1,x2,y2);
    }

    private class Mouse extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e){
            x1 = e.getX();
            y1 = e.getY();
        }
        @Override
        public void mouseReleased(MouseEvent e){
            x2 = e.getX();
            y2 = e.getY();
            repaint();
        }
    }

    public void actionPerformed(ActionEvent e){

    }
}