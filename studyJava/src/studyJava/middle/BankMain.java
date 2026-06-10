package studyJava.middle;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// 메뉴와 객체 배열만 있는 설계도
		Bank[] bank = new Bank[100];
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		BankPro bankPro = new BankPro();

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1. 게좌 생성  |  2. 계좌 목록  |  3. 예금하기  |  4. 출금하기  |  5. 종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 : ");
			int choice = sc.nextInt();

			if (choice == 1) {
				bankPro.createAccount(bank);
			} else if (choice == 2) {
				bankPro.accountList(bank);
			} else if (choice == 3) {
				bankPro.deposit(bank);
			} else if (choice == 4) {
				bankPro.withdraw(bank);
			} else if (choice == 5) {
				run = false;
			} else {
				System.out.println("메뉴선택 다시 하세요");
			}

		}
	}

}
