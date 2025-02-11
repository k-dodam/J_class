package Day_6;

public class _03_while {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int j = 1;
		while(j < 10) {
			System.out.printf("6 * %d = %d\n", j, j*6);
			j++;
		}
		System.out.println();
		
		int k = 1;
		while(k < 60) {
			if(k % 6 == 0) {
				System.out.printf("6 * %d = %d\n", k / 6, k);
			}
			k++;
		}
		System.out.println();
		
		int sum = 0, l = 1;
		while(l <= 10) {
			sum += l;
			l ++;
		}
		System.out.println(sum);
	
	}

}
