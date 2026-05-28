package studyJava;

import java.util.Scanner;

public class Java56_array2 {

	public static void main(String[] args) {
		// 좌석현황 (O=빈자리, X=예매)
		//   1열 2열 3열 4열 5열
		//A행 O   O   O   O   O
		//B행 O   O   O   O   O
		//C행 O   O   O   O   O
		//D행 O   O   O   O   O
		//E행 O   O   O   O   O
		//행 입력(A-E) : B
		//열 입력(1-5) : 3
		//B3예약 완료!
		
		// 좌석현황 (O=빈자리, X=예매)
		//   1열 2열 3열 4열 5열
		//A행 O   O   O   O   O
		//B행 O   O   X   O   O
		
		Scanner sc = new Scanner(System.in);
		boolean[][] seats = new boolean[5][5]; // false 빈자리
		String[] rows = {"A", "B", "C", "D", "E"};
		
		//예매는 3회 실행시킨다

	}

}
