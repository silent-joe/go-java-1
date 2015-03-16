import java.util.Scanner;

/**
 * Created by Aleksey Kurkov on 15.03.15.
 */

/*  array[0]...array[array.length-1]
*   tempArray[start]...tempArray[middle] & tempArray[middlePlusOne]...tempArray[end]
*   */

/*    Test cases
1) Input: 5 4 3 2 1     Output: 1 2 3 4 5
2) Input: 3 5 7 5 3     Output: 3 3 5 5 7
3) Input: 10 8 38 1 99  Output: 1 8 10 38 99 */

public class MergeSort {

    public static int[] array;

    public static void getArray() {
        System.out.println("Input array: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        String[] stringArray = string.split(" ");
        array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
    }

    public static void sortArray() {
        int[] tempArray = new int[array.length];
        sort(tempArray, 0, array.length - 1);
    }

    public static void sort(int[] tempArray, int start, int end) {
        if (end == start) {
            return;
        } else {
            int middle = safeFindMiddle(start, end);
            int middlePlusOne = middle + 1;
            sort(tempArray, start, middle);
            sort(tempArray, middlePlusOne, end);
            merge(tempArray, start, middlePlusOne, end);
        }
    }

    public static final int safeFindMiddle(int a, int b) {
        if (b > 0 ? a > Integer.MAX_VALUE - b
                : a < Integer.MIN_VALUE - b) {
            return a + b >>> 1;
        }
        return (a + b) / 2;
    }

    public static void merge(int[] tempArray, int cursor, int middlePlusOne, int end) {
        int index = 0;
        int start = cursor;
        int middle = middlePlusOne - 1;
        int countArrayElements = end - start + 1;
        while (start <= middle && middlePlusOne <= end) {
            if (array[start] < array[middlePlusOne]) {
                tempArray[index++] = array[start++];
            } else {
                tempArray[index++] = array[middlePlusOne++];
            }
        }
        while (start <= middle) {
            tempArray[index++] = array[start++];
        }
        while (middlePlusOne <= end) {
            tempArray[index++] = array[middlePlusOne++];
        }
        for (int i = 0; i < countArrayElements; i++) {
            array[cursor + i] = tempArray[i];
        }
    }

    public static void printSortedArray() {
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        getArray();
        sortArray();
        printSortedArray();
    }
}