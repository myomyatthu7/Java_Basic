import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       String [] name = {"Mg Mg","Nu Nu","Su Su","Kyaw Kyaw"};
        System.out.println(Arrays.toString(name));
        System.out.println("=================================");
        int [] num1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(num1));
        System.out.println(num1[2]);
        System.out.println("=================================");
        int [] num2 = new int[3];
        num2[0] = 1;
        num2[1] = 2;
        num2[2] = 3;
        System.out.println(Arrays.toString(num2));
        System.out.println("=================================");
        boolean bol = Arrays.asList(num1).contains(6);
        System.out.println(bol);
        int[] copyArray = new int[6];
        //System.arraycopy(num2,0, copyArray,0,6);
        System.out.println("Copy"+ Arrays.toString(copyArray));

        int x = 6;
        if(x < 5) {
         System.out.println("X is greater than 5");
        } else if (x <= 0) {
         System.out.println("X is equal zero");
        } else {
         System.out.println("Else");
        }
        for (int i = 0; i < 5; i++) {
         System.out.println("I is " +i);
        }
        int z = 0;
        while (z<4) {
         System.out.println("Z is "+ z);
         z++;
        }
        int w = 5;
        do {
         System.out.println("W is " + w);
         w--;
        } while (w > 0);
    }
}