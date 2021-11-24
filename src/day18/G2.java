package day18;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class G2 extends Frame implements MouseMotionListener {
    int x = 0;
    int y = 0;

    Image img = null;
    Graphics gImg = null;

    public G2(String title){
        super(title);
        setLayout(null);
        Button b1 = new Button("b1");
        b1.setBounds(50,50,50,50);

        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(b1);

        setBounds(100,100,500,500);
        setVisible(true);

        img = createImage(500,500);
        gImg = img.getGraphics();
        repaint();
    }

    public void paint(Graphics g){
        if (img == null) return;
        g.drawImage(img,0,0,this);
    }

    public void mouseMoved(MouseEvent me){
        x = me.getX();
        y = me.getY();
    }

    public void mouseDragged(MouseEvent me){
        if (me.getModifiersEx() != MouseEvent.BUTTON1_DOWN_MASK) return;
        gImg.drawLine(x,y,me.getX(), me.getY());
        x = me.getX();
        y = me.getY();

        repaint();
    }
}