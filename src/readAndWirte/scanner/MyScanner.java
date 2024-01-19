package readAndWirte.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) throws IOException {
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
        String fileName = "scan.txt";
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        fw.write(data);
        fw.close();

        Scanner s = new java.util.Scanner(f);
        while (s.hasNextLine()) {
            System.out.print(s.nextLine()+"\n"); // allow
        }

        // allow
//        Scanner s = new Scanner(f);
//        s.useDelimiter("\\z");
//        System.out.println(s.next());
    }
}
