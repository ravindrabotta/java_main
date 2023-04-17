/*
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
 */

package patterns1exercises;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int index = 1;
		
		while(index <= aNumber) {
			int j = 1;
			int k = index;
			while(j <= aNumber) {
				System.out.print(k + " ");
				k++;
				j++;
			}
			System.out.println();
			index++;
		}
	}

}
