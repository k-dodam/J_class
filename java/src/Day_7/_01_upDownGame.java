package Day_7;

import java.util.Scanner;

public class _01_upDownGame {

	public static void main(String[] args) {
		/*
		  1 ~ 50 난수 생성
		  - 숫자를 입력하세요 ( 잔여 횟수 n 회 ) > 5 회 부터
		  - 정답 시 종료
		  - 업 / 다운
		  - 5번 이상 시도 시 실패
		 */
		
		int random = (int)(Math.random() * 50 + 1);
		Scanner input = new Scanner(System.in);
		
		for(int i = 5; i >= 0; i--) {
			if(i == 0) {
				input.close();
				System.out.println("실패");
				break;
			}
			System.out.printf("1 ~ 50 사이 숫자 입력 ( 잔여 횟수 %d 회 ) : ", i);
			int num = input.nextInt();
			if(i == 1&& num != random) {
				input.close();
				System.out.println("실패");
				break;
			}
			if(num == random){
				System.out.println("정답입니다.");
				break;
			}else if(num > random) {
				System.out.println("다운");
			}else {
				System.out.println("업");
			}
			
		}
	}

}
