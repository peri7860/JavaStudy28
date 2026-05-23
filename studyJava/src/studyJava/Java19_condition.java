package studyJava;

import java.util.Scanner;

public class Java19_condition {

	public static void main(String[] args) {
		// 점수입력(0-100) : 85
		// 학점 : B;
		// 입력하신 점수는 홀수 입니다
		
		int score;
		String grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력(0-100) : ");
		score = sc.nextInt();
		String od = (score % 2 == 0) ? "입력하신 점수는 짝수 입니다" : "입력하신 점수는 홀수 입니다";
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("학점 : " + grade);
		System.out.println(od );

	}

}
