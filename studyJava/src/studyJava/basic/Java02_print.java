package studyJava.basic;

public class Java02_print {
	
	public static void main(String[] args) {
		System.out.println("성적표");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
		
		
		//데이터 타입의 종류
		//정수형 : boolean(참, 거짓), byte(-128~127), char(문자 1개), short(2byte : -32768~32767), int(4byte : ), long
		//실수형 : float(4byte : 소수점 7자리), double(8byte : 소수점 15자리)
		//참조형 : String, 배열... 위 기본형을 제외한 나머지 (주소를 참조)
		
		//변수란? 처리하고자 하는 데이터 또는 처리된 데이터를 저장하는 기억장소
		//대입문 V = e; 
		//V는 변수, e는 데이터, 수식, 값, 변수
		//e값을 V변수에 저장하시오
		
		//프로그램 작성 방법
		//1) 필요한 변수 선언 2) 조건, 또는 수식을 만들고 3) 출력한다
		
		int a; //a 라는 4바이트 크기의 변수를 선언하시오
		a = 10; // int a = 10;
		int b;
		b = 5;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// 정수형
		byte by = 127;
		// byte by2 = 128; 에러 왜? -128 ~ 127
		short s = 32000;
		int i = 10000;
		long l = 9999;
		//실수형
		float f = 3.14f; // float 데이터는 반드시 뒤에 f를 붙여야 한다
		double d = 3.14; // double 형으로 저장할 때는 뒤에 d를 생략할 수 있다
		//문자형
		char c = 'A'; //문자 한글자를 저장 할 때는 ' ' 사용
		//논리형
		boolean bool = true;
		//참조형
		String str = "Hello Java"; //문자열을 저장 할 때는 " " 사용
		int[] arr = {1, 2, 3, 4, 5}; //배열 = [ ] 선언과 초기화
		
		System.out.println("byte : " + by);
		System.out.println("int : " + i);
		System.out.println("str = " + str);		
		
		
		// 대입형 변수와 누적형 변수
		
		int var = 10;
		int abc = 20;
		var = 5;
		int sum = var + abc;
		
		//누적
		int cnt = 0;
		sum = 0;
		
		cnt++;
		sum += cnt;
		cnt++;
		sum += cnt;
		cnt++;
		sum += cnt;
		cnt++;
		sum += cnt;
		
		System.out.println("1부터 4까지 합계 = " + sum);
		
		
	}

}












