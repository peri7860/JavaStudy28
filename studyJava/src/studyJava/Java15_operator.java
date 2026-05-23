package studyJava;

import java.util.Scanner;

public class Java15_operator {
	
	public static void main(String[] args) {
		// 입력받은 값이 80-90사이 이거나 7의 배수이면 true 아니면 false 출력
		int num;
		Scanner sc = new Scanner(System.in); //import 단축키 ctrl + shift + o
		System.out.print("값 입력 : ");
		num = sc.nextInt();
		//boolean result = (num >= 80 && num <= 90) || num % 7 == 0;
		boolean b1 = num >= 80 && num <= 90;
		boolean b2 = num % 7 == 0;
		boolean result = b1 || b2;
		
		System.out.println(result);
	}
}
