package studyJava;

import java.util.Scanner;

public class Java39_loop {

	public static void main(String[] args) {
		// 화폐단위별 매수 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("금액입력 : ");
//		int pay = sc.nextInt();
//		int money = 50000;
//		
//		for(int i = 1; i <= 10; i++) {
//			int count = pay / money;
//			System.out.println(money + "원 : " + count + "개");
//			pay = pay % money;
//			if(money == 50000) {
//				money = 10000;
//			} else if (money == 10000) {
//				money = 5000;
//			} else if (money == 5000) {
//				money = 1000;
//			} else if (money == 1000) {
//				money = 500;
//			} else if (money == 500) {
//				money = 100;
//			} else if (money == 100) {
//				money = 50;
//			} else if (money == 50) {
//				money = 10;
//			} else if (money == 10) {
//				money = 5;
//			} else if (money == 5) {
//				money = 1;
//			}
// 		}

		//위 화폐단위를 스위치 방식으로 간단히 변경하여 보자
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액입력 : ");
		int pay = sc.nextInt();
		int money = 50000;
		boolean bool = true;
		
		for(int i = 1; i <= 10; i++) {
			int count = pay / money;
			System.out.println(money + "원 : " + count + "개");
			pay = pay % money;
			if (bool) {
				money = money / 5;
				bool = false;
			} else {
				money = money / 2;
				bool = true;
			}
 		}
		
	}

}
