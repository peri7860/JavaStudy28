package studyJava;

import java.util.Arrays;

public class Java27_loop {

	public static void main(String[] args) {
		// java 반복문(loop)이란?
		// 반복문이란 특정 코드를 조건이 만족하는 동안 반복해서 실행하는 문장
		// 같은 코드를 여러번 작성하지 않고 효율적으로 처리할 수 있다
		
		// 반복문의 종류
		// for : 반복횟수가 정해져 있을 때 사용
		// while : 조건이 참인 동안 반복
		// do-while : 최소 1번은 무조건 실행후 반복
		// 중첩 for : for문에 for문
		// break : 반복문 즉시 종료
		// continue : 현재 반복 건너뛰고 다음으로
		
		System.out.println("JSL 인재개발원");
		
		// 위 문장을 while문으로 작성 해보자
		int cnt = 1;
		while(cnt <= 5)
		{
			System.out.println(cnt + " JSL 인재개발원");
			cnt = cnt + 1;
			
		}
		
		int i = 5;
		while(true)
		{
			System.out.println(i + " JSL 인재개발원");
			i--;
			if(i == 0) break;
		}
		
		//초기치
//		do {
//			
//		}while(조건식)
		
		int k = 1;
		do {
			System.out.println(k + " JSL 인재개발원");
			k++;
		} while(k <= 5); // 조건식이 참이면 do, 거짓이면 반복을 정지하고 다음 문장 실행
		
		// for문으로 변경해서 출력해보자
		for (int m = 1; m <= 5; m++) {
			// 반복실행할 초기치;조건식;증감식 순으로 코딩한다
			// 초기값은 1번 실행, 조건식이 참이면 { } 실행, 증가치 실행, 조건식 실행
			// 조건식이 거짓이면 { }을 빠져나가서 다음문장 실행한다
			System.out.println(m + " JSL 인재개발원");
		}
		
//		int re = 0;
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		for(int j = 0; j < arr.length; j++) {
//			re += arr[j];
//		}
//		System.out.println(re);
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("1+2+3+4+5+6+7+8+9+10=" + Arrays.stream(arr).sum());
		

	}

}
