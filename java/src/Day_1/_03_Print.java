package Day_1;

public class _03_Print {

	public static void main(String[] args) {
		System.out.println("apple");
		System.out.println("banana");
		System.out.println("orange");
		// 큰따옴표로 문자열 출력 : 문자 2개 이상
		
		System.out.println("");
		System.out.println(5);
		System.out.println(3.14);
		System.out.println('A');
		
		System.out.println("");
		System.out.println(3+5);
		System.out.println(3.9+5.72);
		System.out.println(3.9*5.72);
		System.out.println(10/3);
		System.out.println(10/3.0); // 실수인 피연산자 존재 시에 결과값은 실수로 출력
		
		System.out.println("");;
		
		System.out.println("덧셈 결과는 : " + 3 + 5); // 상수값 연결 시 + 이용, -는 대시로 사용 -> 3 + 5 != 8, 3 + 5 == 35 / 3 - 5 == 오류
		
		System.out.println("덧셈 결과는 : " + (3 + 5)); // +와 -는 괄호 필수
		System.out.println("뺄셈 결과는 : " + (3 - 5)); 
		
		System.out.println("곱셈 결과는 : " + 3 * 5 + "입니다."); // *은 연결문자로 쓰이지 않음 오직 연산기호 -> 괄호 필요 없지만 쓰는 것을 권장
		System.out.println("곱셈 결과는 : " + (3 * 5) + "입니다.");
	}

}
