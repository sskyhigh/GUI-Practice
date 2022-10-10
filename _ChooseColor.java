import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _ChooseColor extends JFrame {
    private JButton button;
    private Color color = (Color.green);
    private JPanel panel;

    public _ChooseColor() {
        super("Heading");
        panel = new JPanel();
        panel.setBackground(color);

        button = new JButton("Choose a color");
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        color = JColorChooser.showDialog(null, "Pick a color", color);
                        if (color == null) {
                            color = (Color.magenta);
                        }
                        panel.setBackground(color);
                    }
                }
        );
        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
