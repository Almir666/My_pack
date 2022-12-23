package test.Exeption;

// import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String pathFile = "text.txt";
        Map<String, String> map = new HashMap<>();
        try {
            List<String> input = Files.readAllLines(Path.of(pathFile));
            for (String s : input) {
                String[] line = s.split("=");
                map.put(line[0], line[1]);
            }
            map.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
            System.err.println("error");
        }

        // String pathFile = "text.txt";
        // try {
        //     List<String> input = Files.readAllLines(Path.of(pathFile));
        //     input.forEach(System.out::println);
        // } catch (IOException exception) {
        //     System.err.println(exception.getMessage());
        //     System.err.println("error");
        // }

        // try(FileReader fr = new FileReader("text.txt")) {
        //     int c;
        //     while ((c = fr.read()) != -1) {
        //         System.out.println((char) c);
        //     }
        // }
        // catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }
    }
}
