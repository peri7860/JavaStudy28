package studyJava.middle;

public abstract class Payment { // 결재수단

	// 공통 필드
	String ownerName; // 소유자 이름
	int totalPaid; // 총 결제 금액

	// 생성자 - 공통 초기화
	public Payment() {
	}

	Payment(String ownerName) {
		this.ownerName = ownerName;
		this.totalPaid = 0;
	}

	// 추상 메서드 - 결재처리(수단 마다 다름)
	abstract boolean pay(int amount);

	// 추상 메서드 - 결재 수단 이름
	abstract String getPaymentType();

	// 추상 메서드 - 잔액/한도 조회
	abstract int getAvailable();

	// 일반 메서드 - 영수증 출력(공통)
	void printReceipt(int amount) {
		System.out.println("==========================");
		System.out.println("결재완료");
		System.out.println("==========================");
		System.out.println("결재자 : " + ownerName);
		System.out.println("수단 : " + getPaymentType());
		System.out.println("결재액 : " + amount);
		System.out.println("누적 : " + totalPaid);
		System.out.println("잔여 : " + getAvailable());
		System.out.println("==========================");
	}
}

class Kakaopay extends Payment {

	String phoneNum; // 전화번호
	int point; // 포인트
	int balance; //충전금액
	
	
}

// 자식 클래스 - 체크카드
class DebitCard extends Payment {
	
	int balance; // 잔액 (체크카드 필요)
	
}

// 자식 클래스 - 신용카드
class CreditCard extends Payment {
	
	String cardNum; // 카드번호
	int creditLimit; // 신용한도
	int useAmount; // 사용금액
	
	public CreditCard(String ownerName, String cardNum, int creditLimit) {
		super(ownerName);
		this.cardNum = cardNum;
		this.creditLimit = creditLimit;
		this.useAmount = 0;
	}
	
	@Override
	boolean pay(int amount) {
		
		if(amount > getAvailable()) { // 한도 초과 체크
			System.out.println("한도초과! 가용 : " + String.format("%,d", getAvailable()) + "원");
			return false; //결재 실패
		}
		useAmount += amount; // 사용 금액 증가
		totalPaid += amount; // 총결재 증가
		printReceipt(amount); // 영수증 출력
		return true;
	}
	
	@Override
	String getPaymentType() {
		
		return "신용카드 (" + cardNum + ")"; // 카드 정보 교환
	}
	
	@Override
	int getAvailable() {
		return creditLimit - useAmount; // 한도 - 사용금액
	}
}










