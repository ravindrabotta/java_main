package arrays_1;

import java.util.Scanner;
public class TakingInputAndPrintingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.println("Enter the element for " + i + " index");
            arr[i] = sc.nextInt();
        }

        sc.close();

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
