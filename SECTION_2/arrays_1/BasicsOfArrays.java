package arrays_1;

public class BasicsOfArrays {

    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 5;
        arr[5] = 17;
        System.out.println(arr[0]);

        // arr[-1] = 18;
        // arr[10] = 34;
        // Arrays don't support negative indexing. Index ranges from 0 to n - 1
        // throws java.lang.ArrayIndexOutOfBoundsException

        System.out.println(arr[3]);
        System.out.println(arr[4]); // default values are zero

        char[] cArray = new char[10]; // default value is null char (integer 0)
        double[] dArray = new double[10]; // default value is 0.0

        System.out.println(cArray[0]);
        System.out.println(dArray[0]);

    }
}
