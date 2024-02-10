package collection.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        var i = "Hello";
        i = "haha";
        System.out.println(i);
        List<Integer> nums = Arrays.asList(4,5,1,8,2,3,6);

//        for (int n : nums) {
//            System.out.println(n);
//        }
        Consumer<Integer> con = new Consumer<Integer>() { // how to work forEach..
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        nums.forEach(con);

        //nums.forEach(n -> System.out.println(n));
        nums.forEach(System.out::println); // :: is consumer
    }
}
