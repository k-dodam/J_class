package Day_3;

import java.util.Scanner;

public class _05_profile {

	public static void main(String[] args) {
		/*
		 * 1. 이름
		 * 2. 주소
		 * 3. 나이
		 * 4. 키
		 * 당신의 이름은 1.
		 * 당신의 주소는 2.
		 * 당신의 나이는 3.
		 * 당신의 키는 4.cm(소수점1자리까지) 출력
		 */
		
		String name, address;
		int age;
		double height;
		Scanner Input = new Scanner(System.in);

		
		System.out.print("이름 입력 : ");
		name = Input.next();
				
		System.out.print("주소 입력 : ");
		address = Input.next();
		
		System.out.print("나이 입력 : ");
		age = Input.nextInt();
		
		System.out.print("키 입력 : ");
		height = Input.nextDouble();
		
		Input.close();
		
		System.out.printf("이름 : %s, 주소 : %s, 나이 : %d, 키 : %.1fcm", name, address, age, height);
	}

}
