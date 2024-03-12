package data_structure_algorithm;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        int [] num = {2,3,4,7,9,11,17,24,25};
        //int [] nums = new int[17];
        int result1 = linearSearch(num, 25);
        int result2 = binarySearch(num, 25);
        if (result1 == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(num[result1]);
        }
        if (result2 == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(num[result2]);
        }
    }

    private static int linearSearch(int[] num,int target) {
        int step = 0;
        for(int i = 0;i<num.length;i++) {
            step++;
            if (num[i] == target) {
                System.out.println("Linear Step : "+step);
                return i;
            }
        }
        System.out.println("Linear Step : "+step);
        return -1;
    }

    private static int binarySearch(int[] num,int target) {
        int start = 0;
        int end = num.length-1;
        int step = 0;
        while (start <= end) {
            step++;
            int mid = (start+end) /2;
            if (num[mid]== target) {
                System.out.println("Binary Step : "+step);
                return mid;
            } else if (num[mid] < target) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        System.out.println("Binary Step : "+step);
        return -1;
    }
}