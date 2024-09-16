/*
i/p = 1,2,3,4,5,6,7
o/p = 2,1,4,3,6,5,7
*/

package arrays_1;

public class SwapAlternate {

    public static void swapAlternate(int[] arr) {
        for(int i = 0; i < arr.length; i+=2) {
            if ( i + 2 < arr.length) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        swapAlternate(arr);
        printArray(arr);
    }

}
