package module6.task2;


import module6.task1.ArraysUtils;

import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {

        int[]numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, - 10};

        System.out.println(ArraysUtils.sum(numbers1));
        System.out.println(ArraysUtils.min(numbers1));
        System.out.println(ArraysUtils.max(numbers1));
        System.out.println(ArraysUtils.maxPositive(numbers1));
        System.out.println(ArraysUtils.multiplication(numbers1));
        System.out.println(ArraysUtils.modulus(numbers1));
        System.out.println(ArraysUtils.secondLargest(numbers1));
        System.out.println(Arrays.toString(ArraysUtils.reverse(numbers1)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(numbers1)));
    }
}
