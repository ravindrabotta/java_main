/*1
12
123
1234*/

package patterns1;

import java.util.Scanner;

public class TriangularPattern1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber =  scan.nextInt();
		scan.close();
		
		int index = 1;
		
		while(index <= aNumber) {
			int j = 1;
			while(j <= index) {
				System.out.print(j);
				j++;
			}
			index++;
			System.out.println();
		}
	}

}
