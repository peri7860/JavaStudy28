package studyJava.middle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java25_Regular {

   public static void main(String[] args) {
      // 정규 표현식 = 정규식
      // 정규식이란? 텍스트 데이터중에서 원하는 조건과 일치하는 문자열을 찾아 내기위해 사용하는 것

      // ^ : 시작
      // [a-z0-9] : 첫글자가 영문 소문자
      // {4, 11} : 앞 글자를 제외 4-11개
      // $ : 끝
      
      String[] data = { "bat", "baby", "bonus", "cA", "co", "c", "c0", "car", "combat", "count", "date", "disc" };

      Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자 영단어를 찾는 패턴 생성
      for (int i = 0; i < data.length; i++) {
         Matcher m = p.matcher(data[i]); // 배열에 저장된 문자열을 가져와서 Pattern에 맞는 지 검사
         if (m.matches()) { // Pattern 규칙에 맞으면
            System.out.println(data[i] + ",");

         }

      }

      String regex = "^[a-z][a-z0-9]{4,11}$";
      String regex1 = "^.{2}[a-z0-9].*$"; // .* : 모든 것
      String id = "java1234";
      if (id.matches(regex)) {
         System.out.println("사용 가능한 아이디");
      } else {
         System.out.println("아이디 형식 오류!");
      }

   }

}
