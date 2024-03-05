package java_update;

import java.util.Arrays;

public class MyVar {

    int a = 6;
    // var b = 7; // can't use instance variable

//    class var{ // var can't use in class name.
//
//    }
    public static void main(String[] args) {
        int x= 9;
        var y = 4;
        int z;
        int var = 2; // var can use in variable name.
        // var q; // need initialize
        //System.out.println(z);
        System.out.println(y);
        int nums[] = new int[4];
        var num = new int[5]; // can't use var num[];
        System.out.println(Arrays.toString(num));
    }
}