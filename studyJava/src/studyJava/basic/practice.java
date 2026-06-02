package studyJava.basic;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

	static Scanner sc = new Scanner(System.in);
	static boolean[][] seats = new boolean[5][5]; // false 빈자리
	static String[] rows = { "A", "B", "C", "D", "E" };

	static String[][] seatPrint = new String[5][5];
	static String rowInput = " ";
	static int colInput = 0;
	static int reserveCnt = 3;

	// 좌석 초기화
	public void init() {
		
		for (int i = 0; i < seatPrint.length; i++) {
			for (int j = 0; j < seatPrint[i].length; j++) {
				seatPrint[i][j] = "O";
			}
		}
	}

	// 좌석 출력
	public void print() {
		
		System.out.println("\t좌석현황 (O=빈자리, X=예매)");
		System.out.println("\t1열\t2열\t3열\t4열\t5열");
		for (int i = 0; i < seatPrint.length; i++) {
			System.out.print(rows[i] + "행\t");
			for (int j = 0; j < seatPrint[i].length; j++) {
				System.out.print(seatPrint[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		practice p = new practice();
		p.init();
		p.print();
		
		
		// 예매 3회
		while (true) {
			if (reserveCnt == 0)
				break; // 예약 횟수가 0이 되면 종료

			int rowInt = 0; // A-E행 정수로 변환해서 저장하는 변수

			System.out.print("행 입력(A-E) : ");
			rowInput = sc.next();
			System.out.print("열 입력(1-5) : ");
			colInput = sc.nextInt();

			rowInt = (int) (rowInput.charAt(0)) - 65; // 각각 65를 빼서 0-4의 정수로 변환

			if (rowInt < 0 || rowInt > 4 || colInput < 1 || colInput > 5) {
				System.out.println("범위를 다시 지정해주세요.");
				System.out.println();
				continue;
			}

			if (seats[rowInt][colInput - 1] == true) {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println();
				continue;
			}

			seats[rowInt][colInput - 1] = true; // 입력 받은 자리 true. 1-5열이므로 colInput - 1

			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[i].length; j++) {
					if (seats[i][j] == true) {
						seatPrint[i][j] = "X";
					}
				}
			}

			System.out.println(rowInput + colInput + "예약 완료!");
			System.out.println();

			// 좌석 출력
			p.print();

			reserveCnt--;
		}

	}

}
