package studyJava.middle;

public class PaymentMain {

	public static void main(String[] args) {
		
		CreditCard cc = new CreditCard("홍길동", "1234-1234-2026", 1000000);
		DebitCard dc = new DebitCard("김길동", 500000);
		Kakaopay kp = new Kakaopay("박길동", "010-1234-5678", 3000000);
		
		System.out.println("신용카드 결재");
		cc.pay(120000); // 12만원 결졔
		cc.pay(50000); // 5만원 결제
		cc.pay(9000000); // 9백만원 (한도 초과)
		
		System.out.println("체크카드 결제");
		dc.pay(200000); // 20만원 결제
		dc.pay(350000); // 35만원 (잔액부족)
		
		System.out.println("카카오 페이 결제");
		kp.pay(100000); // 십만 결제
 		kp.pay(500000); // 오십만 결제

	}

}
