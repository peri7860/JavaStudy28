package studyJava.middle;

import java.util.Scanner;

public class BankPro {

	// 메서드만 있는 설계도
	Scanner sc = new Scanner(System.in);

	// 계좌 생성 기능 메서드
	public void createAccount(Bank[] bankArray) {
		//Bank[] bankArray 배열을 넘겨 받는 매개변수 이해 하기 바람
		System.out.println("-----------------------");
		System.out.println("계좌를 생성합니다");
		System.out.println("-----------------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();

		Bank bank = new Bank(ano, owner, balance);

		for (int i = 0; i < bankArray.length; i++) {
			if (bankArray[i] == null) {
				bankArray[i] = bank;
				System.out.println("계좌생성 완료!");
				break;
			}
		}

	}

	// 계좌 목록 기능 메서드
	public void accountList(Bank[] bankArray) {
		System.out.println("-----------------------");
		System.out.println("계좌목록");
		System.out.println("-----------------------");

		for (int i = 0; i < bankArray.length; i++) {
			if (bankArray[i] != null) {
				System.out.print(bankArray[i].ano + "\t");
				System.out.print(bankArray[i].owner + "\t");
				System.out.print(bankArray[i].balance + "\t");
			}
		}
	}

	// 예금하기 기능 메서드
	public void deposit(Bank[] bankArray) {
		System.out.println("-----------------------");
		System.out.println("예금하기");
		System.out.println("-----------------------");
		System.out.println("계좌번호 입력 : ");
		String ano = sc.next();
		System.err.println("예금액 : ");
		int money = sc.nextInt();
		
		for(Bank b : bankArray) {
			if(b != null && b.ano != null && b.ano.equals(ano)) {
				b.balance += money;
				System.out.println("결과 : 예금성공! 잔액 : " + b.balance);
				return;
			}
		}
		
		System.out.println("계좌번호가 존재하지 않아요");
	}

	// 출금하기 기능 메서드
	public void withdraw(Bank[] bankArray) {
		System.out.println("-----------------------");
		System.out.println("출금하기");
		System.out.println("-----------------------");
		System.out.println("계좌번호 입력 : ");
		String ano = sc.next();
		System.err.println("출금액 : ");
		int money = sc.nextInt();

		for (Bank b : bankArray) {
			if (b != null && b.ano != null && b.ano.equals(ano)) {
				b.balance -= money;
				System.out.println("결과 : 출금성공! 잔액 : " + b.balance);
				return;
			}
		}
		
		System.out.println("계좌번호가 존재하지 않아요");
	}

	// 계좌 찾기 기능 메서드
	public void findAccount() {

	}
}
