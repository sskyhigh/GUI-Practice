import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        mouseEvents mouse = new mouseEvents();
        mouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouse.setSize(300, 200);
        mouse.setVisible(true);
    }
}
