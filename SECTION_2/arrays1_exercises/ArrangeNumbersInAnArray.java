package arrays1_exercises;

import java.util.Scanner;
public class ArrangeNumbersInAnArray {

    public static int[] createArray(int size) {
        int[] arr = new int[size];
        int mid = size / 2;
        int k = 1;
        for(int i = 0; i <= mid; i++) {
            arr[i] = k; 
            if (i < mid) {
                k++;
                arr[size - i - 1] = k;
            }
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.close();
        int[] arr = createArray(size);
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
