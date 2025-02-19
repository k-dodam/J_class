package Day_12;

class Car{
	String brand;
	int speed;
	
	Car(){
		this("현대", 100);
	}
	
	Car(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}	
	
	void run() {
		System.out.println("brand : " + brand + "/ speed : " + speed);
	}
	
}

class SportCar extends Car {
	SportCar(String brand, int speed){
		super(brand, speed);
		// super() : 부모클래스의 생성자를 호출
	}
	
	@Override 
	/*
	 	*오버라이딩이 중요한 이유*
	 	1. 부모 클래스 기능을 유지하면서 자식 클래스만의 동작 추가 가능
	 	2. 부모 클래스로 여러 자식 클래스를 다룰 때 각각의 run()이 다르게 실행됨
	 	3. 객체지향프로그래밍의 핵심 개념!
	 */
	void run() {
		System.out.println(brand + " 스포츠카가 시속 " + speed + "km/h로 달립니다!");
	}

}
	
class Truck extends Car{
	int loadCapacity;
	
	Truck(){
		this("volvo", 80, 5000);
	}
	
	Truck(String brand, int speed, int loadCapacity){
		super(brand, speed);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	void run() {
		System.out.println(brand + " 트럭 속도 : " + speed + "km/h, 적재용량 : " + loadCapacity);
	}
}

public class _01_carDesign {

	public static void main(String[] args) {
		/*
		 	1. 부모 클래스
		 		브랜드, 스피드 // 생성자로 브랜드와 스피드를 무조건 입력하게
		 		this() 사용해서 기본값 만들어주기 -> 현대, 100
		 		기능이 있다! -> 브랜드 : 현대 / 스피드 : 100
		 		
		 	2. 자식 클래스
		 		스포츠카
		 		부모의 기능을 오버라이딩
		 			브랜드 + 스포츠카가 speed km/h로 달립니다!
		 			
		 	3. 트럭도 만들기
		 		적재용량
		 */
		
		Car normalCar = new Car(); // this로 기본값을 작성하였기에 생성자를 호출하고 입력을 안 하여도 오류 안 남
		normalCar.run();
		
		SportCar ferrari = new SportCar("페라리", 280);
		ferrari.run();
		
		Truck volvoTruck = new Truck();
		volvoTruck.run();
		
		Truck truck = new Truck("트럭", 100, 30000);
		truck.run();
	}

}
