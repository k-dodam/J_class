package Day_6;

public class _01_nestingFor {

	public static void main(String[] args) {
		for(int i = 0;i < 5;i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 0시 0분부터 23시 59분 출력
		/*
		 * x = 시간 0 < 24
		 * y = 분  0 < 60
		 */
		
		for(int x = 0; x < 24; x ++) {
			for(int y = 0; y < 60; y ++) {
				System.out.printf("%d시 %d분\n", x, y);
			}
			System.out.println();
		}
		
	}
}