package collection.array;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparable {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student("Mg Mg",23));
        stu.add(new Student("Su Su",20));
        stu.add(new Student("Kyaw Mg",25));
        stu.add(new Student("Hla Mg",18));
        stu.add(new Student("Hla Nu",21));

//        Comparator<Student> comparator = (obj1,obj2) -> {
//                if (obj1.age > obj2.age) return 1;
//                else return -1;
//        };
        //stu.sort(comparator);

        Collections.sort(stu);
        for (Student s : stu) {
            System.out.println(s);
        }
    }
}
class Student implements Comparable<Student> {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(@NotNull Student that) {
        return this.age > that.age ? 1:-1;
    }
}