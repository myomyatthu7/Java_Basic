package ControlFlow;

import java.lang.reflect.AnnotatedType;
import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i<7 ; i++) {
            System.out.println("I value is "+i);
        }
        int x = 0;
        while (x<5) {
            System.out.println("X value is "+x);
            x++;
        }
        do {
            System.out.println("Now x value is "+x);
            x++;
        } while (x<10);
        String[] names = {"Mg Mg", "Aung Aung", "Su Su", "Nu Nu"};
//        for (String name : names) {
//            System.out.println(name);
//        }
        for (int i=0; i < names.length; i++) {
            System.out.println("For "+ names[i]);
        }
        int z = 0;
        while (z<names.length) {
            System.out.println("While "+names[z]);
            z++;
        }
        int y = 0;
        do {
            System.out.println(names[y]);
            y++;
        }while (y<names.length);
    }
}
