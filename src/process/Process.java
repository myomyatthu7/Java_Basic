package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Process {
    public static void main(String[] args) {
        try {
            java.lang.Process process = Runtime.getRuntime().exec("adb shell dir");
            BufferedReader buff = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
