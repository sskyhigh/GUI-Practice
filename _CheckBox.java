import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class _CheckBox extends JFrame {
    private JTextField textHolder;
    private JCheckBox BoldBox;
    private JCheckBox ItalicBox;

    public _CheckBox() {
        super("Title");
        setLayout(new FlowLayout());
        textHolder = new JTextField("", 20);
        textHolder.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textHolder);

        BoldBox = new JCheckBox("Bold");
        ItalicBox = new JCheckBox("Italic");
        add(BoldBox);
        add(ItalicBox);


        newFunction addFunction = new newFunction();

        HandleClass Handle = new HandleClass();
        textHolder.addActionListener(addFunction);
        BoldBox.addItemListener(Handle);
        ItalicBox.addItemListener(Handle);

    }

    private class newFunction implements ActionListener {
        public void actionPerformed(ActionEvent newEvent) {
            String text = "";
            text = String.format("%s", newEvent.getActionCommand());
            JOptionPane.showMessageDialog(null, text);
        }
    }

    private class HandleClass implements ItemListener {
        public void itemStateChanged(ItemEvent NewEvent) {
            Font newFont;
            if (BoldBox.isSelected() && ItalicBox.isSelected()) {
                newFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (BoldBox.isSelected()) {
                newFont = new Font("Serif", Font.BOLD, 14);
            } else if (ItalicBox.isSelected()) {
                newFont = new Font("Serif", Font.BOLD, 14);
            } else {
                newFont = new Font("Serif", Font.PLAIN, 14);
            }
            textHolder.setFont(newFont);
        }
    }
}
