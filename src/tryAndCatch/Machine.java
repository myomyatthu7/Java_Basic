package tryAndCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Machine {
    public static void read(File f) throws FileNotFoundException, HaveNoInternet {

            FileReader fr = new FileReader(f);

        boolean isConnected = false;
        if (!isConnected) {
            throw new HaveNoInternet("Have no internet connection");
        }
    }
}
