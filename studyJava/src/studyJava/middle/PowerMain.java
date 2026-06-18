package studyJava.middle;

public class PowerMain {

	public static void main(String[] args) {
		
		SmartAc ac = new SmartAc("LG", 24, 1500);
		System.out.println("스타트 홈 제어");
		ac.turnOn(); // 에어콘 on
		ac.setTemperatue(22); // 온도 22
		ac.setTimer(120); // 2시간 후 off
		ac.schedule("08:00");
		ac.printStatus();

	}

}
