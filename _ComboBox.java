import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.util.function.Function;
import javax.swing.*;

public class _ComboBox extends JFrame {
    private JComboBox newBox;
    private final JLabel picture;
    // this sets the name of each label.
    private static final String[] _fileName = {"orange.png", "green.png"};
    private final Icon[] pic = {new ImageIcon(Objects.requireNonNull(getClass().getResource(_fileName[0])))};

    public _ComboBox() {
        // just the title.
        super("Put Something");
        setLayout(new FlowLayout());
        JComboBox<String> newBox = new JComboBox<>(_fileName);

        newBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        try {
                            if (e.getStateChange() == ItemEvent.SELECTED) {
                                int selectedIndex = newBox.getSelectedIndex();
                                picture.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(_fileName[selectedIndex]))));
                            }
                        } catch (Exception ee) {
                            System.out.println("Error: " + ee);
                        }
                    }
                }
        );
        add(newBox);
        picture = new JLabel(pic[0]);
        add(picture);
    }
}
