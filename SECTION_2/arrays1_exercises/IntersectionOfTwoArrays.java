/*
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 1 2
 */

package arrays1_exercises;

public class IntersectionOfTwoArrays {

    public static void findIntersection(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {2, 6, 1, 2};
        int[] arr2 = {1, 2, 3, 4, 2};
        findIntersection(arr1, arr2);
    }
}
