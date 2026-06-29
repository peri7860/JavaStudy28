package studyJava.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapArrayMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Java32_MapArray maparr = new Java32_MapArray();
		
		boolean off = true;
		int menu = 0;
		
		while(off) {
			System.out.println("1. 입력 | 2. 전체 출력 | 3. 전체 출력(람다) | 4. 전체 출력 + 등수계산 | 0. 종료");
			menu = sc.nextInt();
			
			if(menu == 1) {
				maparr.insert(list);
			} else if (menu == 2) {
				maparr.printData(list);
			} else if (menu == 3) {
				maparr.printLambda(list);
			} else if (menu == 4) {
				maparr.printLambdaRank(list);
			} else {
				off = false;
			}
			
		}
	}

}
