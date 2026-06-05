package studyJava.middle;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("10진수 입력 : ");
		int dec = sc.nextInt();
		
		ProcessExam_03 pe3 = new ProcessExam_03();
		
		pe3.ProcessBinary(dec);
		
		System.out.println("2진수 : " + pe3.head);

	}

}
