import java.io.*;
import java.lang.*;
import java.util.*;

public class _addData {
    private Formatter formatter;

    public void _open() {
        try {
            formatter = new Formatter("outPut.txt");
        } catch (Exception e) {
            System.out.println("Error occurred ");
        }
    }

    public void _addRecords() {
        formatter.format("%s%s%s", "20", " Lol", " Nothing");
    }

    public void _close() {
        formatter.close();
    }
}
