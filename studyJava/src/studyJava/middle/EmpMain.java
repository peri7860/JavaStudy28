package studyJava.middle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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


//		for (Emp e : list) {
//			System.out.println(e.toString());
//		}
		boolean menu = true;
		Scanner sc = new Scanner(System.in);
		
		while(menu) {
			System.out.print("1. 입력 | 2. 출력 | 3. 급여오름차순 | 4. 급여네림차순 | 5. 이름오름차순 | 6. 이름내림차순 | 0. 종료 ");
			int sel = sc.nextInt();
			if (sel == 1) {
				em.insert(list);
			} else if (sel == 2 ) {
				em.empAllPrint(list);
			} else if (sel == 3) {
				em.empSalaryAsc(list);
			} else if (sel == 4) {
				em.empSalaryDesc(list);
			} else if (sel == 5) {
				em.empNameAsc(list);
			} else if (sel == 6) {
				em.empNameDesc(list);
			} else {
				System.out.println("프로젝트 종료");
				menu = false;
			}
		}
		
		
		em.insert(list);
		
		em.empAllPrint(list);
		
		em.empSalaryAsc(list);
		
		em.empSalaryDesc(list);
		
		em.empNameAsc(list);
		
		em.empNameDesc(list);
		

		// 람다식
		// 메서드를 간단하게 표현하는 익명함수(이름 없는 함수)이다.

		
		
	}

}
