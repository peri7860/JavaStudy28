package studyJava.basic;

public class Java55_array2 {

	public static void main(String[] args) {
		// 번호 국어 영어 수학 총점 평균 구하기
		int[][] score = { { 100, 100, 100 }, { 90, 90, 90 }, { 80, 80, 80 } };

		// 변수
		int bno = 0;
		int tkor = 0;
		int teng = 0;
		int tmat = 0;

		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < score.length; i++) {
			bno++;
			int sum = 0;
			double ave = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			tkor += score[i][0]; // 국어 총점
			teng += score[i][1]; // 영어 총점
			tmat += score[i][2]; // 수학 총점
			
			ave = (double)sum / 3;
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f", 
					bno, score[i][0], score[i][1], score[i][2], sum, ave); // 한사람 출력
			System.out.println();//줄 변경
		}
		// 마지막으로 과목별 총점 출력 후 종료
		System.out.println("과목별 총점 : " + tkor + "," + teng + "," + tmat);

	}

}
