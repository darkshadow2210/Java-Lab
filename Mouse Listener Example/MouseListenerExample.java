import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener {

    Label l;
    MouseListenerExample() {
        l = new Label();
        l.setBounds(20, 50, 200, 20);
        addMouseListener(this);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
