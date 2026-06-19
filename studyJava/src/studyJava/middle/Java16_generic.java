package studyJava.middle;

class Box<T> { // <T> 제네릭
	// 멤버변수
	T value; // value 라는 변수에는 어떤 객체 데이터 타입이든 저장이 가능하다
	
	// 생성자 - T 타입 매개변수 받기
	Box(T value) {
		this.value = value;
	}
	
	void setValue(T value) {
		this.value = value; // 새 값으로 교체
	}
	
	// 타입정보 출력
	void printType() {
		System.out.println("타입 : " + value.getClass().getName() + "/값 : " + value);
		// getClass().getName() 실제 타입이름 반환
	}
}

public class Java16_generic {

	public static void main(String[] args) {
		
		// Wrapper 클래스
		// 기본형 데이터 타입을 객체로 만들어 놓은 클래스
		// boolean -> Boolean 
		// byte -> Byte  
		// char -> Character
		// short -> Short
		// int -> Integer
		// long -> Long
		// float -> Float
		// double -> Double
		
		// 제네릭(Generic)이란?
		// 제네릭이란 클래스나 메서드를 만들 때 타입을 나중에 결정하는 기능이다
		// <T>라는 타입 매개변수를 사용해서 어떤 타입(객체)이든 처리할 수 있게 한다
		
		// 제네릭이 있을 때 -> Box<T> 하나로 integer, String, double 모두 처리 가능!
		
		Box<Integer> inBox = new Box(100);
		inBox.printType();
		Box<String> strBox = new Box("Hello");
		strBox.printType();
		Box<Double> doubleBox = new Box(12.456);
		doubleBox.printType();
		
		// 제네릭 타입 매개변수 관례
		// T -> Type (일반타입)
		// E -> Element (요소, 컬렉션에서 사용)
		// K -> Key (키)
		// V -> value(값)
		// N -> Number(숫자)
		// R -> Return(반환)

	}

}
