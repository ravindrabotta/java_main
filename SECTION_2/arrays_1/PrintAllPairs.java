/*

 int[] arr =  {1,2,3,4,5};
(1,2)
(1,3)
(1,4)
(1,5)
(2,3)
(2,4)
(2,5)
(3,4)
(3,5)
(4,5)

*/

package arrays_1;
public class PrintAllPairs {

    public static void printPairs(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size - 1; i++) {
            for(int j = i + 1; j < size; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5};
        printPairs(arr);
    }
}
