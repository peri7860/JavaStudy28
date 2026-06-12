package studyJava.middle;
// 부모클래스 - 직원
class Employee { // 직원
	
	String name; // 이름
	String dept; // 부서
	int baseSalary; // 기본급
	int workYears; // 근속 연수
	// 부모 생성자
	Employee(String name, String dept, int baseSalary, int workYears) {
		this.name = name;
		this.dept = dept;
		this.baseSalary = baseSalary;
		this.workYears = workYears;
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


public class Java12_inherit {

	public static void main(String[] args) {
		
	}

}
