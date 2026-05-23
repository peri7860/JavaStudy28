package studyJava;

public class Java13_string {

	public static void main(String[] args) {
		// String : 문자열을 다루는 참조(주소) 자료형
		
		String str1 = "java"; 
		// 만약 101번지에 java문자열이 저장되어 있으면 str1은 101번지를 참조한다
		String str2 = "java";
		// "java"문자열이 101번지에 저장되어 있으니까 str2도 101번지를 참조한다
		System.out.println(str1 == str2);  // 주소가 같으니까 true출력
		// 그러므로 str1과 str2번지가 같냐 라고 물어보는 것이다.
		// 그래서 주소가 같으면 true가 출력된다
		// 저장된 "java"문자열이 같냐고 물어보는 것이 아니다.     주의요망
		
		// String 데이터 타입은 원래 객체를 생성해야 사용할 수 있다
		String str3 = new String("java");
		System.out.println(str1 == str3);  //false
		// 새로운 객체 생성이 됐기 때문에 주소가 다르다.
		
		// 문자열이 같은지, 다른지를 비교할 때는 어쩔??
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		//불변성
		str1 = str1 + "Programming";
		//기존 "java"가 바뀌는게 아니라 "javaProgramming"이라는 새로운 객체가 생성된다
		System.out.println(str1);
		
		//메서드 몇개 알아보자
		System.out.println(str1.equals(str3)); //false
		System.out.println("str1 : " + str1);
		System.out.println("문자열 길이 : " + str1.length()); //문자열의 길이
		System.out.println("문자발췌 : " + str1.substring(0, 4)); //0번째 부터 4번째 앞까지
		System.out.println("문자가 위치한 인덱스 번호 : " + str1.indexOf("P"));
		System.out.println("javaProgramming에서 v 글자 1개 발췌 : " + str1.charAt(2));
		

	}
}

























