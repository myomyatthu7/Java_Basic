package tryAndCatch.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws HaveNoInternet{
//        Reader r = new Reader();
//        File f = new File("tt.txt");
//        try {
//            r.doRead(f);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        ConnectInternet ci = new ConnectInternet();
        ci.connectInternet();
    }
}
class Reader {
    public void doRead(File file) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(file);
            fr.read();
            ConnectInternet cc = new ConnectInternet();
        } catch (FileNotFoundException e ) {
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class ConnectInternet {
    public void connectInternet() throws HaveNoInternet {
        boolean isConnected = false;
        if (!isConnected) {
            throw new HaveNoInternet("Have no InternetConnection");
        }
    }
}
class HaveNoInternet extends Exception {
    public HaveNoInternet(String Msg) {
        super(Msg);
    }
}
