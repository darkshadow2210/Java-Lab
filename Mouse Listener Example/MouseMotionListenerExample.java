import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample extends Frame implements MouseMotionListener {
    Label l;
    MouseMotionListenerExample() {
        l = new Label();
        l.setBounds(20, 50, 200, 20);
        add(l);
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged at" + e.getX() + "," + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved at" + e.getX() + "," + e.getY());
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}