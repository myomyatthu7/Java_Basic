package tryAndCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryAndCatch {
    public static void main(String[] args)  {
//        File f= new File("text.txt");
//        doIt(f);

//        File f = new File("text.txt");
//        Machine.read(f);

//        File f = new File("text.txt");
//        try {
//            Machine.read(f);
//        } catch (FileNotFoundException | HaveNoInternet e) {  // Multi catch
//            throw new RuntimeException(e);
//        }

        File f = new File("text1.txt");
        try {
            FileReader fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void doIt(File f) {

//        try {
//            FileReader fr = new FileReader(f);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


    }
}
