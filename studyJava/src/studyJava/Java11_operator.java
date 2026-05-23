package studyJava;

import java.util.Scanner;

public class Java11_operator {
	
	public static void main(String[] args) {
		//관계연산자
		//나이와 키를 입력 받아
		//나이가 10세이상 그리고 키가 130cm이상이면 놀이기구를 탈 수 있다
		
		//나이, 키 저장 변수 선언
		
		int age;
		int height;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이 : ");
		age = scanner.nextInt();
		System.out.print("키 : ");
		height = scanner.nextInt();
		
		if (age >= 10 && height >= 130) {
			System.out.println("탈 수 있습니다.");
		} else {
			System.out.println("탈 수 없습니다.");
		}
	}
}
