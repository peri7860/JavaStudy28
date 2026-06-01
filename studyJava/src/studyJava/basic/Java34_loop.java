package studyJava.basic;

import java.util.Scanner;

public class Java34_loop {

	public static void main(String[] args) {
		
		int i = 0;
		do {
			System.out.println(i++); // 후위 연산자는 실행 후 증가
		} while(i == 3); //조건이 참일 때 반복한다

		//키보드로 부터 점수(1~100)을 입력받아서 최대점수, 최소점수를 구하여 출력하시오
		//단, 입력되는 점수가 -99이면 출력후 종료한다.
		//입력예시
		//점수입력 : 10 5 60 41 78 92 50 -99
		//최대점수 : 92
		//최소점수 : 5
		
		int input = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		
		while(true) {
			input = sc.nextInt();
			if (input == -99) break; //만약에 입력값이 -99이면 while문 런친다
 			if (input < 1 || input > 100) continue;
			if (input > max) max = input; // 입력 값이 최대값보다 크면
			if (input < min)  min = input; // 입력 값이 최소값보다 작으면
		}
		
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
	}

}
