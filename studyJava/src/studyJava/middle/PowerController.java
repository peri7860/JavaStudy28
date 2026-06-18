package studyJava.middle;

// 스마트홈 기기 인터페이스

// 전원 제어 인터페이스
public interface PowerController {

	public abstract void turnOn(); // 전원 켜기
	void turnOff(); // 전원 끄기
	boolean isPowerd(); // 전원 상태 반환 
}

// 원격 제어 인터페이스
interface RemoteControler {
	void setTimer(int minutes); // 타이머 설정
	void schedule(String time); // 예약 설정
}

// 에너지 모니터링 인터페이스
interface EnergyMonitor {
	double getWattage(); // 소비전력 반환
	double calcMonthlyBill(); //월 전기 요금 계산
}

// 스마트 에어콘
class SmartAc implements PowerController, RemoteControler, EnergyMonitor {
	String brand; // 브랜드
	boolean powered; // 전원 상태
	int temperature; //설정 온도
	double wattage; // 소비 전력(W)
	int timeMin; // 타이머(분)
	
	SmartAc(String brand, int temperature, double wattage) {
		this.brand = brand;
		this.temperature = temperature;
		this.wattage = wattage;
		this.powered = false;
		this.timeMin = 0;
	}
	
	@Override
	public void turnOn() {
		
		powered = true; // 전원 on
		System.out.println(brand + "에어콘 on! 설정온도 : " + temperature + "℃");
	}
	
	@Override
	public void turnOff() {
		
		powered = false; // 전원 off
		System.out.println(brand + "에어콘 off!");
		
	}
	
	@Override
	public boolean isPowerd() {
		return powered;
	}
	
	@Override
	public void setTimer(int minutes) {
		timeMin = minutes;
		System.out.println(minutes + "분 후 자동 off 예약");
	}
	
	@Override
	public void schedule(String time) {
		System.out.println(time + "자동 on 예약완료");
	}
	
	@Override
	public double getWattage() {
		return powered ? wattage : 0;  // 켜져 있을 때만 소비
	}
	
	@Override
	public double calcMonthlyBill() {
		// 전력(kw) * 하루 8시간 * 30일 * 요금(원/kw)
		return (wattage / 1000) * 8 * 30 * 120;
	}
	
	void setTemperatue(int temp) { // 온도 설정 메서드
		temperature = temp;
		System.out.println("온도 " + temp + "℃ 설정");
	}
	
	void printStatus() {
		System.out.println("============================");
		System.out.println("기기 : " + brand + "에어콘");
		System.out.println("전원 : " + ((powered) ? "ON" : "OFF"));
		System.out.println("온도 : " + temperature + "℃");
		System.out.println("소비 전력 : " + getWattage());
		System.out.println("월 요금 : " + calcMonthlyBill());
		System.out.println("============================");
	}
}

// 스마트 전구
















