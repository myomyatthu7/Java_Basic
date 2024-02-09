package collection.array;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
//        int []collection.array = new int[3];
//        String []name = {"Mg Mg", "Su Su", "Nu Nu", "Kyaw Kyaw"};
//        int []num = new int[] {0,1,2};
//        //String []num =
//        collection.array[0] = 5;
//        collection.array[1] = 4;
//        collection.array[2] = 3;
//
//        boolean bol = Arrays.asList(name).contains("Su Su");
//        int []copyArray = new int[3];
//       //System.arraycopy(num,copyArray,from,to);
//        System.out.println(bol);
//        //name[4] = "Hla Hla"; out of bounds
//        System.out.println(collection.array[2]);
//        System.out.println(collection.array[0] + collection.array[1]);
//        System.out.println(Arrays.toString(collection.array));
//        System.out.println(Arrays.toString(name));

//        int []num = new int[3];
//        num[0] = 1;
//        num[1] = 2;
//        num[2] = 3;
//        System.out.println(Arrays.toString(num));
//        String []name = {"Mg Mg","Aung Aung","Nu Nu"};
//        name[2] = "Su Su";
//        System.out.println(Arrays.toString(name));
//        int []no = new int[] {11,12,13,14};
//        no[3] = 3;
//        System.out.println(Arrays.toString(no));
//        boolean bol= Arrays.asList(name).contains("Mg Mg");
//        System.out.println(bol);
//        int []copyArray = new int[5];
//        System.arraycopy(no,0,copyArray,1,3);
//        System.out.println("Copy" +Arrays.toString(copyArray));
//
//        int [][] twoArray =  {
//                {
//                    1,2,3,4
//                },
//                {
//                    5,6,7
//                },
//                {
//                    8,9,10
//                }
//        };
//        int x = twoArray[1][0];
//        System.out.println(x);
//        if (x == 7) {
//            System.out.println("X is 7");
//        } else if (x == 5) {
//            System.out.println("x is 5");
//        } else {
//            System.out.println("X isn't 7");
//        }
        //14/10/2023
       int [] number = new int[3];
       number[0] = 1;
       number[1] = 2;
       number[2] = 3;
        System.out.println(number[1]+number[2]);
        System.out.println();

        String [] name = {"Mg Mg","Aung Aung","Su Su","Nu Nu"}; // MyArray.MyArray Initialization
        System.out.println(name[2]);

        int [] age = new int[] {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(age));

        int [] copyAge = new int[7];
        //System.arraycopy(age,2,copyAge,2,5);
        //System.out.println(Arrays.toString(copyAge));
        int [] copyAges = Arrays.copyOfRange(age,0,7);
        System.out.println(Arrays.toString(copyAges));
        System.out.println(copyAges.length);


    }
}
