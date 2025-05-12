import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

    public void init() {
        System.out.println("Applet Initialised");
    }

    public void start() {
        System.out.println("Applet execution starts");
    }

    public void stop() {
        System.out.println("Applet execution stopped");
    }

    public void paint(Graphics g) {
        System.out.println("Painting...");
        g.drawString("Hello from Applet!", 20, 20);
    }

    public void destroy() {
        System.out.println("Applet destroyed");
    }
}
