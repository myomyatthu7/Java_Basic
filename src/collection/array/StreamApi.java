package collection.array;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,1,8,2,3,6);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n->n%2 == 0);

        Predicate<Integer> pre = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2 == 0;
            }
        };

        Stream<Integer> s3 = s2.map(n->n*2);

        Function<Integer,Integer> fun = new Function<Integer, Integer>() {
        // two type -> access type and return type
            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        //int result1 = s3.reduce(0, (c,e) -> c+e); // c is carry e is element
        int result1 = s3.reduce(0, Integer::sum); // lambda

        //s2.forEach(n -> System.out.println(n));
       // s3.forEach(System.out::println);
        // System.out.println(result1); //40

        int result2 = nums.stream()
                .filter(n->n%2 == 0)
                .map(n->n*2)
                .reduce(0, Integer::sum);
       // System.out.println(result2); //40
        // same output

        int result3=0;
        for (int n : nums) {
            if (n%2==0) {
                n = n* 2;
                result3 = result3 + n;
            }
        }
        //System.out.println(result3); //40


        // with sort example
        Stream<Integer> sorted = nums.stream()
                .filter(n->n%2==0)
                .sorted();
        sorted.forEach(System.out::println);
        // 2 4 6 8
    }
}
