package studyJava.middle;

import java.util.ArrayList;
import java.util.Scanner;

public class JslScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<JslScore> jsl = new ArrayList<JslScore>();
		JslScoreMethod jslscoremethod = new JslScoreMethod();
		
		int idx;
		String name;
		int score;
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("[1]입력 [2]출력 [3]검색 [4]삭제 [0]종료 -> 작업선택 : ");
			int menu = sc.nextInt();
			if(menu == 1) {
				jslscoremethod.insert(jsl);
				
			} else if(menu == 2) {
				jslscoremethod.printScore(jsl);
				
			} else if(menu == 3) {
				jslscoremethod.select(jsl);
				
			} else if(menu == 4) {
				jslscoremethod.delete(jsl);
				
			} else {
				System.out.println("프로젝트 종료");
				flag = false;
			}
		}

	}

}
