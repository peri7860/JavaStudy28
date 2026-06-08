package studyJava.middle;

public class Java05_main {

	public static void main(String[] args) {
		
		Java05_class j1 = new Java05_class("홍길동", "110", 500000);
		Java05_class j2 = new Java05_class("김길동", "111", 200000);
		
		j2.printInfo();
		
		j1.printInfo();
		j1.deposit(100000);
		j1.withdraw(50000);
		j1.transfer(j2, 100000);
		
		j1.printInfo();
		j2.printInfo();
//		j2.printInfo();
//		j2.deposit(20000);
//		j2.withdraw(1000000);
	}

}
