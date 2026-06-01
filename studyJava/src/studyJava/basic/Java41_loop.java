package studyJava.basic;

public class Java41_loop {

	public static void main(String[] args) {
		// *****
		// *****
		// *****
		
		// 행수는 바깥 for문 열수는 안쪽 for문으로 처리한다
		// x = 1 일 때 y=12345
		// x = 2 일 때 y=12345
		// x = 3 일 때 y=12345
		
		for(int x = 1; x <= 3; x++) // x = 1,2,3
		{  // 바깥 for문 조건식이 거짓이면 빠져나간다
			for(int y = 1; y <= 5; y++)
			{// 안쪽 for문 조건식이 거짓이면 안쪽for문을 빠져나간다
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
