package studyJava.middle;

import java.util.ArrayList;
import java.util.Scanner;

public class JslScoreMethod {
	
	int idx;
	String name;
	int score;
	
	Scanner sc = new Scanner(System.in);
	
	// 입력 작업
	public void insert(ArrayList<JslScore> jsl) {
		// 학번, 이름, 점수 입력
		// ArrayList<JslScore> 가변 배열에 저장
		JslScore jslscore = new JslScore();
		
		System.out.print("학번 입력 : ");
		idx = sc.nextInt();
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		jslscore.setIdx(idx);
		jslscore.setName(name);
		jslscore.setScore(score);
		
		jsl.add(jslscore);
	}
	
	// 출력 작업
	public void printScore(ArrayList<JslScore> jsl) {
		// ArrayList<JslScore> 가변배열에
		// 저장된 모든 객체를 반복하면서 출력
		for (JslScore jslscore : jsl) {
			System.out.println("학번 : " + jslscore.getIdx() +
					", " + "이름 : " + jslscore.getName() + 
					", " + "점수 : " + jslscore.getScore());
		}
		
	}
	
	// 검색 작업
	public void select(ArrayList<JslScore> jsl) {
		// 학번 입력
		// ArrayList<JslScore> 가변배열에 저장된 값이랑
		// 입력받은 학번과 비교해서
		// 같으면 학번, 이름, 점수를 출력하고
		// 같은 값이 없으면 해당 학번 학생이 없어요 출력
		System.out.print("학번 입력 : ");
		idx = sc.nextInt();
		
		for (JslScore jslscore : jsl) {
			if (jslscore.getIdx() == idx) {
				System.out.println("학번 : " + jslscore.getIdx() +
						", " + "이름 : " + jslscore.getName() + 
						", " + "점수 : " + jslscore.getScore());
				return;
			}
		}
		
		System.out.println("해당 학번 학생이 없어요");
		
	}
	
	// 삭제 작업
	public void delete(ArrayList<JslScore> jsl) {
		// 삭제 학번 입력
		// ArrayList<JslScore> 가변배열에 저장 값이랑
		// 입력받은 학번과 비교해서
		// 같으면 배열에 저장된 객체를 삭제
		// 그렇지 않으면 해당 학번 학생이 없어요 출력
		
		System.out.print("삭제 학번 입력 : ");
		idx = sc.nextInt();
		
		for (JslScore jslscore : jsl) {
			if (jslscore.getIdx() == idx) {
				jsl.remove(jslscore);
				return;
			}
		}
		
		System.out.println("해당 학번 학생이 없어요");
	}
}
