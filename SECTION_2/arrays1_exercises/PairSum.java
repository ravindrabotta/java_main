/*
Sample Input 1:
1
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7
Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10
Sample Output 2:
0
2
 */

package arrays1_exercises;

public class PairSum {

    public static void noOfPairs(int[] arr, int element) {
        int size = arr.length;
        int k = 0;
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == element) k++;
            }
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4};
        int element = 12;
        //int element = 7;
        noOfPairs(arr, element);
    }
}
