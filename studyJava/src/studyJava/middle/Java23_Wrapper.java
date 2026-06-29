package studyJava.middle;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Java23_Wrapper {

	public static void main(String[] args) {
		// Wrapper 활용
		
		// Wrapper 객체로 부터 기본 타입 값 알아내기
		int i  = Integer.valueOf(10); // 오토박싱
		char c = Character.valueOf('c');
		double d = Double.valueOf(3.14);
		boolean b = Boolean.valueOf(false);
		
		// 문자열을 기본 데이터 타입으로 변환
		int ii = Integer.parseInt("123");
		boolean bb = Boolean.parseBoolean("true");
		double ff = Double.parseDouble("3.14");
		
		// 기본 타입을 문자열로 변환
		String s1 = Integer.toString(123); // 123 -> "123"
		String s2 = Integer.toHexString(123); // 123 -> "7b"
		String s3 = Double.toString(3.14); // 3.14 -> "3.14"
		String s4 = Boolean.toString(true); // true -> "true"
		
		// 박싱 언박싱
		// boxing : 기본 타입의 값을 Wrapper 객체로 변환
		// unboxing : Wrapper 객체에 들어 있는 기본 타입의 값으로 바꾼다
		
		Integer ten = 10; // 자동 박싱
		int n = ten; // 자동 언박싱
		
		// String
		String ss1 = "Hello";
		String ss2 = "Java";
		String ss3 = "Hello";
		String ss4 = new String("Hello");
		String ss5 = new String("Java");
		String ss6 = new String("Java");
		
		String ss7 = ss4.concat("Java"); // concat() 문자열 결합. 대신 + 사용가능
		System.out.println(ss7); // Hello Java 출력
		
		// 스트링 비교시 반드시 equals() 사용
		
		String java = "java";
		String cpp = "C++";
		int res = java.compareTo(cpp); // java가 c++ 보다 사전에 나중에 나오기 때문에 양수 리턴
		// compareTo() 비교해서 문자열 같으면 0 리턴
		// 이 문자열이 anotherString 보다 사전에 먼저 나오면 음수 리턴
		// 이 문자열이 anotherString 보다 사전에 나중에 나오면 양수 리턴
		
		if(res == 0) {
			System.out.println("the same");
		} else if (res < 0) {
			System.out.println(java + "<" + cpp);
		} else {
			System.out.println(java + ">" + cpp);
		}
		
		// 공백 제거 -> trim()
		String a1 = "   abc   def   ";
		String a2  = "   xyz\t";
		String a3 = a1.trim(); // 양쪽 공백 제거. 가운데 공백은 제거를 못한다
		String a4 = a2.trim();
		
		// 문자열 내의 문자 접근
		String a5 = "class";
		char a6 = a5.charAt(2); // a6 = 'a'; 왜? 문자열 색인(index)번호는 0부터 시작하기 때문
		System.out.println(a6);
		String a7 = "java, C#";
		
		// 문자열 바꾸기
		String a8 = a7.replace("java", "Python"); // 문자열 바꿀떄
		System.out.println(a8);
		
		// 문자열 분리
		String s[] = a7.split(","); // , 기호를 기준으로 문자열이 분리되어 자동으로 배열에 저장
		for(String ss : s) {
			System.out.println(ss);
		}
//		System.out.println(Arrays.toString(s));
		// 시작 위치, 끝 위치까지 문자열 가져오기
		String a9 = "abcdefg";
		String a10 = a9.substring(2, 5); // 2번째 위치부터 5번 앞 까지
		String a11 = a9.substring(5); // 5번부터 끝까지
		System.out.println(a10);
		
		String str = "안녕하세요";
		byte[] bytes1 = null;
		try {
			bytes1 = str.getBytes("UTF-8"); // encoding 방식에 따라 바이트 수가 다르게 생성된다
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// getBytes() 메서드는 시스템의 기본 문자셋으로 인코딩된 바이트 배열 리턴
		System.out.println("bytes1.length : " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String : " + str1);
		
		// 문자열 찾기 - indexOf()
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍"); // 주어진 문자열이 포함 되어 있지 않으면 -1 리턴
		System.out.println(index);
		if(index != -1) {
			// 포함되어 있는 경우
			System.out.println("프로그래밍 관련 책이군요");
		} else {
			// 포함되어 있지 않은 경우
			System.out.println("프로그래밍 관련 없는 책이군요");
		}
		
		// 대문자, 소문자 바꾸기
		String ori = "Java Programm";
		String lower = ori.toLowerCase(); // 소문자로 다 바꾸기
		String upper = ori.toUpperCase(); // 대문자로 다 바꾸기
		System.out.println(ori);
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(ori.equals(lower)); // false. 소문자 a와 대문자 A는 다른 값이다
		
		// StringBuffer 클래스
		// 가변 크기의 문자열 저장하는 클래스
		
		StringBuffer sb = new StringBuffer("a"); // sb -> a
		sb.append(" pencil"); // sb -> a pencil
		System.out.println(sb.toString());
		
		sb.insert(2, "nice "); // sb -> a nice pencil
		System.out.println(sb.toString());
		
		sb.replace(2, 6, "bad"); // sb -> a bad pencil
		System.out.println(sb.toString());
		
		sb.delete(0, 2); // bad pencil
		System.out.println(sb.toString());
		
		sb.reverse(); // sb -> licnep dab
		System.out.println(sb.toString());
		
		int sl = sb.length(); // 10
		char ccc = sb.charAt(3); // n 인덱스 번호 0 부터 시작해서 3번째 글자 한개를 가져와라
		System.out.println(sl + "," + ccc);
		
		sb.setLength(3); // 버퍼의 길이를 3개로 수정. lic
		System.out.println(sb.length());
		
	}

}







