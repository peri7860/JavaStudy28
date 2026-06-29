package studyJava.middle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EmpMethod {

	Scanner sc = new Scanner(System.in);

	public void insert(ArrayList<Emp> list) {
		Emp emp1 = new Emp();
		
		System.out.print("사번 : ");
		int idx = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("부서 : ");
		String dept = sc.next();
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.print("근속연수 : ");
		int year = sc.nextInt();
		
		emp1.setIdx(idx);
		emp1.setName(name);
		emp1.setDept(dept);
		emp1.setSalary(salary);
		emp1.setYears(year);

		list.add(emp1);
	}

	// 전체 출력
	public void empAllPrint(ArrayList<Emp> list) {
		// 전체 직원 출력
		// 가변 배열에 저장된 객체를 한개씩 자동으로 가져와서
		// 변수에 저장 후 출력한다
		// 변수는 가져온 데이터 타입으로 꼭 맞춘다 - Emp e
		for (Emp e : list) {
			System.out.println(e.toString());
		}
	}

	// 급여 오름차순 출력
	public void empSalaryAsc(ArrayList<Emp> list) {
		// Comparator 비교 규칙을 만드는 클래스
		// e -> e.getSalary() 람다식이라고 부른다. 비교하고 싶은 값을 가져온다
		// Comparator.comparingInt() : e1-e2를 실행해서 양수면 교환, 음수이면 교환을 안한다
		// comparingInt : 정수값
		// 오름차순으로 정렬된다
		System.out.println("====오름차순====");
		list.sort(Comparator.comparingInt(Emp::getSalary));
		list.sort(Comparator.<Emp>comparingInt(e -> e.getSalary()));
		
		System.out.println("====교육용====");
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getSalary() > list.get(j).getSalary()) {
					Emp temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		for (Emp e : list) {
			System.out.println(e.toString());
		}
	}

	// 급여 내림차순 출력
	public void empSalaryDesc(ArrayList<Emp> list) {
		System.out.println("====내림차순====");
		// 내림차순
		list.sort(Comparator.<Emp>comparingInt(e -> e.getSalary()).reversed());
		for (Emp e : list) {
			System.out.println(e.toString());
		}

		System.out.println("====내림차순====");
		list.sort((e1, e2) -> e2.getSalary() - e1.getSalary());
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ", " + list.get(i));
		}
		
		for (Emp e : list) {
			System.out.println(e.toString());
		}
	}

	// 이름 오름차순 출력
	public void empNameAsc(ArrayList<Emp> list) {

		System.out.println("===문자열 비교 정렬===");
		list.sort(Comparator.comparing(e -> e.getName()));
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ", " + list.get(i));
		}

		System.out.println("===문자열 오름차순 정렬===");
		list.sort(Comparator.<Emp, String>comparing(e -> e.getName()));
		for (Emp e : list) {
			System.out.println(e.toString());
		}

		System.out.println("==문자열 메서드 참조 연산자 이용. 가장 추천==");
		System.out.println(":: 이용 오름차순");
		list.sort(Comparator.comparing(Emp::getName));
		for (Emp e : list) {
			System.out.println(e.toString());
		}

		// :: 기호는 메서드 참조 연산자라고 한다.
		// 메서드 참조란? 람다식 e -> e.getName()을 어차피 Emp클래스의 getName
		// 메서드를 호출하는거 다 아는데 더 줄여 쓸 수 없나? 해서 나온 문법이다
	}

	// 이름 내림차순 출력
	public void empNameDesc(ArrayList<Emp> list) {

		System.out.println("===문자열 내림차순 정렬===");
		list.sort(Comparator.<Emp, String>comparing(e -> e.getName()).reversed());
		for (Emp e : list) {
			System.out.println(e.toString());
		}

		System.out.println(":: 이용 내림차순");
		list.sort(Comparator.comparing(Emp::getName).reversed());
		for (Emp e : list) {
			System.out.println(e.toString());
		}
	}

}
