package Day_4;

import java.util.Scanner;

public class _02_arithmetic {

	public static void main(String[] args) {
		/*
		 * 정수 분을 입력받기
		 * 몇시간 몇 분 으로 환산하는 프로그램
		 * ex) 70분 = 1시간 10분
		 */
		
		int minute;
		Scanner input = new Scanner(System.in);
		System.out.print("분 입력 (정수) : ");
		minute = input.nextInt();
		input.close();
		System.out.println(minute + "분 = " + (minute / 60) + "시간 " + (minute % 60) + "분");
	}

}
