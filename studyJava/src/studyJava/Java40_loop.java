package studyJava;

import java.util.Scanner;

public class Java40_loop {

	public static void main(String[] args) {
		// 다중 for문
		// for문안에 for문이 있는 경우(행렬처리, 2차원 테이블 처리시 필요하다)
		// 다중 for문에서 break문은 반복문 하나만 빠져나간다
		// 다중 for문에서 continue문은 조건식 또는 증감식으로 이동한다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수입력(2-9) : ");
		int dan = sc.nextInt();
		System.out.println(dan + "단");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		
		for(int i = 9; i >= 1; i--) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		
	}

}
