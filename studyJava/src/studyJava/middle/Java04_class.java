package studyJava.middle;

class Score {
	// 하나의 소스안ㅇ에 여러개의 설계도를 만들 때는 pubic 사용할 수 없다
	int bno;
	String name;
	int age;
	
	Score(int bno, String name, int age) {
		this.bno = bno;
		this.name = name;
		this.age = age;
	}
	
	public void scorePrint() {
		
	}
}

public class Java04_class {

	public static void main(String[] args) {
		// 한개의 소스파일에 여러개의 설계도를 만들 수도 있다
		// 현업에서는 거의 사용을 하지는 않지만 문법은 알고 있어야 한다

	}

}
