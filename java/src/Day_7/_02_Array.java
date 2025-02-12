package Day_7;

import java.util.Arrays;

public class _02_Array {

	public static void main(String[] args) {
		// 배열 : 같은 자료형의 변수를 저장해서 여러 데이터 저장 가능
		
		/*
		 기본 타입 : byte / short / int / long / float / double / char / boolean
		 참조 타입 : 기본 타입을 제외한 모든 타입 >> 주소값 저장
		 */
		
		int[] a;
		a = new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		a[2] = 99;
		System.out.println(a[2]);
		
		a[4] = 1234 * 34;
		System.out.println(a[4]);
		
		a[0] = a[2] + a[4];
		System.out.println(a[0]);
		
		char [] b = new char[3];
		b[0] = 'R';
		b[1] = 'Q';
		System.out.println(b[0]);
		System.out.println(b[2]);
		System.out.println(b[1]);
		
		int[] num = new int[5];
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
	}
	

}
