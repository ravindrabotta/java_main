/*
Sample Input 1:
1
7
1 2 3 4 5 6 7
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5
 */

package arrays1_exercises;

public class TripletSum {

    public static void tripletSum(int[] arr, int element) {
        int size = arr.length;
        int count = 0;
        for(int i = 0; i < size - 2; i++) {
            for(int j = i + 1; j < size - 1; j++) {
                for(int k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] + arr[k] == element) count++;
                }
            }
        }
        System.out.println(count);
    }



    public static void main(String[] args) {
        int[] arr = {2, -5, 8, -6, 0, 5, 10, 11, -3};
        int element = 19;
        tripletSum(arr, element);
    }
}
