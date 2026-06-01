package studyJava.basic;

import java.util.Scanner;

public class Java14_operator {

	public static void main(String[] args) {
		// 할인 대상 확인(학생 또는 경로우대)
		// 나이 입력 : 20
		// 할인 대상 여부 : true
		
		//조건 : 나이 24세 이하(학생) 또는 65세 이상(경로우대)
		
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		boolean result = age <= 24 || age >= 65;
		//조건이 참이면 true(1)을 저장 그렇지 않으면 false(0)을 저장
		
		if (result) {  //result 변수에 저장된 값이 true이면
			System.out.println("할인 대상자 입니다");
		} else {
			System.out.println("할인 대상자가 아닙니다");
		}
		
	} // main end

} // class end
