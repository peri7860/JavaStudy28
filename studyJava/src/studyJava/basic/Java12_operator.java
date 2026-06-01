package studyJava.basic;

import java.util.Scanner;

public class Java12_operator {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받아
		// 아이디(abcd), 비밀번호(1234)와 같으면 로그인 성공을 출력하시오
		// 그렇지 않으면 아이디와 비밀번호를 확인하세요 출력
		
		String id = "abcd";
		int pw = 1234;
		
		String cid;
		int cpw;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id : ");
		cid = sc.next();
		
		System.out.print("password : ");
		cpw = sc.nextInt();
		
		if (cid.equals(id) && cpw == pw) { //숫자 비교는 == 으로 비교한다.
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디와 비밀번호를 확인하세요");
		}

	}

}
