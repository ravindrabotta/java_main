package arrays_1;

import java.util.Scanner;
public class FindingLargestElementInArray {
    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter element for " + i + " index");
            arr[i] = scan.nextInt();
        }
        scan.close();
        return arr;
    }

    public static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int largest = findLargest(arr);
        System.out.println(largest);
    }
}
