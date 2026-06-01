package studyJava.basic;

public class Java10_operator {

	public static void main(String[] args) {
		// 두 변수의 값 교환하기
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println(a + " " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a + " " + b);

	}

}
