import java.awt.*;
import java.awt.event.*;
import java.util.function.Function;
import javax.swing.*;
import javax.swing.JOptionPane;

public class _radioButton extends JFrame {
    private final JTextField textField;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalic;

    // radio button
    private JRadioButton _plainButton;
    private JRadioButton _boldButton;
    private JRadioButton _italic;
    private JRadioButton _italicBold;
    private ButtonGroup groupButton;

    public _radioButton() {
        super("Title");
        setLayout(new FlowLayout());

        textField = new JTextField("PlaceHolder....");
        add(textField);

        _plainButton = new JRadioButton("Plain", true);
        _boldButton = new JRadioButton("Bold", true);
        _italic = new JRadioButton("Italic", true);
        _italicBold = new JRadioButton("Both", true);

        add(_plainButton);
        add(_boldButton);
        add(_italic);
        add(_italicBold);

        groupButton = new ButtonGroup();
        groupButton.add(_plainButton);
        groupButton.add(_boldButton);
        groupButton.add(_italic);
        groupButton.add(_italicBold);

        plainFont = new Font("Serif", Font.PLAIN, 15);
        boldFont = new Font("Serif", Font.BOLD, 15);
        italicFont = new Font("Serif", Font.ITALIC, 15);
        boldItalic = new Font("Serif", Font.BOLD + Font.ITALIC, 15);
        textField.setFont(plainFont);

        newFunction addFunction = new newFunction();

        textField.addActionListener(addFunction);
        // wait for the event to happen.
        // pass in font object to cons
        _plainButton.addItemListener(new classHandler(plainFont));
        _boldButton.addItemListener(new classHandler(boldFont));
        _italic.addItemListener(new classHandler(italicFont));
        _italicBold.addItemListener(new classHandler(boldItalic));
    }

    private static class newFunction implements ActionListener {
        public void actionPerformed(ActionEvent newEvent) {
            String text = "";
            text = String.format("%s", newEvent.getActionCommand());
            JOptionPane.showMessageDialog(null, text+" You have done well");
        }
    }

    private class classHandler implements ItemListener {
        private final Font font;

        // the font object gets variable font
        public classHandler(Font _font) {
            font = _font;
        }

        // sets font to the font object
        // changes the text inside the box.
        public void itemStateChanged(ItemEvent event) {
            textField.setFont(font);
        }
    }
}
