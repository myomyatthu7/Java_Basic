package recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(myRecursion(5));
    }

    public static int myRecursion(int num) {

        if (num == 0) {
            System.out.println("if"+num);
            return 1;
        }
        System.out.println(num);
        return myRecursion(num-1)*num;
    }
}
