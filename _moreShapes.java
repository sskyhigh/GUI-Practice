// adding 3D shapes.. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _moreShapes extends JPanel {
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.setBackground(Color.green);

        graphics.setColor(Color.blue);
        graphics.drawLine(10, 30, 200, 45);

        graphics.setColor(Color.red);
        graphics.drawRect(10, 55, 150, 35);

        graphics.setColor(Color.CYAN);
        graphics.fillOval(10, 95, 150, 45);

        graphics.setColor(Color.YELLOW);
        graphics.fill3DRect(10, 150, 200, 50, true);

    }
}
