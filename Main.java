import javax.swing.*;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Heading");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        _moreShapes chooseColor = new _moreShapes();
        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.add(chooseColor);
    }
}
