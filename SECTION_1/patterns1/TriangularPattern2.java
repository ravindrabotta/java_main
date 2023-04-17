/*
1
2 3
4 5 6
7 8 9 10
*/


package patterns1;

import java.util.Scanner;

public class TriangularPattern2 { 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int index = 1, k = 1;
		
		while(index <= aNumber) {
			int j = 1;
			while(j <= index) {
				System.out.print(k + " ");
				k++;
				j++;
			}
			System.out.println();
			index++;
		}
	}
}
