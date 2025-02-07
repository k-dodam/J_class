package Day_4;

public class _01_operator {

	public static void main(String[] args) {
		/*
		 * 1. 산술연산자
		 * 		+ 더하기
		 * 		- 빼기
		 * 		/ 나누기
		 * 		% 나머지 (정수에서만 사용 가능)
		 * 
		 * 2. 증감연산자
		 * 		- 감소연산자 : 변수--; or --번수;
		 * 		+ 증가연산자 : 변수++; or ++변수;
		 * 
		 * 3. 대입연산자
		 * 		a = b
		 * 		복합대입연산자
		 * 		a += b
		 * 		a -+ b
		 * 		a *= b
		 * 		a /= b
		 * 		a %= b
		 * 
		 * 4. 비교연산자 : true -> 1 / false -> 0
		 * 		a > b
		 * 		a < b
		 * 		a <= b
		 * 		a >= b
		 * 		a == b
		 * 		a != b
		 * 
		 * 5. 논리연산자
		 * 		&& : and
		 * 		|| : or
		 * 		! : not (부정 : 반댓값 출력 : T>F /F>T)
		 * 
		 * 6. 삼항조건연산자 : 조건식이 true -> 식1 실행 / 조건식 false -> 식2 실행
		 * 		조건식 ? 식1 : 식2;
		 */
		
		// 산술연산자
		int a, b;
		a = 10;
		b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(7 % 4);
		System.out.println();
		
		// 증감연산자
		int x = a++;
		int y = ++a;
		System.out.println(x); // a 출력 -> a -> a + 1
		System.out.println(y); // a + 1 -> (a + 1) + 1 -> 출력
		System.out.println();
		
		// 대입연산자
		int p = b;
		System.out.println(p);
		p += 3;
		System.out.println(p);
		p -= 3;
		System.out.println(p);
		p *= 3;
		System.out.println(p);
		p /= 3;
		System.out.println(p);
		p %= 3;
		System.out.println(p);
		System.out.println();
		
		// 비교연산자
		int m, n, k;
		m = 150;
		n = 200;
		k = 200;
		System.out.println("m = 150, n = 200, k = 200");
		System.out.println("m > n ? : " + (m > n));
		System.out.println("m < n ? : " + (m < n));
		System.out.println("m >= n ? : " + (m >= n));
		System.out.println("m <= n ? : " + (m <= n));
		System.out.println("m == n ? : " + (m == n));
		System.out.println("n == k ? : " + (n == k));
		System.out.println();
		
		// 논리연산자
		int height = 130;
		int age = 10;
		int age2 = 8;
		boolean result = height >= 100 && age >= 10;
		boolean result2 = height >= 100 || age2 >= 10;
		boolean homework = true;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(!homework);
		System.out.println();
		
		// 삼항조건연산자
		int seven = 7;
		String result3 = seven % 2 == 0 ? "짝수" : "홀수";
		System.out.println("7은 " + result3 + "이다.");
	}

}
