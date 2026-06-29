package studyJava.middle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Java32_MapArray {

	Scanner sc = new Scanner(System.in);
	
	public void insert(List<Map<String, Object>> list) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.print("학번 입력 : ");
		int idx = sc.nextInt();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		map.put("idx", idx);
		map.put("name", name);
		map.put("score", score);
		map.put("rank", 1);
		
		list.add(map);
	}
	
	public void printData(List<Map<String, Object>> list) {
	
		System.out.println("====list 안에 Map 데이터 출력====");
		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> m = list.get(i);
			// list.get(i); map 객체를 불러온다
			System.out.println("idx : " + m.get("idx"));
			System.out.println("name : " + m.get("name"));
			System.out.println("score : " + m.get("score"));
			System.out.println("rank : " + m.get("rank"));
			System.out.println();

//			System.out.println(m);
			
//			System.out.println("====list 안에 Map 데이터 출력====");
//			for (Map<String, Object> m : list) {
//				// list.get(i); map 객체를 불러온다
//				System.out.println("idx : " + m.get("idx"));
//				System.out.println("name : " + m.get("name"));
//				System.out.println("score : " + m.get("score"));
//				System.out.println("rank : " + m.get("rank"));
//				System.out.println();
//
//			}
		}
	}
	
	public void printLambda (List<Map<String, Object>> list) {
	
		System.out.println("====list 안에 Map 데이터 출력 :: 람다식====");
		list.forEach(m -> {
			System.out.print(m.get("idx") + " ");
			System.out.print(m.get("name") + " ");
			System.out.print(m.get("score") + " ");
			System.out.print(m.get("rank"));
			System.out.println();
			} 
		);
	}
	
	public void printLambdaRank (List<Map<String, Object>> list) {
		System.out.println("====list 안에 Map 데이터 출력 등수까지 출력====");
		list.forEach(m -> {	
			int rank = 1;
			list.forEach(mm -> {
				int s1 = (int)m.get("score");
				int s2 = (int)mm.get("score");
				if(s1 < s2) {
					// 컬렉션 프레임 워크는 모든 데이터를 객체 형태로 저장
					// 숫자 객체 Integer -> int 다운 캐스팅해야 관계연산을 할 수 있기 때문에 (int)변환
					m.put("rank", (int)m.get("rank") + 1);
				}
			});
			System.out.print(m.get("idx") + " ");
			System.out.print(m.get("name") + " ");
			System.out.print(m.get("score") + " ");
			System.out.print(m.get("rank"));
			System.out.println();
			} 
		);
		
//		System.out.println("====list 안에 Map 데이터 출력 :: 람다식====");
//		list.forEach(m -> {	
//			int rank = 1;
//			list.forEach(mm -> {
//				int s1 = (int)m.get("score");
//				int s2 = (int)mm.get("score");
//				if(s1 < s2) {
//					m.put("rank", (int)m.get("rank") + 1);
//				}
//			});
//			System.out.print(m.get("idx") + " ");
//			System.out.print(m.get("name") + " ");
//			System.out.print(m.get("score") + " ");
//			System.out.print(m.get("rank"));
//			System.out.println();
//			} 
//		);
	}
		

	

}
