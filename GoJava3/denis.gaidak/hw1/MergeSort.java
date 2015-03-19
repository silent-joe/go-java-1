import java.util.Arrays;
/*    Test cases
1) Input: 5,1,12,2,9,13,4,5,3,10,11     Output: 1, 2, 3, 4, 5, 5, 9, 10, 11, 12, 13
2) Input: 5,4,3,7,8,3,4,0,0,1     Output: 0, 0, 1, 3, 3, 4, 4, 5, 7, 8
3) Input: 1  Output: 1
4) Input: 2,1  Output: 1,2 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,1,20,12,90,13,40,5,30,100,11};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length -1);
    }

        public static void mergeSort(int[] arr, int start, int end) {
//            if (end - start == 2) {
//                if (arr[start] > arr[end]) {
//                    int localSwap = arr[start];
//                    arr[start] = arr[end];
//                    arr[end] = localSwap;
//                    return;
//                }
//            }

            if (start < end) {
                int middle = (start + end) / 2;
                mergeSort(arr, start, middle);
                mergeSort(arr, middle + 1, end);
                merge(arr, start, middle, end);
            }
        }

    public static void merge(int[] arr, int start, int middle, int end) {

        int[] temp = Arrays.copyOf(arr, arr.length);

        int i = start;
        int firstArr = start;
        int secondArr = middle +1;

//        System.out.println(Arrays.toString(arr));

        while (firstArr <= middle && secondArr <= end) {
            if (temp[firstArr] <= temp[secondArr]) {
                arr[i] = temp[firstArr];
                firstArr++;
            } else {
                arr[i] = temp[secondArr];
                secondArr++;
            }
            i++;
        }

        while(firstArr <= middle) {
            arr[i] = temp[firstArr];
            firstArr++;
            i++;
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("-------------------------");

    }

}
