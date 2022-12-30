package test.Exeption.Dz.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveFileData {
    public void SaveData(String data, String pathname) throws FileNotFoundException{
        File file;
        PrintWriter pw;
        file = new File(pathname);
        pw = new PrintWriter(file);
        pw.println(data);
        pw.close();
    }
}
