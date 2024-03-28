package lesson3;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        int[] array_nums = {4, 1, 8, 7, 6, 5, 3};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        int ctr = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Number of even numbers : " + ctr);
        System.out.println("Number of odd numbers  : " + (array_nums.length - ctr));

    }
}
