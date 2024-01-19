package readAndWirte.readAllLine;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyReadAllLine {
    public static void main(String[] args) throws IOException {
        String fileName = "mine.txt";

        List <String> list;

        list = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

        for (String str : list) System.out.println(str);

        System.out.println("++++++++++++++++++++++++++++++++");

        String str = new String(Files.readAllBytes(Paths.get(fileName)));
        // String str = Arrays.toString(Files.readAllBytes(Paths.get(fileName))); မရ
        System.out.println(str);
    }
}
