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
    private boolean drawing = false;
    private Image img = null;
    private Graphics gImg = null;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private int shape;

    static class Shape{
        static final int Line = 1;
        static final int Circle = 2;
        static final int Rectangle = 3;
        static final int pen = 4;
    }

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
                if (drawing) {
                    dx1 = e.getX();
                    dy1 = e.getY();
                    repaint();
                }
            }
        });


        b1 = new Button("line");
        b2 = new Button("circle");
        b3 = new Button("rectangle");
        b4 = new Button("pen");
        b1.addActionListener(this::actionPerformed);
        b2.addActionListener(this::actionPerformed);
        b3.addActionListener(this::actionPerformed);
        b4.addActionListener(this::actionPerformed);

        addComponent();

        setVisible(true);
        img = createImage(500, 500);
        gImg = img.getGraphics();
//        repaint();

    }

    void addComponent(){
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }


    public void paint(Graphics g){
        if (shape == Shape.Line){
            g.drawLine(x1,y1,x2,y2);

        }
        if (shape == Shape.Circle) {
            g.drawOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x1 - x2), Math.abs(y1 - y2));

        }
        if (shape == Shape.Rectangle){
            g.drawRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x1 - x2), Math.abs(y1 - y2));

        }
        if (shape == Shape.pen){
            g.fillOval(dx1,dy1,10,10);
        }
    }

    public void update(Graphics g){
        paint(g);
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
        if (e.getSource() == b1){
            shape = Shape.Line;
            drawing = false;
        }
        if (e.getSource() == b2){
            shape = Shape.Circle;
            drawing = false;
        }
        if (e.getSource() == b3){
            shape = Shape.Rectangle;
            drawing = false;
        }
        if (e.getSource() == b4){
            shape = Shape.pen;
            drawing = true;
        }

    }
}