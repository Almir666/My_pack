package test.Exeption.Dz.three;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;

public class SaveFileData {
    String name;
    File file;

    public void SaveData(UserData userInfo) throws IOException {
        name = "test/Exeption/Dz/three/" + userInfo.getUserInfobyIndex(0) + ".txt";
        writeFile(userInfo, checkSameName());
    }

    private boolean checkSameName() {
        File oldFile = new File("test/Exeption/Dz/three/");
        return oldFile.exists();
    }

    private void writeFile(UserData userInfo, boolean value) throws IOException {
        file = new File(name);
        try (FileWriter fw = new FileWriter((file), StandardCharsets.UTF_8, value);
            BufferedWriter writer = new BufferedWriter(fw)) {

            for (String sourse : userInfo.getData()) {
                writer.append(sourse).append(" ");
            }
            writer.newLine();
        }
    }





    // public SaveFileData() {
    //     // data = new UserData();
    //     file = new File("%s.txt", data.getUserInfobyIndex(0));
    // }

    // public void SaveData(String pathname, String data) throws IOException {
    //     file = new File("%s.txt", pathname);
    //     try (PrintWriter pw = new PrintWriter(file)) {
    //         // file.createNewFile();
    //         pw.println(data);
    //         pw.close();
    //     }
    // }
}
