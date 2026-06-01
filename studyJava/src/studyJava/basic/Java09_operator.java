package studyJava.basic;

import java.util.Scanner;

public class Java09_operator {

	public static void main(String[] args) {
		//항공권 가격(원) : 300000
		//숙박비(원) : 150000
		//식비(원) : 80000
		//여행인원수 : 3
		//출력화면
		//1인여행경비 : 530000 원
		//전체 여행경비 : 1590000 원
		
		int flight;
		int hotel;
		int food;
		int people;
		
		int totalPerson;
		int total;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("항공권 가격(원) : ");
		flight = scanner.nextInt();
		
		System.out.print("숙박비(원) : ");
		hotel = scanner.nextInt();
		
		System.out.print("식비(원) : ");
		food = scanner.nextInt();
		
		System.out.print("여행 인원수 : ");
		people = scanner.nextInt();
		
		totalPerson = flight + hotel + food;
		total = totalPerson * people;
		
		System.out.println("1인 여행경비 : " + totalPerson);
		System.out.println("전체 여행경비 : " + total);
		
		scanner.close(); //객체 반환
		
 
	}

}
