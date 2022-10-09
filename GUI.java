import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GUI extends JFrame {
    private JButton regular;
    private JButton customButton;

    public GUI() {
        super("ATM Machine");
        setLayout(new FlowLayout());

        regular = new JButton("Regular Button");
        add(regular);

        Icon blueIcon = new ImageIcon(getClass().getResource("blue.png"));
        Icon greenIcon = new ImageIcon(getClass().getResource("green.png"));

        customButton = new JButton("Custom", blueIcon);
        customButton.setRolloverIcon(greenIcon);
        add(customButton);

        HandleClass Handler = new HandleClass();
        regular.addActionListener(Handler);
        customButton.addActionListener(Handler);

    }
    private class HandleClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}
