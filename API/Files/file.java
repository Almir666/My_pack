package API.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class file {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hallo man");
        pw.close();
    }
}
