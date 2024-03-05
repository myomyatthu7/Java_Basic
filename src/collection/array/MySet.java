package collection.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import ControlFlow.Switch;

public class MySet {
    public static void main(String[] args) {
        //Set<Integer> nums = new HashSet<>();
        Set<Integer> nums = new TreeSet<>(); // sortedSet
        nums.add(64);
        nums.add(88);
        nums.add(75);
        nums.add(13);
        nums.add(24);
        nums.add(39);
        nums.add(95);

        //nums.remove(9); // 9 is removed.

//        for (int i : nums) {
//            System.out.println(i);
//        }

        Iterator<Integer> n = nums.iterator();
        while (n.hasNext()) {
            System.out.println(n.next());
        }
    }
}
