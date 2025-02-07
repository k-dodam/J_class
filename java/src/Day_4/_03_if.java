package Day_4;

import java.util.Scanner;

public class _03_if {

	public static void main(String[] args) {
		/*
		 * if(조건식){
		 * 		조건식이 참이라면 실행할 코드
		 * }
		 */
		int a = 5;
		if (a > 1) {
			System.out.println("true");
		}
		System.out.println();
		
		
		// 정수를 입력받아 음의 정수라면 양의 정수로 바꿔 출력하는 프로그램
		int integer;
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		integer = input.nextInt();
		input.close();
		if (integer < 0) {
			System.out.println(-integer);
		}
	}

}
