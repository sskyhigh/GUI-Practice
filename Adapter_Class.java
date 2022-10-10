import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Adapter_Class extends JFrame {
    private String details;
    private JLabel statusBar;
    private JPanel panel;
    public Adapter_Class() {
        super("Heading");
        statusBar = new JLabel("This is default");
        // south goes down.
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());
        panel = new JPanel();
        panel.setBackground(Color.green);
        add(panel);
    }

    private class MouseClass extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            details = String.format("You clicked on this. %d", e.getClickCount());
            if (e.isMetaDown()) {
                details += "with right mouse button";
                panel.setBackground(Color.BLUE);
            } else if (e.isAltDown()) {
                details += "with center mouse button";
            } else {
                details += "with left mouse button";
            }
            statusBar.setText(details);
        }
    }
}
