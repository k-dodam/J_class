package Day_2;

public class _02_variable {

	public static void main(String[] args) {
		String name; // 문자열
		int age; // 10진 정수형
		char bloodType; // 문자
		
		/*
		 * 1. 영어 대소문자 구분 (ex. name != Name)
		 * 2. 첫 글자 숫자 시작 불가 (소문자 시작이 일반적)
		 * 3. 특수 문자는 $와 _만 가능
		 * 4. Java 예약어(키워드) 사용 불가 (ex. package, static, int ...)
		 * 5. 문자 수의 제한이 없으므로 명확한 변수명 지정 권장
		 * 6. 카멜 표기법 권장 => blood_type(x) bloodType(o)
		 */
		
		int studentAge; // 선언
		studentAge = 20; // 초기화
		System.out.println(studentAge);
		
		String food = "떡볶이"; // 선언 및 초기화
		System.out.println(food);
		
		int myAge = studentAge;
		System.out.println(myAge);
	}

}
