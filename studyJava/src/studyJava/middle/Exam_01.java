package studyJava.middle;

public class Exam_01 {

	int initMoney = 50000;
	int cnt = 0;
	public void processMoney(int pay) {
		
		for (int i = 1; i <= 10; i++) {
			cnt = pay / initMoney;
			System.out.println(initMoney + "원 : " + cnt);
			pay = pay % initMoney;
			
			if (i % 2 != 0) initMoney = initMoney / 5;
			else initMoney = initMoney / 2;
		}
		
	}
}
