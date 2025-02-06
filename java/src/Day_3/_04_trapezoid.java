package Day_3;

import java.util.Scanner;

public class _04_trapezoid {

	public static void main(String[] args) {
		// 윗변, 밑변, 높이를 입력받아서 사다리꼴 넓이 구하기 (실수형으로)
		
		System.out.print("윗변 입력 : ");
		Scanner upperInput = new Scanner(System.in);
		double upper = upperInput.nextDouble();
		
		System.out.print("밑변 입력 : ");
		Scanner lowerInput = new Scanner(System.in);
		double lower = lowerInput.nextDouble();
		
		System.out.print("높이 입력 : ");
		Scanner heightInput = new Scanner(System.in);
		double height = heightInput.nextDouble();
		
		System.out.println("사다리꼴 넓이 : " + ((upper + lower) * height / 2) + "\n");
		
		
		double top, base, high;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("윗변 입력 : ");
		top = in.nextDouble();
				
		System.out.print("밑변 입력 : ");
		base = in.nextDouble();

		System.out.print("높이 입력 : ");
		high = in.nextDouble();
		
		double area = (top + base) * high / 2;
		System.out.println("사다리꼴 넓이 : " + area);
		
		upperInput.close();
		lowerInput.close();
		heightInput.close();
		in.close();
	}

}
