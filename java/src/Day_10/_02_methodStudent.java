package Day_10;

class Student { // 클래스
	
	String name;
	int grade, english, math;
	
	public double average() { // 메서드
		return (english+math) / 2.0;
	}

	public void studentInfo() { // 메서드
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("영어점수 : " + english);
		System.out.println("수학점수 : " + math);
		System.out.println("평균 점수 : " + average());
	}
	
	Student(String a, int b, int c, int d){
		name = a;
		grade = b;
		english = c;
		math = d;
	}
	
}

public class _02_methodStudent {

	public static void main(String[] args) {
		/*
		 	이름, 학년, 영어점수, 수학점수 필드가 들어있는 클래스 만들기
		 	평균을 구하는 반환값이 있는 메서드를 만들어서 철수, 영희의 정보를 출력
		 */
		
		Student student1 = new Student("김철수", 3, 90, 85); // 객체
//		student1.name = "김철수";
//		student1.grade = 3;
//		student1.english = 90;
//		student1.math = 85;
				
		Student student2 = new Student("박영희", 2, 78, 88); // 객체
//		student2.name = "박영희";
//		student2.grade = 2;
//		student2.english = 78;
//		student2.math = 88;
		
		student1.studentInfo();
		System.out.println();
		student2.studentInfo();
	}

}
