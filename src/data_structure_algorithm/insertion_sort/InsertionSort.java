package data_structure_algorithm.insertion_sort;

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        int nums[] = {4,1,3,9,6,2,7};

        System.out.println("Before Sorting");
        for(int n : nums) {
            System.out.print( n + " ");
        }
        System.out.println();

        // 1,2,3,4,6,9,7
        // j         i

        // key 2

        // i = 5


        int size = nums.length-1;
        
        for(int i=1;i<size;i++) {
            int key = nums[i]; 
            int j = i-1;
            while (j >= 0 && nums[j] > key) {
                nums[j+1]=nums[j]; //3
                j--;
            }
            nums[j+1] = key;
            for(int n : nums) {
                System.out.print( n + " ");
            }
            System.out.println();
        }
        System.out.println("After Sorting");
        for(int n : nums) {
            System.out.print( n + " ");
        }
    }
    // Before Sorting
    // 4 1 3 9 6 2 7 
    // 1 4 3 9 6 2 7 
    // 1 3 4 9 6 2 7 
    // 1 3 4 9 6 2 7 
    // 1 3 4 6 9 2 7 
    // 1 2 3 4 6 9 7 
    // After Sorting 
    // 1 2 3 4 6 9 7 
}