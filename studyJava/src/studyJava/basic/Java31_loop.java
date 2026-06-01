package studyJava.basic;

public class Java31_loop {

	public static void main(String[] args) {
		// 1-10까지 정수중에서 홀수는 +, 짝수는 - 하여 출력하시오
		// +1-2+3-4+5-6+7-8+9-10 = -5
		// 힌트 : 정수를 2로 나눈 나머지가 1과 같으면 더하고 0과 같으면 뺀다
		
		// for문 이용
		
		int tot = 0;
		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print("+" + i);
				tot += i;
			} else {
				System.out.print("-" + i);
				tot -= i;
			}
		}
		System.out.println("=" + tot);

	}

}
