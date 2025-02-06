package Day_3;

public class _01_changeDataType {

	public static void main(String[] args) {
		int i1 = 10;
		byte b1 = (byte)i1;
		System.out.println(b1);
		
		int i2 = 128;
		byte b2 = (byte)i2;
		System.out.println(b2);
		
		double d1 = 1.0e100;
		float f1 = (float)d1;
		System.out.println(f1);
		
		
		double d2 = 1.0e-50;
		float f2 = (float)d2;
		double d3 = (double)f2;
		System.out.println(d3);
		
		/* 자동형변환
		 * 1. 저장공간의 크기가 커질 때
		 * 2. 타입호환성 
		 */
		
		int num1 = 14;
		double num2 = 3.14;
		double num1Change = num1;
		System.out.println(num1Change);
		System.out.println(num1);
		
		int num2Change = (int)num2;
		System.out.println(num2Change);
		
		int number = 10;
		byte byteNumber = (byte)number;
		System.out.println("[int -> byte] number의 값 : " + number + ", byteNumber의 값 : " + byteNumber);
		
		int number2 = 1000;
		byte byteNumber2 = (byte)number2;
		System.out.println("[int -> byte] number2의 값 : " + number2 + ", byteNumber2의 값 : " + byteNumber2);
		
		// 자동형변환 : 작은 데이터 자료에서 큰 자료형으로 변경할 때 알아서 자동으로 형변환
		// 강제형변환 : 큰 데이터 타입에서 작은 데이터 타입으로 변경할 땐 오류 발생 => (자료형)변수 형식으로 작성
	}

}
