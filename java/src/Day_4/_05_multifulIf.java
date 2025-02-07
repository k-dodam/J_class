package Day_4;

public class _05_multifulIf {

	public static void main(String[] args) {
		/*
		 * if(조건1){
		 * 		조건1이 참일 때 실행할 코드
		 * }else if(조건2){
		 * 		조건2가 참일 때 실행할 코드
		 * }else if(조건3){
		 * 		조건3이 참일 때 실행할 코드
		 * }. . .{
		 * }else{
		 * 		모든 조건에 부합하지 않을 때 실행할 코드
		 * }
		 */
		
		int age = 12;
		int fee;
		if (age <= 5){
			fee = 0;
		} else if (age <= 12) {
			fee = 5000;
		} else if (age <= 18) {
			fee = 8000;
		} else {
			fee = 10000;
		}
		System.out.println("입장료 : " + fee + "원");
	}

}
