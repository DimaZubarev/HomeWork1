package module6.task1;

import java.util.Arrays;

public class ArraysUtils {

    // суммирую числа с масива 1
    public static int sum(int array[]){
        int sum = 0;                            // int sum = 0;
        for(int i = 0; i <array.length; i++){   // for (int x : numbers1) {return sum += x;}
            sum += array[i];
        }
        return sum;
    }

    // ищу мининум с масива 1
    public static int min(int array[]){          // решение Андрея
        int min = 0;                                   // int min = array[0];
        for (int i = 0; i < 10; i++){                  // for (int item : array){
            if (array[i]<min){                         // if (item < min) min = item;}
                min = array[i];                        // return min;
            }
        }
        return min;
    }

    // ищу максимум с масива 1
    public static int max (int array[]){     // решение Андрея
        int max = 0;                               // int max = array[0];
        for (int i = 0; i < array.length; i++){    // for (int item : array){
            if (max<array[i]) max = array[i];      // if(item > max) max = item;}
            else if (max <=0) max =0;              // return max;
        }
        return max;
    }

    // ищу максимально позитивное число с масива 1
    public static int maxPositive (int array[]){
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++){
            if (maxPositive<array[i]) maxPositive = array[i];
            else if (maxPositive <=0) maxPositive =0;
        }
        return maxPositive;
    }

    // перемножаю все числа с масива 1
    public static int multiplication (int array[]){
        int multiplication = 1;
        for(int i = 0; i < array.length; i++){
            multiplication = multiplication*array[i];
        }
        return multiplication;
    }


    // делю по модулю два числа с масива 1
    public static int modulus(int array[]){
        int modulus =0;
        int firstElement = array[8];
        int secondElement = array[2];
        modulus = secondElement%firstElement;
        return modulus;
    }

    // ищу второе по величине число с масива 1
    public static int secondLargest(int array[]){
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

    // Возращаем масив с конца
    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - i - 1];
        }
        return reverse;
    }

    // Выводим парные чила масива и удаляем пустые значения
    // В первом блок ищем парные числа
    public static int[] findEvenElements(int[] array) {
        int[] findEvenElements = new int[array.length];
        int counter = 0;
        for (int item : array) {
            if (item % 2 == 0) {
                findEvenElements[counter] = item;
                counter++;
            }
        }
        // Чистим от 0 значений
        int[] findEvenElementsArray = new int[counter];
        System.arraycopy(findEvenElements, 0, findEvenElementsArray, 0, counter);
        return findEvenElementsArray;
    }
}
/* findEvenElements - массив с которого забираем четное число;
   1й 0 - порядковый номер в массиве нашего четного числа;
   findEvenElementsArray - массив в торый переносим наше четное число;
   2й 0 - порядковый номер в массиве куда мы вставляем четное число;
*/