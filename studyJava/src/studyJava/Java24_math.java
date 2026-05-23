package studyJava;

import java.util.Scanner;
import java.lang.Math;

public class Java24_math {

	public static void main(String[] args) {
		// 임의의 정수 만들기
		// Math.random() : 0.0보다 크거나 같고 1.0보다 작은 임의의 double값을 반환
		// 로또생성, 업다운 게임, 가위 바위 보 게임, 주사위 게임, 보안인증 번호
		
		//주사위 번호 1-6까지 있다. 임의의  숫자를 만들어보시오
		
		//1. 각 변에 6을 곱한다 0.0 <= Math.random() < 1.0
		//2. 각 변을 int형으로 변환한다
		//3. 각변에 1을 더한다
		
		Scanner sc = new Scanner(System.in);
		int me = 0;
		int com = 0;
		
		System.out.print("1-6사이 임의 숫자 입력 : ");
		me = sc.nextInt();
		
		com = (int) (Math.random() * 6) + 1;
		if(me < 1 || me > 6) {
			System.out.println("숫자 입력 오류");
		} else {
			if (me > com) System.out.println("이김");
			else if (me < com) System.out.println("빠큐");
			else System.out.println("까비");
		}
		
	}

}
