/*
i/p = [2, 3, 1, 6, 3, 6, 2]
o/p = 1
*/
package arrays1_exercises;
public class FindUnique {

    public static int uniqueElement(int[] arr) {
        int uniqueElement = Integer.MIN_VALUE;
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            int k = 0;
            for(int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) k++;
            }
            if (k == 1) {
                uniqueElement = arr[i];
                break;
            }
        }
        return uniqueElement;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 3, 6, 6, 7, 10, 7};
        System.out.println(uniqueElement(arr));
    }
}
