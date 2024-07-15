package arrays1_exercises;

import java.util.Scanner;
public class ReturnArraySum {
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

    public static int returnSum(int[] arr) {
        int size = arr.length;
        int sum = 0;
        for(int i = 0; i < size; i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(returnSum(arr));
    }
}
