package Day_5;

public class _04_for {

	public static void main(String[] args) {
		/*
		 * for(초기값; 조건식; 증가식 or 감소식){
		 * 		반복할 코드
		 * }
		 */
		
		int i;
		for(i = 1;i <= 100;i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		// 3의 배수의 합계 and 3의 배수가 몇 개인지 구하기
		int num, total = 0, count = 0;
		for(num = 3; num <= 100; num += 3) {
			System.out.print(num + " ");
			total += num;
			count ++;
		}
		System.out.println();
		System.out.println("1 ~ 100 사이 모든 3의 배수의 합 : " + total);
		System.out.println("1 ~ 100 사이 모든 3의 배수의 개수 : " + count);
	}

}
