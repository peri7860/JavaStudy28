package studyJava.basic;

import java.text.DecimalFormat;

public class Java05_Ex {

	public static void main(String[] args) {
		
		// 성적표
		// 번호  이름  국어  영어  수학  총점  평균  학점
		// 1111 홍길동 90    90     90      270  90.00  A
		// 90이상 A, 80이상 B, 그렇지 않으면 F
		// 80이상은 합격, 그렇지 않으면 불합격
		
		//필요한 변수 선언
		int bno = 1111;
		String name = "홍길동";
		int kor = 90; int eng = 90; int mat = 90;
		int tot = kor + eng + mat;
		double ave = (double)tot / 3;
		char grade;
		
		DecimalFormat df = new DecimalFormat("###.00");
		
		if (ave >= 90) {
			grade = 'A';
		} else if (ave >= 80) {
			grade = 'B';
		} else {
			grade = 'F';
		}
		
		String result;
		if (ave >= 80) {
			result = "합격";
		} else {
			result = "불합격";
		}
		
		System.out.println("\t\t성적표");
		System.out.println("번호\t이름 국어\t영어\t수학\t총점\t평균\t학점\t합격여부");
		//System.out.printf("%d\t%s %d\t%d\t%d\t%d\t%3.2f\t  %c\t%s", bno, name, kor, eng, mat, tot, ave, grade, result);
		System.out.println(bno+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+df.format(ave)+"\t"+grade+"\t"+result);
	}

}
