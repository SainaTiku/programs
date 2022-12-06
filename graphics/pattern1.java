import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class pattern1 extends Frame {
    public void paintComponent(Graphics g) {
        int x = getSize().width / 2 - 10;
        int y = getSize().height / 2 - 10;
        int width = 20;
        int height = 20;
        int startAngle = 0;
        int arcAngle = 180;
        int depth = 10;
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, -arcAngle);
            } else {
                x = x - 2 * depth;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, arcAngle);
            }
        }
    }
}



