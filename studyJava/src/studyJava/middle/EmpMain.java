package studyJava.middle;

import java.util.ArrayList;
import java.util.Comparator;

public class EmpMain {

	public static void main(String[] args) {

		// 개발 방법

		// 저장 방법
		// 1. 객체 생성 설계도를 만든다
		// 2. 객체를 저장하기 위한 가변 배열을 생성한다
		// 3. 객체를 생성하고 값을 멤버변수에 저장한다
		// 4. 생성된 객체를 가변 변수에 추가 한다

		ArrayList<Emp> list = new ArrayList<Emp>();
		// Emp객체를 저장하기 위한 가변배열 객체를 생성한다

		EmpMethod em = new EmpMethod();
		
//		list.add(new Emp(2, "김길동", "영업팀", 3200000, 3));

		// 전체 직원 출력
		// 가변 배열에 저장된 객체를 한개씩 자동으로 가져와서
		// 변수에 저장 후 출력한다
		// 변수는 가져온 데이터 타입으로 꼭 맞춘다 - Emp e

//		for (Emp e : list) {
//			System.out.println(e.toString());
//		}
		
		em.insert(list);
		em.empAllPrint(list);
		

		// 람다식
		// 메서드를 간단하게 표현하는 익명함수(이름 없는 함수)이다.

		list.sort(Comparator.<Emp>comparingInt(e -> e.getSalary()));
		list.sort(Comparator.comparingInt(Emp::getSalary));
		// Comparator 비교 규칙을 만드는 클래스
		// e -> e.getSalary() 람다식이라고 부른다. 비교하고 싶은 값을 가져온다
		// Comparator.comparingInt() : e1-e2를 실행해서 양수면 교환, 음수이면 교환을 안한다
		// comparingInt : 정수값
		// 오름차순으로 정렬된다
		System.out.println();
		System.out.println("====오름차순====");
		for (Emp e : list) {
			System.out.println(e.toString());
		}

		// 내림차순
		list.sort(Comparator.<Emp>comparingInt(e -> e.getSalary()).reversed());
		System.out.println();
		System.out.println("====내림차순====");
		for (Emp e : list) {
			System.out.println(e.toString());
		}

		System.out.println("====내림차순====");
		list.sort((e1, e2) -> e2.getSalary() - e1.getSalary());
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ", " + list.get(i));
		}

		System.out.println("====교육용====");
		for (int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getSalary() > list.get(j).getSalary()) {
					Emp temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ", " + list.get(i));
		}
		
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
		
		System.out.println("===문자열 내림차순 정렬===");
		list.sort(Comparator.<Emp, String>comparing(e -> e.getName()).reversed());
		for (Emp e : list) {
			System.out.println(e.toString());
		}
		
		System.out.println("==문자열 메서드 참조 연산자 이용. 가장 추천==");
		System.out.println(":: 이용 오름차순");
		list.sort(Comparator.comparing(Emp::getName));
		for (Emp e : list) {
			System.out.println(e.toString());
		}
		
		System.out.println(":: 이용 내림차순");
		list.sort(Comparator.comparing(Emp::getName).reversed());
		for (Emp e : list) {
			System.out.println(e.toString());
		}
		// :: 기호는 메서드 참조 연산자라고 한다.
		// 메서드 참조란? 람다식 e -> e.getName()을 어차피 Emp클래스의 getName
		// 메서드를 호출하는거 다 아는데 더 줄여 쓸 수 없나? 해서 나온 문법이다
		
	}

}
