package collection.array;

import java.util.ArrayList;
import java.util.Collection;

public class MyArrayList {
    public static void main(String[] args) {
        Collection<Double> collection = new ArrayList<>();
        collection.add(5.0);
        collection.add(9.0);
        collection.add(1.0);
        collection.add(7.0);
       // collection.add("8");

        for (Double n : collection) {
            System.out.println(2 * n);
        }
    }
}
