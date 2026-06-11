//package studyJava.middle;
//
//// 부모 클래스의 기본 생성자가 자동 선택
//class AA {
//	public AA(int x) {
//		System.out.println("X = " + x);
//	}
//	// 매개변수가 있는 생성자를 만들면 기본 생성자는 컴파일러가 삽입을 안 한다
//}
//
//class BB extends AA {
//	public BB() { // 오류발생. 왜? 부모의 기본 생성자가 없기 때문에
//		System.out.println("생성자 B");
//	}
//}
//
//public class Java09_inherit {
//
//	public static void main(String[] args) {
//		BB bb = new BB();
//
//	}
//	
//}
