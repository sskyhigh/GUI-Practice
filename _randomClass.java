import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

public class _randomClass extends JFrame {
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public _randomClass() {
        super("Title");
        setLayout(new FlowLayout());
        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("enter text here: ");
        add(item2);

        item3 = new JTextField("Not editable", 20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("Pass");
        add(passwordField);

        Handles handler = new Handles();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class Handles implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String newString = "";

            if (event.getSource() == item1) {
                newString = String.format("Field 1: %s", event.getActionCommand());
            } else if (event.getSource() == item2) {
                newString = String.format("Field 2: %s", event.getActionCommand());
            } else if (event.getSource() == item3) {
                newString = String.format("Field 3: %s", event.getActionCommand());
            } else if (event.getSource() == passwordField) {
                newString = String.format("Password field: %s", event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, newString);
        }
    }
}
