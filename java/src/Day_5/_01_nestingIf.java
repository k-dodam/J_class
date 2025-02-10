package Day_5;

import java.util.Scanner;

public class _01_nestingIf {

	public static void main(String[] args) {
		/*
		 * 중첩 if : if문 안에 if문이 들어가는 구조
		 * if(조건1){
		 * 		조건 1을 만족하면 실행할 코드
		 * 		if(조건2){
		 * 			조건 1,2 모두 만족하면 실행할 코드
		 * 		} else {
		 * 			조건 1은 만족하지만 2는 만족하지 않으면 실행할 코드
		 * 		}
		 * } else {
		 * 		조건 1을 만족하지 않을 때 실행할 코드
		 * }
		 */
		
		if(10 > 20) {
			System.out.println("20이 10보다 크다.");
			if(50 > 30) {
				System.out.println("50이 30보다 크다.");
			}else {
				System.out.println("30은 가장 크지 않다.");
			}
		}else {
			System.out.println("뭔가 잘못됨!!");
		}
		// 첫번째 if문의 조건이 만족해야만 안쪽 if문을 검사할 수 있음
		
		/*
		 * 1. 놀이기구를 타려면 키가 120이 넘어야 됨
		 * 2. 120이 넘더라도 나이가 10살 미만이라면 보호자 필수
		 */
		
		int height, age;
		Scanner inputHeight = new Scanner(System.in);
		Scanner inputAge = new Scanner(System.in);
		System.out.print("키 입력 : ");
		height = inputHeight.nextInt();
		if(height >= 120) {
			System.out.print("나이 입력 : ");
			age = inputAge.nextInt();
			if(age >= 10) {
				System.out.println("놀이기구 탑승 가능");
			}else {
				System.out.println("보호자 동반 시 놀이기구 탑승 가능");
			}
		}else {
			System.out.println("키 120미만은 놀이기구 탑승 불가능");
		}
		
		/*
		 * 출석 및 과제 제출 여부 확인
		 * 1. 출석 확인 (Y/N)
		 * 2. 1. 만족시 과제 제출 확인 (Y/N) // 1. 불만족시 출석평가에서 -3점
		 * 3. 1.2. 모두 만족시 수업 참여 인정 // 1.만족 2.불만족시 50% 출석 인정
		 * 
		 * String 변수명.next();
		 * 변수명.equalseignoreCase("검사할 문자열(Y)")
		 */
		
		String attend, task;
		Scanner inputAttend = new Scanner(System.in);
		Scanner inputTask = new Scanner(System.in);
		
		System.out.print("출석 확인 (Yes / No) : ");
		attend = inputAttend.next();
		if(attend.equalsIgnoreCase("Yes")) {
			System.out.print("과제 제출 확인 (Yes / No) : ");
			task = inputTask.next();
			if(task.equalsIgnoreCase("Yes")) {
				System.out.println("수업 참여 인정");
			}else {
				System.out.println("수업 참여 50% 인정");
			}
		} else {
			System.out.println("출석 평가 -3점");
		}
		inputHeight.close();
		inputAge.close();
		inputAttend.close();
		inputTask.close();
	}

}
