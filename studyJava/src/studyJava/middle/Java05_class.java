package studyJava.middle;

public class Java05_class { // 은행계좌 클래스
	
	// 필요한 멤버 변수
	String owner; // 예금주 이름
	String accountNum; // 계좌번호
	int balance; // 잔액
	
	public Java05_class() {} // 기본 생성자
	// 기본 생성자는 코딩을 안해도 컴파일 하면 자동으로 생성을 해준다
	
	public Java05_class(String owner, String accountNum, int balance) {
		// 매개변수가 있는 생성자를 만들면 기본 생성자는 만들어지지 않는다
		this.owner = owner;
		this.accountNum = accountNum;
		this.balance = balance;
		
	}
	
	// 입금 메서드
	void deposit(int amount) { // amount 매개변수는 입금액
		if (amount < 0) { // 0원 이하 입금 불가
			System.out.println("입금액을 확인하세요");
			return; // 무조건 호출한 곳으로 되돌아 가시오
		}
		balance = balance + amount; 
		// 현재 자기자신의 멤버변수 일 때는 this 생략가능
		System.out.printf("%,d원 입금완료! 잔액 : %,d원\n", amount, balance);
	}
	
	// 출금 메서드
	void withdraw(int amount) { // amount 매개변수는 출금액
		if (amount <= 0) { // 0원이하 출금 불가
			System.out.println("출금액이 올바르지 않아요!");
			return;
		}
		if (amount > balance) { // 잔액 부족
			System.out.println("잔액부족! 현재 잔액 : " + balance + "원");
			return;
		}
		balance = balance - amount;  // 잔액에서 출금액 차감
		System.out.printf("%,d원 출금완료! 잔액 : %,d원\n", amount, balance);
		
	}
	
	// 계좌 정보 출력 메서드
	void printInfo() {
		System.out.println("==================================================");
		System.out.println("예금주 : " + owner);
		System.out.println("계좌번호 : " + accountNum);
		System.out.printf("잔액 : %,d원\n", balance);
		System.out.println("==================================================");
	}
	
	// 계좌 이체 메서드
	void transfer(Java05_class target, int amount) {
		if(amount > balance) { // 잔액 부족
			System.out.println("잔액 부족으로 계좌이체 실패!");
			return; // 호출한 곳으로 무조건 되돌아 가세요
		}
		
		this.balance = this.balance - amount; // 보내는 계좌에서 차감
		target.balance += amount; // 받는 계좌에 추가
		System.out.printf("%s -> %s 이체 : %,d원%n", this.owner, target.owner, amount);
		
	}

}









