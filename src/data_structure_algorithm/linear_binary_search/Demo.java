package data_structure_algorithm.linear_binary_search;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        int [] num = {2,3,4,7,9,11,17,24,25};
        //int [] nums = new int[17];
        int result1 = linearSearch(num, 24);
        //int result2 = binarySearch(num, 3,0,num.length-1);
        int result2 = binarySearch(num, 24);
        if (result1 == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(result1);
        }
        if (result2 == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(result2);
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

    // private static int binarySearch(int[] num,int target,int start,int end) {
    //     int step = 0;

    //     if (start <= end) {
    //         step++;
    //         int mid = (start+end) /2;
    //         if (num[mid]== target) {
    //             System.out.println("Binary Step : "+step);
    //             return mid;
    //         } else if (num[mid] < target) {
    //             System.out.println("Binary Step : "+step);
    //             return binarySearch(num, target, start+1, end);
    //         } else {
    //             System.out.println("Binary Step : "+step);
    //             return binarySearch(num, target, start, end-1);
    //         }
    //     }
    //     System.out.println("Binary Step : "+step);
    //     return -1;
    // }

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

    // Linear Step : 8
    // Binary Step : 3
    // 7
    // 7
}