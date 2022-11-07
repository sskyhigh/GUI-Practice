import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.IDN;
import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

class _Browser extends JFrame implements HyperlinkListener {
    private final JButton button;
    JEditorPane editorPane = new JEditorPane();
    private final JLabel _status = new JLabel(" ");

    public _Browser() {
        //JOptionPane.showMessageDialog(null, "Outdated Browser, stolen code~");
        JPanel holdURL = new JPanel();
        holdURL.setLayout(new BorderLayout());
        holdURL.add(new JLabel("输入网站 : "), BorderLayout.WEST);
        JTextField theBar = new JTextField("");
        holdURL.add(theBar, BorderLayout.CENTER);

        button = new JButton("Slap me");
        button.setLayout(new FlowLayout());
        add(button, BorderLayout.SOUTH);
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        try {
                            String url = event.getActionCommand().toLowerCase();
                            // to save some time not needing to type http//
                            if (url.startsWith("https://"))
                                url = url.substring(15);
                            editorPane.setPage("https://" + IDN.toASCII(url));
                        } catch (Exception e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(_Browser.this, "You just got hacked: " + e.getMessage());
                        }
                    }
                }
        );
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    String url = event.getActionCommand().toLowerCase();
                    // to save some time not needing to type http//
                    if (url.startsWith("https://"))
                        url = url.substring(10);
                    editorPane.setPage("https://" + IDN.toASCII(url));
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(_Browser.this, "You just got hacked: " + e.getMessage());
                }
            }
        };


        getContentPane().add(button, BorderLayout.CENTER);
        getContentPane().add(holdURL, BorderLayout.NORTH);
        getContentPane().add(editorPane, BorderLayout.CENTER);
        getContentPane().add(_status, BorderLayout.SOUTH);

        theBar.addActionListener(actionListener);
        setSize(600, 600);
        setVisible(true);
        setBackground(Color.orange);
    }

    public void hyperlinkUpdate(HyperlinkEvent _link) {
        HyperlinkEvent.EventType type = _link.getEventType();
        if (type == HyperlinkEvent.EventType.ENTERED)
            _status.setText(_link.getURL().toString());
        else if (type == HyperlinkEvent.EventType.EXITED)
            _status.setText("I am monitoring you...");
    }
}
