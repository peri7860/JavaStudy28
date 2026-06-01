package studyJava.basic;

import java.util.Scanner;
import java.lang.Math;

public class Java25_math {

	public static void main(String[] args) {
		// 가위 바위 보
		// 가위는 1, 바위는 2, 보는 3
		// me - com
		
		int me = 0;
		int com = 0;
		String judge = " ";
		
		System.out.print("입력 (가위 - 1, 바위 - 2, 보 - 3) : ");
		Scanner sc = new Scanner(System.in);
		me = sc.nextInt();
		com = (int)(Math.random() * 3) + 1;
		int win = me - com;
		
		//방법 1
//		if (win == -1 || win == 2) {
//			judge = "짐";
//		} else if (win == - 2 || win == 1) {
//			judge = "이김";
//		} else if (win == 0) {
//			judge = "비김";
//		}
		
		//방법 2
//		switch (me) {
//		case 1: {
//			judge = (com == 2) ? "짐" : "이김";
//			break;
//		}
//		case 2: {
//			judge = (com == 3) ? "이김" : "짐";
//			break;
//		}
//		case 3: {
//			judge = (com == 1) ? "이김" : "짐";
//			break;
//		}
//		default:
//			break;
//		}
//		
//		if (me == com) judge = "비김";
		System.out.println("com : " + com);
		System.out.println("결과 : " + judge);

	}

}
