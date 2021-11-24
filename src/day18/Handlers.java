//package day18;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MouseHandler extends Frame implements MouseMotionListener, MouseListener {
//    int x = 0;
//    int y = 0;
//
//    @Override
//    public void mouseDragged(MouseEvent e) {
//
//        Image img = createImage(500,500);
//        Graphics gImg = img.getGraphics();
//        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) return;
//        gImg.drawLine(x,y,e.getX(),e.getY());
//            x = e.getX();
//            y = e.getY();
//            repaint();
//            setVisible(true);
//        }
//
//    @Override
//    public void mouseMoved(MouseEvent e) {
//        x = e.getX();
//        y = e.getY();
//    }
//    @Override
//    public void mouseClicked(MouseEvent e) {}
//    @Override
//    public void mousePressed(MouseEvent e) {}
//    @Override
//    public void mouseReleased(MouseEvent e) {}
//    @Override
//    public void mouseEntered(MouseEvent e) {}
//    @Override
//    public void mouseExited(MouseEvent e) {}
//
//}
//
//class EventHandler implements WindowListener {
//
//    @Override
//    public void windowOpened(WindowEvent e) {}
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        e.getWindow().setVisible(false);
//        e.getWindow().dispose();
//        System.exit(0);
//    }
//    @Override
//    public void windowClosed(WindowEvent e) {}
//    @Override
//    public void windowIconified(WindowEvent e) {}
//    @Override
//    public void windowDeiconified(WindowEvent e) {}
//    @Override
//    public void windowActivated(WindowEvent e) {}
//    @Override
//    public void windowDeactivated(WindowEvent e) {}
//}
//
//
//class Handlers {}