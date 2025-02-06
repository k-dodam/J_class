package Day_3;

import java.util.Scanner;

public class _03_yardToMeter {

	public static void main(String[] args) {
		
		final double ONE_YARD = 0.9144;
		
		System.out.print("야드 입력 : ");
		Scanner yardInput = new Scanner(System.in);
		double yard = yardInput.nextDouble();
		yardInput.close();
		
		double meter = yard * ONE_YARD;
		System.out.println(yard + " yard는 " + meter + " meter이다.");
	}

}
