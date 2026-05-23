package studyJava;

public class Java44_loop {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		// 출력하기전에 " " 공백을 먼저 처리하는 것이 관건이다
		// 행수는 x = 1, 2, 3, 4, 5 실행 => 행수는 바깥 for문 공식으로 사용한다
		// 공백은 y = 4, 3, 2, 1
		// *출력은 z = 1, 2, 3, 4, 5 -> 열수는 안쪽 for문 공식으로 사용한다
		
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
