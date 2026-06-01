package studyJava.basic;

public class Java28_loop {

	public static void main(String[] args) {

		// 프로그램 들여쓰기 재 정렬 단축키 : ctrl + shift + F
		// 문제 : 1-10까지 정수의 합계를 구하여 출력하시오
		// 1+2+3+4+5+6+7+8+9+10 = 55

		// 생각 -> 무슨 변수가 필요할까?
		int c = 1;
		int result = 0;
		while (c <= 10) { // 조건식이 참이면 { } 반복실행, 거짓이면 while()탈출
			result += c;
			System.out.print(c);
			if (c < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			c++;
		}
		System.out.println(result);

		// 위 프로그램을 do-while로 바꿔서 개발해보자
		System.out.println();
		int init = 1;
		int summ = 0;
		do {
			summ += init;
			System.out.print(init);
			if (init < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			init++; // 반복실행 증가치
		} while (init <= 10); // 반복실행할 조건식은 최종값 가지고 만든다
		System.out.println(summ);
		System.out.println();
		
		System.out.println("for문으로 합계 계산을 바꿔보자");
		
		int sum = 0; // 전역변수
		for(int i = 1; i <= 10; i++) {
			sum += i; // 반복되는 숫자를 sum에 누적 시킨다
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.println(sum); // 합계는 한번만 출력해야 되니깐 for밖에 코딩

	}

}
