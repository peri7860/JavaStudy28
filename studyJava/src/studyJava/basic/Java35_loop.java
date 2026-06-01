package studyJava.basic;

import java.util.Scanner;

public class Java35_loop {

	public static void main(String[] args) {
		// 업다운 게임 만들기
		
		// 컴퓨터가 무작위의 1-100 사이의 정수값 숫자를 만든다
		int com = (int)(Math.random() * 100) + 1;
		int me = 0;
		int corCnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 맞추기 게임");
		
		for(;;) { // for문으로 무한반복
			System.out.print("숫자 입력 : ");
			me = sc.nextInt();
			
			corCnt++;
			
			if (com > me) {
				System.out.println("업");
			} else if (com < me) {
				System.out.println("다운");
			} else {
				System.out.println("골든 정답");
				break;
			}
		}
		
		System.out.println("시도한 횟수 : " + corCnt);
		
	}

}
