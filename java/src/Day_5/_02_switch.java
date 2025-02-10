package Day_5;

import java.util.Scanner;

public class _02_switch {

	public static void main(String[] args) {
		/*
		 * switch(변수 or 연산식)
		 * case 1:
		 * 		case 1 충족 시 실행할 코드
		 * 		break;
		 * case 2:
		 * 		case 2 충족 시 실행할 코드
		 * 		break;
		 * case 3:
		 * 		case 3 충족 시 실행할 코드
		 * 		break;
		 * default :
		 * 		모든 case 불만족 시 실행할 코드
		 */
		
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("정수 입력 (1 : 가위 / 2 : 바위 / 3 : 보 ) : ");
		n = input.nextInt();
//		if(n == 1) {
//			System.out.println("가위");
//		}else if(n == 2) {
//			System.out.println("바위");
//		}else if(n == 3) {
//			System.out.println("보");
//		}else {
//			System.out.println("오류");
//		}
//		
		switch(n) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("오류");
		}
		input.close();
	}

}
