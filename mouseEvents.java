import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// JFrame allows us to build windows
public class mouseEvents extends JFrame {
    private JPanel mousePanel;
    private JLabel statusBar;
    private JButton button;
    private JLabel text;

    public mouseEvents() {
        super("Heading");
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.white);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Default");
        add(statusBar, BorderLayout.SOUTH);

        _newHandler givesLife = new _newHandler();
        mousePanel.addMouseListener(givesLife);
        mousePanel.addMouseMotionListener(givesLife);

        text = new JLabel("Text");
        add(text, BorderLayout.NORTH);

    }

    private class _newHandler implements MouseListener, MouseMotionListener {
        // e.getX and e.getY() gets the coordinates
        // mouseListener has five methods.
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at %d, %d", e.getX(), e.getY()));
            statusBar.setBackground(Color.orange);
        }

        public void mousePressed(MouseEvent e) {
            statusBar.setText("You press the mouse. ");
        }

        public void mouseReleased(MouseEvent e) {
            statusBar.setText("You released button. ");
        }

        public void mouseEntered(MouseEvent e) {
            statusBar.setText("You've entered the area");
            mousePanel.setBackground(Color.YELLOW);
        }

        public void mouseExited(MouseEvent e) {
            statusBar.setText("Mouse is gone. ");
            mousePanel.setBackground(Color.cyan);
        }

        // MouseMotionListener has two methods
        // mouseMotion events.
        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText("Object has been dragged");
        }

        public void mouseMoved(MouseEvent e) {
            statusBar.setText("Mouse has been moved.");
        }
    }
}
