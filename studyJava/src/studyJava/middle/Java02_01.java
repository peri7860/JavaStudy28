package studyJava.middle;

public class Java02_01 {

	public static void main(String[] args) {
		
		// main() 메소드 위치에 Java02_02 설계도를 사용하고 싶으면
		// Java02_02 설계도에는 static이 없는 메서드가 2개 있다
		
		// static이 없는 메서드를 사용하고 싶으면
		// 객체 생성을 해야 사용할 수 있다
		
		Java02_02  java02 = new Java02_02();
		java02.view();
		java02.calculater();

	}

}
