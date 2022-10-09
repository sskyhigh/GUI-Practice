import java.awt.*;

public class Effect extends Thread{
    public void run() {
        try {
            while (true) {
               // yourLabel.setForeground(new Color(8, 12, 33)); // you can apply coloring logic
                Thread.sleep(500); //sleep for 0.5 secs , so your color changes twice every second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
