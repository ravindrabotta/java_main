package arrays1_exercises;

import java.util.Scanner;
public class FindDuplicate {

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

    public static int findDuplicate(int[] arr) {
        int size = arr.length;

        int uniqEle = 0;
        for(int i = 0; i < size; i++) {
            int k = 0;
            for(int j = i+1; j < size; j++) {
                if (arr[i] == arr[j]) k++;
            }
            if (k == 1) {
                uniqEle =  arr[i];
                break;
            }
        }
        return uniqEle;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(findDuplicate(arr));

    }
}
