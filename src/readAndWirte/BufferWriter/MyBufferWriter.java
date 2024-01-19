package readAndWirte.BufferWriter;

import java.io.*;

public class MyBufferWriter {
    public static void main(String[] args) {
        MyBufferWriter mbw = new MyBufferWriter();
        //mbw.doWrite();
        mbw.doRead();
    }
    String fileName = "tet.txt";
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
    public void doWrite() throws IOException {
//        File f = new File(fileName);
//        FileWriter fw = new FileWriter(f);
//        BufferedWriter bw = new BufferedWriter(fw);
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName)));
        bw.write(data);
        bw.close();
    }
    public void doRead() {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine())!= null) System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
