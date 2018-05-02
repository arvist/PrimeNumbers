import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		for(int i = x; i<=y; i++) {
			
			boolean isDivisible = false;
			for(int j = 2; j < i; j++) { // 
				if(i % j == 0 && i!=j) {
					isDivisible = true;
				}
			}
			if(!isDivisible && i > 1) {
				System.out.print(i + " ");
			}
			
		}
		
		/*
		 * //Parbaudam vai dalas 2,3,5,7
			
			// Learn Math KIDS - Shie esot pamata daliitaji
			if (i == 2 || i == 3 || i == 5 || i == 7){ 
				System.out.println(i);
				continue;
			} else if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i == 1) {
				continue;
			}
			System.out.println(i);
		 */

	}

}
