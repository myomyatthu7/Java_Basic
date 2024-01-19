package readAndWirte.fileWriter;


import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        MyFileWriter mfw = new MyFileWriter();
        mfw.doWrite();
        mfw.doRead();
    }
    String data = """
            With decades of maintenance of way expertise and experience,
            no one knows the rail like Loram.
            Today, with our Loram Technologies business group,
            we’re leveraging our accumulated data, analytics and\s
            maintenance algorithms with advanced inspection technologies\s
            to provide you actionable intelligence with real-time monitoring\s
            and the most precise application of maintenance of way activities.
            In this new era of digital insight,\s
            interval-based maintenance is a thing of the past.\s
            """;
    String fileName = "mine.txt";
    public void                            doWrite() throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write(data);
        String inputText = JOptionPane.showInputDialog("Add Text!");
        fw.append(inputText);
        fw.close();
    }
    public void doRead() throws IOException {
        FileReader fr = new FileReader(fileName);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
