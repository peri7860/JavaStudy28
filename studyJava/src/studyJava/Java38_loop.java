package studyJava;

import java.util.Scanner;

public class Java38_loop {

	public static void main(String[] args) {

//		======= 가계부 =======
//				종류: 1=수입 2=식비 3=교통 4=쇼핑 5=기타
//				(0 입력 시 종료)
//
//				종류 선택: 1
//				금액 입력(원): 3000000
//				✅ 수입 3000000원 추가
//				현재 잔액: 3000000원
//
//				종류 선택: 2
//				금액 입력(원): 150000
//				🍚 식비 150000원 지출
//				현재 잔액: 2850000원
//
//				종류 선택: 3
//				금액 입력(원): 80000
//				🚌 교통비 80000원 지출
//				현재 잔액: 2770000원
//
//				종류 선택: 4
//				금액 입력(원): 250000
//				🛍️ 쇼핑 250000원 지출
//				현재 잔액: 2520000원
//
//				종류 선택: 0
//				================================
//				       최종 가계부 결산
//				================================
//				총 거래 건수: 4건
//				총   수   입: 3000000원
//				--------------------------------
//				식      비: 150000원
//				교  통  비: 80000원
//				쇼      핑: 250000원
//				기      타: 0원
//				총   지   출: 480000원
//				--------------------------------
//				💰 잔  액: 2520000원
//				================================

		int typeInput = 0; // 종류
		int moneyInput = 0; // 금액 입력
		int balance = 0; // 잔액
		int income = 0; // 수입
		int foodExpense = 0; // 식비 지출
		int traffExpense = 0; // 교통 지출
		int shopExpense = 0; // 쇼핑 지출
		int other = 0;  // 기타
		int totalExpense = 0; // 총 지출
		int tranCount = 0; // 거래건수
		int totalIncome = 0;
		int totalFood = 0;
		int totalTraffic = 0;
		int totalShop = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("======= 가계부 =======");
		System.out.println("종류: 1=수입 2=식비 3=교통 4=쇼핑 5=기타");
		System.out.println("(0 입력 시 종료)");

		while (true) {   // 무한반복
			System.out.print("종류 선택: ");
			typeInput = sc.nextInt();  // 종류 입력 받음
			
			switch (typeInput) {
			case 1: {  // 수입
				System.out.print("금액 입력(원): ");
				moneyInput = sc.nextInt();
				income = moneyInput;
				totalIncome += income;
				balance += moneyInput;
				tranCount++;
				System.out.println("✅ 수입" + moneyInput + "원 추가");
				System.out.println("현재 잔액: " + balance + "원");
				System.out.println();
				continue;
			}
			case 2: { // 식비 지출
				System.out.print("금액 입력(원): ");
				moneyInput = sc.nextInt();
				foodExpense = moneyInput;
				totalFood += foodExpense;
				balance -= foodExpense;
				totalExpense += foodExpense;
				tranCount++;
				System.out.println("🍚 식비" + foodExpense + "원 지출");
				System.out.println("현재 잔액: " + balance + "원");
				System.out.println();
				continue;
			}
			case 3: {
				System.out.print("금액 입력(원): ");
				moneyInput = sc.nextInt();
				traffExpense = moneyInput;
				totalTraffic += traffExpense;
				balance -= traffExpense;
				totalExpense += traffExpense;
				tranCount++;
				System.out.println("🚌 교통비" + traffExpense + "원 지출");
				System.out.println("현재 잔액: " + balance + "원");
				System.out.println();
				continue;
			}
			case 4: {
				System.out.print("금액 입력(원): ");
				moneyInput = sc.nextInt();
				shopExpense = moneyInput;
				totalShop += shopExpense;
				balance -= shopExpense;
				totalExpense += shopExpense;
				tranCount++;
				System.out.println("🛍️ 쇼핑 " + shopExpense + "원 지출");
				System.out.println("현재 잔액: " + balance + "원");
				System.out.println();
				continue;
			}
			case 5: {
				continue;
			}
			case 0: {
				break;
			}
			default:
				break;
			}
			break;
		}
		
		System.out.println("================================");
		System.out.println("       최종 가계부 결산");
		System.out.println("================================");
		System.out.println("총 거래 건수: " + tranCount);
		System.out.println("총   수   입: " + totalIncome);
		System.out.println("--------------------------------");
		System.out.println("식      비: " + totalFood);
		System.out.println("교  통  비: " + totalTraffic);
		System.out.println("쇼      핑: " + totalShop);
		System.out.println("기      타: 0원");
		System.out.println("총   지   출: " + totalExpense);
	}

}
