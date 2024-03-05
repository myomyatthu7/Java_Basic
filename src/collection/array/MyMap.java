package collection.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        //Map<String,Integer> student = new HashMap<>();
        Map<String,Integer> student = new TreeMap<>(); // to sort(Key).
        // Map<String,Integer> student1 = new LinkedHashMap<>(); // first in,first out.
        student.put("Aung Mg",45);
        student.put("Mg Kyaw",50);
        student.put("Hla Mg",42);
        student.put("Su Su",60);
        student.put("Nu Su",65);

        for (String key : student.keySet()) {
            System.out.println(key + " : "+ student.get(key));
        }
    }
}
