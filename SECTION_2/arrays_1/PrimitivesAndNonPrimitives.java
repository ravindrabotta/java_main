package arrays_1;

public class PrimitivesAndNonPrimitives {
    public static void increment(int i) {
        i++;
        System.out.println(i);
    }

    public static void incrementArray(int[] input) {
        input = new int[7];
        for(int i = 0; i < input.length; i++) {
            input[i] = input[i] + 1;
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int i = 10;
        increment(i); // pass by value
        System.out.println(i); // Main.i has value of 10; increment.i has value of 11;
        int[] arr = {1, 2, 3, 4, 5};
        incrementArray(arr); // pass by reference
        printArray(arr); // all array values are increased by 1
    }
}
