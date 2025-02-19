package Day_12;

final class Parent{
	void printText() {
		System.out.println("파이널 클래스");
	}
}

//class Child extends Parent{
//	
//}

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	final void infoTitle() {
		System.out.println("책 제목 : " + title);
	}
	
	void infoAuthor() {
		System.out.println("책 저자 : " + author);
	}
}

class Comic extends Book{
	boolean isColor;
	
	Comic(String title, String author, boolean isColor) {
		super(title, author);
		this.isColor = isColor;
	}
	
//	void infoTitle() {
//		System.out.println("이 만화책 제목은" + title + "입니다.");
//	}
	
	void infoAuthor() {
		System.out.println("엮은이는 아는데요..");
	}
	
	void infoColor() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		}else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
}

public class _02_final {

	public static void main(String[] args) {
		/*
		 	final 파이널
		 	1. 파이널 키워드는 클래스, 메서드, 변수에 사용 가능
		 	2. 한 번 정하면 변경 불가 (상수의 개념)
		 	3. 파이널 키워드로 클래스를 만들면 어떤 클래스도 파이널 클래스의 자식이 될 수 없음
		 */
		
		Comic comicBook = new Comic("명탐정 코난", "아오야마고쇼", true);
		comicBook.infoTitle();
		comicBook.infoAuthor();
		comicBook.infoColor();
		
		/*
		 *******************************************************************
		 * 1. 상속 : 부모 클래스가 자식 클래스에게 필드, 메서드 등을 물려주는           *
		 * 2. 자식클래스 선언 방법 : extends 키워드                              *
		 * 3. super() -> 자식클래스에서 부모클래스의 생성자를 호출하는 키워드로 사용함   * 
		 * 			     생성자의 매개변수를 전달할 수도 있음                      *  
		 * 4. 오버라이딩 : 부모클래스에 선언된 메서드를 자식클래스에서 수정하여 사용하는 것 *
		 *******************************************************************
		 */
	}

}
