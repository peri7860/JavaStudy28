package studyJava.basic;

import java.util.Scanner;

public class Java21_condition {

	public static void main(String[] args) {
		// 정수 2개를 입력 받아서 큰값, 작은 값을 출력하시오
		// 입력 : 90 70
		// Max : 90, Min : 70
		
		int dec1; int dec2;
		int max = 0; int min = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		dec1 = sc.nextInt();
		dec2 = sc.nextInt();
		
		if (dec1 > dec2) {
			max = dec1;
			min = dec2;
		} else {
			max = dec2;
			min = dec1;
		}
		
		System.out.println("Max : " + max + "\tMin : " + min);
		
		
		// 정수 3개를 입력 받아 아래와 같이 출력하시오
		// 정수 입력 : 7 9 5
		// Max : 9, Mid : 7, Min : 5
		
		int dec11; int dec22; int dec33;
		int max11 = 0; int mid11 = 0; int min11 = 0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("입력 : ");
		dec11 = sc1.nextInt();
		dec22 = sc1.nextInt();
		dec33 = sc1.nextInt();
		
		//최대값
		if (dec11 > dec22) {
			max11 = (dec11 > dec33) ? dec11 : dec33; 
		} else {
			max11 = (dec22 > dec33) ? dec22 : dec33;
		}
		
		//최소값
		if (dec11 < dec22) {
			min11 = (dec11 < dec33) ? dec11 : dec33;
		} else {
			min11 = (dec22 < dec33) ? dec22 : dec33;
		}
		
		// 중간값
		mid11 = (dec11 + dec22 + dec33) - (max + min);
		
		
//		if (dec11 > dec22 && dec11 > dec33 && dec22 > dec33) {
//			max11 = dec11;
//			mid11 = dec22;
//			min11 = dec33;
//		}
//		if (dec11 > dec22 && dec11 > dec33 && dec22 < dec33) {
//			max11 = dec11;
//			mid11 = dec33;
//			min11 = dec22;
//		}
//		
//		if (dec22 > dec11 && dec22 > dec33 && dec11 > dec33) {
//			max11 = dec22;
//			mid11 = dec11;
//			min11 = dec33;
//		}
//		if (dec22 > dec11 && dec22 > dec33 && dec11 < dec33) {
//			max11 = dec22;
//			mid11 = dec11;
//			min11 = dec33;
//		}
//		
//		if (dec33 > dec11 && dec33 > dec22 && dec11 > dec22) {
//			max11 = dec33;
//			mid11 = dec11;
//			min11 = dec22;
//		}
//		if (dec33 > dec11 && dec33 > dec22 && dec11 < dec22) {
//			max11 = dec33;
//			mid11 = dec22;
//			min11 = dec11;
//		}
		
		System.out.println("Max : " + max11 + "\tMid : " + mid11 + "\tMin : " + min11);
		
//		int dec11; int dec22; int dec33;
//		int [] temp = new int[3];
//		int max11 = Integer.MIN_VALUE; int mid11 = 0; int min11 = Integer.MAX_VALUE;
//		int len = temp.length;
//		
//		Scanner sc1 = new Scanner(System.in);
//		System.out.print("입력 : ");
//		dec11 = sc1.nextInt();
//		dec22 = sc1.nextInt();
//		dec33 = sc1.nextInt();
//		temp[0] = dec11;
//		temp[1] = dec22;
//		temp[2] = dec33;
//		
//		for(int i = 0; i < len; i++) {
//			if(max11 < temp[i])
//			{
//				max11 = temp[i];
//			}
//			if(min11 > temp[i])
//			{
//				min11 = temp[i];
//			}
//		}	
//		
//		 mid11 = (dec11 + dec22 + dec33) - (max11 + min11); 
//		
//		System.out.println("Max : " + max11 + "\tMid : " + mid11 + "\tMin : " + min11);


	}

}
