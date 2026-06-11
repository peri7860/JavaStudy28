package studyJava.middle;

// 부모 클래스와 자식 클래스의 생성자 간의 호출 및 실행관계
class A {
	public A() {
		System.out.println("생성자 A");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B");
	}
}

class C extends B {
	public C() {
		System.out.println("생성자 C");
	}
}

public class Java08_inherit {

	public static void main(String[] args) {
		C c = new C();
		// 생성자 A, 생성자 B, 생성자 C 순서로 출력 된다
		// 이유는 new 문장을 실행하면 C() 메서드가 호출 된다
		// 그러나 상속을 받으면 부모 클래스의 B()을 호출하고 B는 다시 A생성자를 호출한다
		// 부모의 기본생성자가 있으면 부모의 기본 생성자부터 실행한다

	}

}
