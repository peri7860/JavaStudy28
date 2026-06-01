package studyJava.basic;

public class Java03_casting {
	
	public static void main(String[] args) {
		
		//Java 형변환(Type casting)이란?
		//하나의 자료형을 다른 자료형으로 바꾸는 것
		//int->double, double->int 처럼 타입을 변환하는 것
		
		//1. 자동형변환(묵시적 형변환)
		//작은타입 -> 큰타입으로 변환시 자동으로 변환된다
		//byte->short->int->long->float->double
		
		int i = 100;
		double d = i; //자동 형변환 : 4바이트 크기 정수값 100을 8바이트 크기에 자동 형변환하여 저장
		System.out.println("i = " + i);
		System.out.println("d = " + d);
		
		//2. 강제 형변화(명시적 형변환)
		//큰 타입 -> 작은 타입으로 변환할 때 직접 명시해야 한다. 데이터 손실이 발생 할 수 있다(반올림 하지 않는다)
		double db = 3.99;
		// int in = db; 에러 왜? db 8바이트 큰 물건을 4바이트 크기 in 방에 저장 할 수 없다
		int in = (int)db; //in에 저장하는 값은?? 3
		System.out.println("in(데이터손실발생) : = " + in); //3
		
		//문자 -> 숫자
		char c1 = 'a'; //97
		char c2 = 'A'; //65
		System.out.println("a = " + c1);
		System.out.println("A = " + c2);
		int c11 = c1; // 문자를 정수로 바꿔서 저장이 가능한가? yes. 모든 문자는 ASCII코드 값
		int c22 = c2;
		System.out.println("char 값 : " + c1);
		System.out.println("int 변환 후 : " + c11); //97
		System.out.println("char 값 : " + c2);
		System.out.println("int 변환 후 : " + c22); //65
		
		//숫자->문자
		int num = 66;
		char c33 = (char)num;  // 66을 char형식으로 강제 형변환하여 c33에 저장
		System.out.println("char 값 : " + num);
		System.out.println("int 변환 후 : " + c33); //B출력
		
		//String -> int형으로 변환
		String str = "100"; //숫자가 아니라 100이라는 문자열이다
		int ii = Integer.parseInt(str); //문자열을 숫자로 변환하는 메서드이다
		System.out.println("ii 값 : " + ii);
		//double->객체->Double, float->객체->Float, byte->객체->Byte..
		//int->객체->integer
		
		int aa = 5;
		int bb = 2;
		// int끼리 나누면 소수점 버림
		System.out.println("int 나눗셈 : " + (aa / bb));
		
		// double형으로 형변환 후 나누면 정확한 결과를 구할 수 있다
		double result = (double)aa / bb;
		System.out.println("double형 변화 결과 : " + result);
		
		
		
		
		
		
		
		
		
		
	}
}
