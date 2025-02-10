package Day_4;

import java.util.Scanner;

public class _04_elseIf {

	public static void main(String[] args) {
		int a = 10;
		if (a > 15) {
			System.out.println("true");
		}else {
			System.out.println("조건을 충족하지 않습니다.");
		}
		System.err.println();
		
		
		/*
		 * 국영수 점수 입력 -> 모두 60점 이상 : 합격 / 아니라면 불합격
		 */
		int korean, english, math;
		Scanner input = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수 입력 (각 공백으로 구분) : ");
		korean = input.nextInt();
		english = input.nextInt();
		math = input.nextInt();
		input.close();
		if (korean < 60 || english < 60 || math < 60) {
			System.err.println("불합격");
		}else {
			System.out.println("합격");
		}
	}

}
