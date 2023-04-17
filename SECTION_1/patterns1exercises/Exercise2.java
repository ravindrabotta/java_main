/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
package patterns1exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int index = 1;
		
		while(index <= aNumber) {
			int j = 1;
			while(j <= index) {
				System.out.print(index + " ");
				j++;
			}
			System.out.println();
			index++;
		}
	}
}
