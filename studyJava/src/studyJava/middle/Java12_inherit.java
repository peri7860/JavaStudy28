package studyJava.middle;

// 부모클래스 - 직원
class Employee { // 직원

	String name; // 이름
	String dept; // 부서
	int baseSalary; // 기본급
	int workYears; // 근속 연수

	Employee() {
	}

	// 부모 생성자
	Employee(String name, String dept, int baseSalary, int workYears) {
		this.name = name;
		this.dept = dept;
		this.baseSalary = baseSalary;
		this.workYears = workYears;
	}

	Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	// 근속 수당 - 공통계산
	int getSendPay() {
		return workYears * 50000; // 1년 => 5만원
	}

	// 급여계산 - 자식에게 오버라이딩
	int calcSalary() {
		return baseSalary + getSendPay();
	}

	// 직원 정보 출력
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
		System.out.printf("기본급 : %,d원%n", baseSalary);
		System.out.println("근속 : " + workYears + "년");
		System.out.printf("급여 : %,d원%n", calcSalary());
	}
}

class FullTime extends Employee { // 정규직

	int bonus; // 상여금
	String position; // 직급 // 총 6개의 멤버변수 사용 가능

	FullTime() {
	}

	public FullTime(String name, String dept, int baseSalary, int workYears, String position, int bonus) {
		super(name, dept, baseSalary, workYears);
		this.position = position;
		this.bonus = bonus;
	}

	@Override
	int calcSalary() {
		return super.calcSalary() + bonus;
	}

	@Override
	void printInfo() {
		System.out.println("[정규직]");
		super.printInfo();
		System.out.println("직급 : " + position);
		System.out.println("상여금 : " + bonus);
	}
}

class PartTime extends Employee { // 계약직
	int workHours; // 월 근무시간
	int hourlyWage; // 시급

	public PartTime(String name, String dept, int workHours, int hourlyWage) {
		super(name, dept);
		this.workHours = workHours;
		this.hourlyWage = hourlyWage;
	}

	@Override
	int calcSalary() {
		return hourlyWage * workHours;
	}

	@Override
	void printInfo() {
		System.out.println("[계약직]");
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
		System.out.println("시급 : " + hourlyWage);
		System.out.println("근무시간 : " + workHours);
		System.out.println("급여 : " + calcSalary());
	}
}

class Intern extends Employee { // 인턴
	int period; // 인턴기간(개월)
	boolean converted; // 정규직 전환여부

	public Intern(String name, String dept, int baseSalary, int period, boolean converted) {
		super(name, dept, baseSalary, 0);
		this.period = period;
		this.converted = converted;
	}

	// 정규직 전환 메서드
	void convert() {
		converted = true;
		System.out.println(name + "님 정규직 전환 완료!");
	}

	@Override
	void printInfo() {
		System.out.println("[인턴]");
		super.printInfo();
		System.out.println("기간 : " + period + "개월");
		System.out.println("전환 : " + ((converted) ? "완료" : "미완료"));
	}
}

public class Java12_inherit {

	public static void main(String[] args) {
		
		// 각 직원 유형 객체 생성
		FullTime ft = new FullTime("홍길동", "개발팀", 3500000, 5, "대리", 500000);
		PartTime pt = new PartTime("김알바", "영업팀", 160, 10000);
		Intern it = new Intern("이인턴", "기획팀", 2000000, 6, false);
		
		ft.printInfo(); // 정규직 정보 출력
		System.out.println();
		pt.printInfo(); // 계약직 정보 출력
		System.out.println();
		it.printInfo(); // 인턴 정보 출력
		it.convert(); // 정규직 전환
		it.printInfo();
		
	}

}
