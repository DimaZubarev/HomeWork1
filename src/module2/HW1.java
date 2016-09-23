package module2;

/*Input: array with size = 10 can be of one of two data types: int and double. Calculate:

        sum
        min/max
        max positive
        multiplication
        modulus of first and last element
        second largest element

        As a result you should have methods with following names :

        sum(int array[]), sum(double[])
        min(int array[]), min(double[])
        max(int array[]), max(double[])
        maxPositive(int array[]), maxPositive(double array[]),
        multiplication  (int array[]), multiplication (double[])
        modulus(int array[]), modulus(double[])
       secondLargest(int array[]), secondLargest(double[]) */

import module6.task1.ArraysUtils;

import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {

        int[]numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, - 10};
        double[]numbers2 = {1.1, 2.2, 3.3, 4.4, - 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};

//        System.out.println("sum " +sum(numbers1) + " " + sum(numbers2));
//        System.out.println("min " +min(numbers1) + " " + min(numbers2));
//        System.out.println("max " +max(numbers1) + " " + max(numbers2));
//        System.out.println("maxPositive " +maxPositive(numbers1) + " " + maxPositive(numbers2));
//        System.out.println("multiplication " +multiplication(numbers1) + " " + multiplication(numbers2));
//        System.out.println("modulus " +modulus(numbers1) + " " + modulus(numbers2));
//        System.out.println("secondLargest " + secondLargest(numbers1) + " " + secondLargest(numbers2));
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
    // суммирую числа с масива 1
    static int sum(int array[]){
        int sum = 0;
        for(int i = 0; i <array.length; i++){
            sum = sum+array[i];
        }
        return sum;
    }

    // суммирую числа с масива 2
    static double sum(double array[]){
        double sum = 0;
        for(int d =0; d <array.length; d++){
            sum = sum + array[d];
        }
        return sum;
    }

    // ищу мининум с масива 1
    static int min(int array[]){          // решение Андрея
        int min = 0;                      // int min = array[0];           /
        for (int i = 0; i < 10; i++){     // for (int item : array){       /
            if (array[i]<min){            // if (item < min) min = item;}  /
                min = array[i];           // return min;                   /
            }
        }
        return min;
    }

    // ищу мининум с масива 2
    static double min(double array[]){
        double min = 0;
        for (int d = 0; d < 10; d++){
            if (array[d]<min){
                min = array[d];
            }
        }
        return min;
    }

    // ищу максимум с масива 1
    static int max (int array[]){                  // решение по принципу Андрея
        int max = 0;                               // int max = array[0];         /
        for (int i = 0; i < array.length; i++){    // for (int item : array){     /
            if (max<array[i]) max = array[i];      // if(item > max) max = item;} /
            else if (max <=0) max =0;              // return max;                 /
        }
        return max;
    }

    // ищу максимум с масива 2
    static double max (double array[]){
        double max = 0;

        for (int d = 0; d < array.length; d++){
            if (max<array[d]) max = array[d];
            else if (max <=0) max =0;
        }
        return max;

    }

    // ищу максимально позитивное число с масива 1
    static int maxPositive (int array[]){
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++){
            if (maxPositive<array[i]) maxPositive = array[i];
            else if (maxPositive <=0) maxPositive =0;
        }
        return maxPositive;
    }

    // ищу максимально позитивное число с масива 2
    static double maxPositive (double array[]){
        double maxPositive = 0;

        for (int d = 0; d < array.length; d++){
            if (maxPositive<array[d]) maxPositive = array[d];
            else if (maxPositive <=0) maxPositive =0;
        }
        return maxPositive;

    }

    // перемножаю все числа с масива 1
    static int multiplication (int array[]){
        int multiplication = 1;
        for(int i = 0; i < array.length; i++){
            multiplication = multiplication*array[i];
        }
        return multiplication;
    }

    // перемножаю все числа с масива 2
    static double multiplication (double array[]){
        double multiplication = 1;
        for(int d = 0; d < array.length; d++){
            multiplication = multiplication*array[d];
        }
        return multiplication;
    }

    // делю по модулю два числа с масива 1
    static int modulus(int array[]){
        int modulus =0;
        int firstElement = array[8];
        int secondElement = array[2];
        modulus = secondElement%firstElement;
        return modulus;
    }

    // делю по модулю два числа с масива 2
    static double modulus(double array[]){
        double modulus =0;
        double firstElement = array[0];
        double secondElement = array[1];
        modulus = firstElement%secondElement;
        return modulus;
    }

    // ищу второе по величине число с масива 1
    static int secondLargest(int array[]){
        int max = array[7];
        int secondLargest = array[8];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                secondLargest = max;
                max = array[i];
            }
            else if(secondLargest < array[i])secondLargest = array[i];
        }
        return secondLargest;
    }

    // ищу второе по величине число с масива 2
    static double secondLargest(double array[]){
        double max = array[8];
        double secondLargest = array[8];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                secondLargest = max;
                max = array[i];
            }
            else if(secondLargest < array[i])secondLargest = array[i];
        }
        return secondLargest;
    }
}
