import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class pattern1 extends JPanel {
    private static final long serialVersionUID = 1L;
    public void paint(Graphics graphics) {
        setBackground(Color.white);
        graphics.fillRect(50, 50, 50, 50);
        setForeground(Color.black);
    }

    public static void main(String[] args) {
        pattern1 graphicsDemo = new pattern1();
        JFrame jFrame = new JFrame();

        jFrame.add(graphicsDemo);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}
