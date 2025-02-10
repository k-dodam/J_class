package Day_5;

import java.util.Scanner;

public class _03_menuCode {

	public static void main(String[] args) {
		/*
		 * f or F 입력 > file menu 출력
		 * h or H 입력 > help menu 출력
		 * e or E 입력 > edit menu 출력
		 * 
		 * 변수.next().charAt(0);
		 */
		
		char menu;
		Scanner input = new Scanner(System.in);
		System.out.print("입력 (f, h, e) : ");
		menu = input.next().charAt(0);
		
//		if(menu == 'f' || menu == 'F') {
//			System.out.println("file menu");
//		} else if(menu == 'h' || menu == 'H') {
//			System.out.println("help menu");
//		} else if(menu == 'e' || menu == 'E') {
//			System.out.println("edit menu");
//		} else {
//			System.out.println("오류");
//		}
		
		switch(menu) {
		case 'f':
		case 'F':
			System.out.println("file menu");
			break;
		case 'h':
		case 'H':
			System.out.println("help menu");
			break;
		case'e':
		case'E':
			System.out.println("edit menu");
			break;
		default:
			System.out.println("오류");
		}
	}

}
