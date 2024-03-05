package collection.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class MyComparator {
    public static void main(String[] args) {
        Comparator<Integer> com = (n1, n2) -> { // second number sort.

            if (n1%10 > n2%10) return 1;
            else return -1;
        };
        List<Integer> nums =  new ArrayList<>();
        nums.add(28);
        nums.add(65);
        nums.add(15);
        nums.add(93);
        nums.add(31);

        Collections.sort(nums,com);

        for (int n : nums) {
            System.out.println(n);
        }


        Comparator<String > comparator = new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.length() > name2.length() ? 1 : -1;
            }
        };
        List<String> name =  new ArrayList<>();

        name.add("Mg Mg");
        name.add("Aung Aung");
        name.add("Hla Nu");
        name.add("Kyaw Mg");
        name.add("Moe Moe Mg");

        name.sort(comparator); // better use with list.

        for (String n : name) {
            System.out.println(n);
        }

    }
}
