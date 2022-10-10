import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _Graphics extends JPanel {
    public void paintComponent(Graphics graphics) {
        JPanel panel = new JPanel();
        panel.paintComponents(graphics);

        graphics.setColor(Color.magenta);
        graphics.fillRect(25, 25, 150, 50);

        graphics.setColor(new Color(255, 51, 51));
        graphics.fillRect(25, 65, 150, 50);

        graphics.setColor(Color.orange);
        graphics.drawString("Text", 80, 150);
    }
}
