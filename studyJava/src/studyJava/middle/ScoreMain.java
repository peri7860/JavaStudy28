package studyJava.middle;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean select = true;
		ScorePro sp = new ScorePro();
		// static 없으면 무조건 객체 생성

		while (select) {
			System.out.println("[1]입력기능 [2]출력기능 [3]검색기능 [4]삭제기능 [출력기능] [0]종료");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("입력기능");
				sp.insert();
				break;
			}
			case 2: {
				System.out.println("출력기능");
				sp.scorePrint();
				break;
			}
			case 3: {
				System.out.println("검색기능");
				sp.select();
				break;
			}
			case 4: {
				System.out.println("삭제기능");
				sp.delete();
				break;
			}
			case 5: {
				System.out.println("수정기능");
				sp.update();
				break;
			}
			case 0: {
				System.out.println("종료");
				select = false;
			}
			default:
				break;
			}
		}

	}

}
