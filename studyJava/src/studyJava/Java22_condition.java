package studyJava;

import java.util.Scanner;

public class Java22_condition {

	public static void main(String[] args) {
		// 키보드로부터 이름, 국어, 영어, 수학 점수 입력받아서
		// 이름, 총점, 평균, 판정을 출력하시오
		// [입력예시]
		// 입력자료 : 홍길동 39 90 80
		// [출력예시]
		// 이름 : 홍길동
		// 평균 : 69.67
		// 판정 : 불합격
		// 불합격 사유 : 과락
		
		// [입력예시]
		// 입력자료 : 김학생 50 65 55
		// [출력예시]
		// 이름 : 김학생
		// 평균 56.67
		// 판정 : 불합격
		// 불합격 사유 : 평균미만
		
		// 처리조건
		// 평균은 소수이하 셋째자리에서 반올림하여 둘째자리까지 출력 (printf사용)
		// 조건 : 3과목 점수가 40이상 평균 60이상 합격
		// 평균 60미만 -> 불합격, 이유 : 평균미만
		// 1과목 이라도 40미만이 있는 경우 -> 불합격, 이유 : 과락
		// 판정이 불합격인 경우 사유를 출력한다
		
		String name; //이름
		int kor, eng, mat; //국어, 영어, 수학
		int tot; //총점
		double ave; //평균
		String judgement; //판정
		String reason = " "; //사유
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력자료 : ");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		ave = (double)tot / 3;
		
		if(kor >= 40 && eng >= 40 && mat >= 40) {
			judgement = (ave >= 60) ? "합격" : "불합격";
			if(judgement.equals("불합격")) reason = "평균미만";
		} else {
			judgement = "불합격";
			reason = "과락";
		}
		
		System.out.println("이름 : " + name);
		System.out.printf("평균 : %3.2f\n", ave);
		System.out.println("판정 : " + judgement);
		if(judgement.equals("합격")) return;
		System.out.println("불합격 사유 : " + reason);

	}

}











