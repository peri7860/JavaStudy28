package studyJava.R;

import studyJava.Q.A1;
// 다른 패키지의 클래스를 사용하고 싶으면 import 해야 한다

class B1 extends A1 {
	// 다른 패키지 안에 있는 멤버변수를 사용 할 수 있는가?
	void set() {
		pub = 1; // 가능
		pro = 2; // 가능
		// def = 3; // 불가능. 같은 패키지에서만 사용 가능
		// pri = 4; // 불가능. 같은 클래스에서만 사용 가능
		
	}
}

public class AccessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
