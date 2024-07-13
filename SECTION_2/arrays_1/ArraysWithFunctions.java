package arrays_1;

import java.util.Scanner;
public class ArraysWithFunctions {

    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.println("Enter the element for " + i + " index");
            arr[i] = scan.nextInt();
        }

        scan.close();
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        printArray(arr);
    }
}
