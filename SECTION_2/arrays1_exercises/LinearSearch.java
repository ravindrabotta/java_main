package arrays1_exercises;

/*
Sample Input :
2
7
2 13 4 1 3 6 28
9
5
7 8 5 9 5
5
Sample Output :
-1
2
 */
import java.util.Scanner;
public class LinearSearch {

    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.println("Enter the element for " + i + " index");
            arr[i] = scan.nextInt();
        }

        return arr;
    }

    public static int findIndex(int[] arr, int element) {
        int position = -1;
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            if (arr[i] == element) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int element = scan.nextInt();
        System.out.println(findIndex(arr, element));
    }
}
