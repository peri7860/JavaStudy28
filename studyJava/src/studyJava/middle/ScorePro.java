package studyJava.middle;

import java.util.Scanner;

public class ScorePro {

	// 배열 또는 필요한 변수 선언
	// int[][] arr = new int[3][5];
	int[][] arr = new int[][] { { 1, 100, 100, 100, 0 }, { 2, 90, 90, 90, 0 }, { 3, 80, 80, 80, 0 } };

	Scanner sc = new Scanner(System.in);

	// 입력처리 메서드 ()
	public void insert() {
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("번호 : ");
//			int bno = sc.nextInt();
//			arr[i][0] = bno;
//
//			System.out.print("국어 : ");
//			int kor = sc.nextInt();
//			arr[i][1] = kor;
//
//			System.out.print("영어 : ");
//			int eng = sc.nextInt();
//			arr[i][2] = eng;
//
//			System.out.print("수학 : ");
//			int mat = sc.nextInt();
//			arr[i][3] = mat;
//
//			arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];
//
//		}
		totCalculator();
	}
	
	public void totCalculator() {
		for (int i = 0; i < arr.length; i++) {
			arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];
		}
	}

	// 출력 기능
	public void scorePrint() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 검색 기능
	public void select() {
		System.out.print("검색 학번 입력 : ");
		int bno = sc.nextInt();
		boolean result = true;
		for (int i = 0; i < arr.length; i++) {
			if (bno == arr[i][0]) {
				System.out.print(arr[i][0] + " ");
				System.out.print(arr[i][1] + " ");
				System.out.print(arr[i][2] + " ");
				System.out.print(arr[i][3] + " ");
				System.out.print(arr[i][4] + " ");
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println("학번에 존재하지 않아요");
		}
	}

	// 삭제기능 => 0으로 초기화
	public void delete() {
		System.out.print("삭제 학번 입력 : ");
		int bno = sc.nextInt();
		boolean result = true;
		for (int i = 0; i < arr.length; i++) {
			if (bno == arr[i][0]) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = 0;
				}
				result = false;
				System.out.println("삭제 완료!");
				break;
			}
		}
		if (result) {
			System.out.println("학번에 존재하지 않아요");
		}
	}

	// 수정 기능
	public void update() {
		System.out.print("수정 학번 입력 : ");
		int bno = sc.nextInt();
		boolean result = true;
		for (int i = 0; i < arr.length; i++) {
			if (bno == arr[i][0]) {
				System.out.println("국어 : ");
				arr[i][1] = sc.nextInt();
				System.out.println("영어 : ");
				arr[i][2] = sc.nextInt();
				System.out.println("수학 : ");
				arr[i][3] = sc.nextInt();
				arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];
				
				result = false;
				System.out.println("수정 완료!");
				break;
			}
		}
		if (result) {
			System.out.println("학번에 존재하지 않아요");
		}
	}

}
