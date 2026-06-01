package studyJava.basic;

import java.util.Scanner;

public class Java49_array {

	public static void main(String[] args) {
		// 번호 이름 국어 영어 수학 점수를 키보드로 3개의 데이터를 입력받는다
		
		Scanner sc = new Scanner(System.in);
		
		// 필요한 변수 선언을 배열로 한 것 뿐이다
		// int[] bno = new int[3]; 번호저장 배열 3개
		int[] bno = new int[] {1, 2, 3}; // 초기화한 데이터 만큼 배열의 개수가 생성된다
 		// String[] name = new String[3];
		String[] name = new String[] {"aaa", "bbb", "ccc"};
		int[] kor = new int[] {100, 90, 80};
		int[] eng = new int[] {100, 90, 80}; 
		int[] mat = new int[] {100, 90, 80};
		int[] tot = new int[3];
		double[] ave = new double[3];
		int[] rank = new int[] {1, 1, 1};
		
		// 데이터 입력받아서 배열에 저장하기
		
//		for (int i = 0; i < bno.length; i++) {
//			System.out.print("번호 입력 : ");
//			bno[i] = sc.nextInt();
//			
//			System.out.print("이름 입력 : ");
//			name[i] = sc.next();
//			
//			System.out.print("국어 점수 입력 : ");
//			kor[i] = sc.nextInt();
//			
//			System.out.print("영어 점수 입력 : ");
//			eng[i] = sc.nextInt();
//			
//			System.out.print("수학 점수 입력 : ");
//			mat[i] = sc.nextInt();
//		}
		
		// 총점 구하기
		for (int i = 0; i < bno.length; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
		}
		
		// 평균 구하기
		for (int i = 0; i < bno.length; i++) {
			ave[i] = tot[i] / bno.length;
		}
		
		// 등수 구하기
		for (int i = 0; i < bno.length; i++) { // i = 0 1 2
			for(int j = 0; j < bno.length; j++) { // j = 0 1 2
				if (ave[i] < ave[j]) {
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < bno.length; i++) {
			System.out.print("번호 : " + bno[i] + "\t이름 : " + name[i] + "\t국어 점수 : " + kor[i]);
			System.out.print("\t영어 점수 : " + eng[i] + "\t수학 점수 : " + mat[i] + "\t총점 : " + tot[i]);
			System.out.println("\t평균 : " + ave[i] + "\t등수 : " + rank[i]);
		}
		
	}

}
