package Day_3;

import java.util.Scanner;

public class _02_scanner {

	public static void main(String[] args) {
		
		System.out.print("정수 입력 : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		System.out.println("입력 정수 : " + n);
	}

}
