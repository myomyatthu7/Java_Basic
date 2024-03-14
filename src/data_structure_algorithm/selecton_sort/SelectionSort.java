package data_structure_algorithm.selecton_sort;

/**
 * SelectionSort
 */
public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {4,1,3,9,6,2,7};
        //int nums[] = {1,2,3,4,5,6,7};
        int size = nums.length;
        int minIndex;
        int temp;
        System.out.println("Before Sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        //int nums[] = {4,1,3,9,6,2,7};
        // 4 1 3 9 6 2 7
        // i j
        // minIndex  = 0 / 4;
        for(int i =0;i<size-1;i++) {
            minIndex = i;
            for(int j = i+1;j<size;j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];  // t = 1
            nums[minIndex] = nums[i];  // min = 4
            nums[i] = temp;            // i = 1
            System.out.println();
            for(int num :                nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("After Sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        // Before Sorting
        // 4 1 3 9 6 2 7 

        // 1 4 3 9 6 2 7 
        // 1 2 3 9 6 4 7 
        // 1 2 3 9 6 4 7 
        // 1 2 3 4 6 9 7 
        // 1 2 3 4 6 9 7 
        // 1 2 3 4 6 7 9 
        // After Sorting 
        // 1 2 3 4 6 7 9 
    }
}