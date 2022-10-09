// learning on my own~
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.util.function.Function;
import javax.swing.*;

public class _arrayOfFonts extends JFrame {
    private Font[] Fonts = {
            new Font("Serif", Font.BOLD, 14),
            new Font("Serif", Font.ITALIC, 14),
            new Font("Serif", Font.PLAIN, 14),
            new Font("Serif", Font.BOLD + Font.ITALIC, 14)
    };
    private final JTextField textField;
    private final JComboBox jComboBox;

    public _arrayOfFonts() {
        super("Fonts");
        textField = new JTextField("Type something here");
        setLayout(new FlowLayout());
        jComboBox = new JComboBox(Fonts);

        add(jComboBox);
        jComboBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            textField.setFont(Fonts[jComboBox.getSelectedIndex()]);
                        }
                    }
                }
        );
        textField.setFont(Fonts[0]);
        add(textField);
    }
}
