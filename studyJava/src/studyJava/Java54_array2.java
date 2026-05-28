package studyJava;

import java.util.Arrays;

public class Java54_array2 {

	public static void main(String[] args) {
		// 배열의 종류 : 1차원[], 2차원[][], 3차원[][][] ....
		
		// 2차원 배열의 선언과 할당
		int intArr[][];  // 정수값 저장할 수 있는 2차원
		char charArray[][];  // 문자 저장할 수 있는 2차원
		
		intArr = new int[2][3];
		charArray = new char[3][4];
		
		// 선언과 할당을 동시에 하고 싶으면
		int[][] arr = new int[2][3]; // 6개
		double[][] douArr = new double[3][3]; // 9개 
		
		// 2행 3열의 기억장소에 1부터 6까지 저장하는 프로그램을 만들어보자
		// for문 기본공식 : 바깥 for문 행수로, 안쪽 for문은 열수로 만든다
		int n = 0;
		for (int i = 0; i < 2; i++) {  // i = 0, 1
			for (int j = 0; j < 3; j++) {  // j = 0, 1, 2
				n++;
				intArr[i][j] = n;
			}
		}
		
		for (int i = 0; i < 2; i++) {  // i = 0, 1
			for (int j = 0; j < 3; j++) {  // j = 0, 1, 2
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}

		// 객체 생성 없이 초기화
		
		int score[][] = {
				{60, 70, 40}, 
				{55, 66, 88}
				};
		
		// 2차원 배열의 길이를 이용하여 조건문을 만드는 방법
		for (int i = 0; i < score.length; i++) {  // 행수
			for (int j = 0; j < score[i].length; j++) {
				// 행이 가르키는 열의 수 만큼 길이를 정해야 한다
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}













