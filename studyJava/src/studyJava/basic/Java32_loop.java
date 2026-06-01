package studyJava.basic;

import java.util.Scanner;

public class Java32_loop {

	public static void main(String[] args) {
		// break : 반복문 수행중 break문을 만나면 가장 가까운 반복문을 빠져 나간다
		// continue : 반복문 중 continue문을 만나면 while문은 조건식으로 이동하고 
		//				  for문은 증감식으로 이동한다
		
		// 개수 카운트 하는 방법
		
		//키보드로 부터 무한반복하면서 정수를 입력 받아서 합과 평균을 출력해보자
		// 단, 입력값이 -99이면 종료한다
		
		int dec = 0; //입력받은 정수값 저장 변수
		int tot = 0; //입력받은 값이 정수이면 합을 구하는 변수
		double ave = 0.0; //평균을 저장하는 변수
		int cnt = 0; //입력받은 개수가 몇개인지 저장하는 변수
		Scanner sc = new Scanner(System.in);
		
		while(true) { //무한반복 : do-while(true); for(;;){} 
			System.out.print("정수 입력 (-99 == 종료) : ");
			dec = sc.nextInt();
			if (dec == -99) break;
			if(dec > 0) {
				cnt++;
				tot += dec;
			} else {
				System.out.println("정수만 입력 가능");
				continue;
			}
		}
		ave = tot / (double)cnt;
		System.out.println("합 : " + tot );
		System.out.println("평균 : " + ave);

	}

}
