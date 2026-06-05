package studyJava.middle;

import java.util.Scanner;

public class ProcessExam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("급여(금액) 입력 : ");
		int pay = sc.nextInt();
		
		Exam_01 ex = new Exam_01();
		
		ex.processMoney(pay);

	}

}
