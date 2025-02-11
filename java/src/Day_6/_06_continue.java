package Day_6;

public class _06_continue {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 101; i ++) {
			if(i % 2 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("짝수의 합 : " + sum);
		
	}

}
