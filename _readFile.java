import java.io.*;
import java.util.*;

public class _readFile {
    private Scanner sc;

    public void _open() {
        try {
            sc = new Scanner(new File("outPut.txt"));
        } catch (
                Exception e) {
            System.out.println("File not found");
        }
    }

    public void _read() {
        try {
            while (sc.hasNext()) {
                String num = sc.next();
                String _first = sc.next();
                String _last = sc.next();

                System.out.printf("%s %s %s\n", num, _first, _last);
            }
        } catch (Exception e) {
            System.out.println("Error. ");
        }

    }

    public void _close() {
        sc.close();
    }

}
