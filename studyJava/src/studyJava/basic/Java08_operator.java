package studyJava.basic;

import java.util.Scanner;

public class Java08_operator {

	public static void main(String[] args) {
		// 키보드로 부터 정수를 입력받아서 홀수, 짝수를 출력하시오
		// 정수 입력 : 33
		// 홀수 입니다.
		
		Scanner scanner = new Scanner(System.in);
		
		int score;
		String result;
		
		System.out.print("정수 입력 : ");
		score = scanner.nextInt();
		
		result = (score % 2 == 0) ? "짝수 입니다." : "홀수 입니다.";
		
		System.out.println(result);
		
		//문자, 문자열 연산
		System.out.println('A');
		//ASCII A->65
		System.out.println('A' + 1);
		//숫자와 덧셈을 하면 65 + 1 -> 66
		System.out.println('A' + 'B');
		//연산식으로 문자를 더하면 ASCII코드 값으로 계산을 한다
		System.out.println("A" + "B");
		//문자열과 문자열을 더하면 AB
		System.out.println("1" + "2");
		//" "문자열. 문자12출력
		System.out.println("A" + 1);
		//문자열과 숫자를 더하면 문자열 A1출력
		
	}

}
















