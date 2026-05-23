package studyJava;

import java.util.Scanner;

public class Java33_loop {

	public static void main(String[] args) {
		// 키보드로 부터 N개의 정수값을 입력받아 점수 중에서 0-100 사이의 점수 5개를
		// 찾아서 합계를 구하여 출력하시오
		
		//입력 : -99 
		//입력 : 10
		//입력 : 110
		//입력 : 20
		//입력 : 30
		//입력 : 40
		//입력 : 200
		//입력 : 50
		//합계 : 150
		
		int n = 0;
		int tot = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(cnt == 5) break;
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			if(n < 0 || n > 100) continue;
			cnt++;
			tot += n;
		}
		System.out.println("합 : " + tot);
	}

}
