import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout extends JFrame {
    private JButton _left;
    private JButton _center;
    private JButton _right;
    private FlowLayout layout;
    private Container container;

    public Layout() {
        super("Heading");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        // this is the left button.
        _left = new JButton("Left");
        add(_left);
        _left.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );

        _center = new JButton("Center");
        container = getContentPane();
        setLayout(layout);
        add(_center);
        _center.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );

        _right = new JButton("Right");
        container = getContentPane();
        setLayout(layout);
        add(_right);
        _right.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );
    }
}
