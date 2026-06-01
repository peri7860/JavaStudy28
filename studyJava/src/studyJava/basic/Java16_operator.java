package studyJava.basic;

import java.util.Scanner;

public class Java16_operator {

	public static void main(String[] args) {
		// 무료배송 여부 처리
		
		//주문 금액 (원) : 20000
		//회원여부(1 - 회원, 0 - 비회원) : 1
		//무료배송여부 : true
		
		// 조건 3만원 이상 또는 회원이면 무료배송한다
		
		Scanner sc = new Scanner(System.in);
		int orderPrice;
		int memberInput;
		boolean result;
		
		System.out.print("주문 금액 (원) : ");
		orderPrice = sc.nextInt();
		
		System.out.print("회원여부(1 - 회원, 0 - 비회원) : ");
		memberInput = sc.nextInt();
		
		result = orderPrice >= 30000 || memberInput != 0;
		
		if (result) {
			System.out.println("무료 배송 가능");
		} else {
			System.out.println("상품구매 또는 회원가입 하세요");
		}

	}

}
