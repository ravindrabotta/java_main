/*
A
AB
ABC
ABCD
 */
package patterns1exercises;

import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int index = 1;
		
		while(index <= aNumber) {
			int j = 1;
			while(j <= index) {
				System.out.print((char)('A' + j - 1) + " ");
				j++;				
			}
			System.out.println();
			index++;
		}
	}

}
