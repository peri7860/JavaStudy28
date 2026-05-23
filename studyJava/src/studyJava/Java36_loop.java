package studyJava;

import java.util.Scanner;

public class Java36_loop {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받아
		// 로그인 시도 횟수가 3번 틀리면 "로그인 실패! 계정이 잠금처리 되었습니다" 출력하시오
		
		String id = "홍길동";
		String pw = "1234";
		String idInput;
		String pwInput;
		int cnt = 0;
		int maxCnt = 3;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("아이디 입력 : ");
			idInput = sc.next();
			System.out.print("패스워드 입력 : ");
			pwInput = sc.next();
			
			cnt++;
			
			if (idInput.equals(id) && pwInput.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패! 남은 횟수 : " + cnt + "/" + maxCnt);
			}
			
			if(cnt == maxCnt)
			{
				System.out.println("로그인 실패! 계정이 잠금처리 되었습니다");
				break;
			}
		}
		
		

	}

}
