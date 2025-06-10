import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class EventApplet extends Applet implements ActionListener {
    Button b;
    TextField tf;
    String s;

    public void init() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 30); 
        b = new Button("Click "); 
        b.setBounds(80, 150, 60, 30);
        
        add(b);
        add(tf);
        b.addActionListener(this);
        setLayout(null);
        
        s = getParameter("msg"); 
    }

    public void paint(Graphics g) {
        g.drawString("Applet Loaded", 50, 100);
    }

    public void actionPerformed(ActionEvent e) { 
        tf.setText(s);
    }
}