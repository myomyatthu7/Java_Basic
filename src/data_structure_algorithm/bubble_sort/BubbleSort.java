package data_structure_algorithm.bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {4,1,3,9,6,2,7};
        //int nums[] = {1,2,3,4,5,6,7};
        int size = nums.length;
        int temp;

        System.out.println("Before Sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int i = 0;
        while (i < size) { // can also use with for loop;
            for(int j = 0;j < size-i-1 ; j++) {
                if (nums[j] > nums[j+1]) {
                    // temp = nums[j+1]; 
                    // nums[j+1] = nums[j];
                    // nums[j] = temp;
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            for(int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println("");
            i++;
        }
        System.out.println("After Sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        // Before Sorting
        // 4 1 3 9 6 2 7 
        // 1 3 4 6 2 7 9 
        // 1 3 4 2 6 7 9 
        // 1 3 2 4 6 7 9 
        // 1 2 3 4 6 7 9 
        // 1 2 3 4 6 7 9 
        // 1 2 3 4 6 7 9 
        // 1 2 3 4 6 7 9 
        // After Sorting 
        // 1 2 3 4 6 7 9 
    }
}
