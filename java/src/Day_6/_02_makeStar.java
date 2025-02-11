package Day_6;

public class _02_makeStar {

	public static void main(String[] args) {
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		
		for(int i = 1; i < 6; i ++) {
			for(int j = 0; j < i; j ++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		
		System.out.println("");
		
		
		for(int a = 1; a < 8; a ++) {
			for(int b = 7; b > a; b --) {
				System.out.print(" ");
			}
			for(int c = 0; c < a+(a-1); c ++) {
			System.out.print("*");
			}
		System.out.println("");
		}

	}

}
