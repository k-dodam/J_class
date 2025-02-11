package Day_6;

import java.util.Scanner;

public class _05_password {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String password;
		String checkPassword = "1205";
		int attempts = 0;
		int maxAttempts = 3;
		
		do {
			System.out.print("비밀번호 입력 : ");
			password = input.nextLine();
			attempts ++;
			if(password.equals(checkPassword)) {
				System.out.println("암호 해제 완료");
				return;
			}
			if(attempts == maxAttempts) {
				System.out.println("비밀번호 3회 오류. 잠금 모드 활성");
				return;
			}
		}while(true);
		
	}

}
