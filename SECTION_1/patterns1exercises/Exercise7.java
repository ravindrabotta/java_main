/*
1
11
202
3003
 */
package patterns1exercises;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int index = 2;
		
		System.out.println(1);
		while(index <= aNumber) {
			int j = 0;
			while(j < index) {
				if (j == 0 || j == index - 1)
					System.out.print(index - 1 + " ");
				else 
					System.out.print(0 + " ");
				j++;
			}
			System.out.println();
			index++;
		}
	}
}
