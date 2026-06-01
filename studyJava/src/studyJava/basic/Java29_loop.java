package studyJava.basic;

public class Java29_loop {

	//변수
	//메서드()
	
	static String name = "홍길동"; //전역변수(멤버변수)
	static int age = 20;
	
	public void info() {
		int num = 10; // 지역변수 info() { } 블럭 안에서만 인식되어서 사용하는 변수
		System.out.println(name);
		System.out.println(age);
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		// 전역변수와 지역변수
		// 전역변수는 클래스 안에서, 메서드 밖에서 선언한 변수, 객체전체에서 사용할 수 있다
		
		System.out.println(name);
		System.out.println(age);
		

	}

}
