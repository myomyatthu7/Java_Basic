package readAndWirte;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter {
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
        String fileName = "print.txt";
        //File file = new File(fileName);
        java.io.PrintWriter pw = new java.io.PrintWriter(fileName);
        pw.write(data);
        pw.close();

    }
}
