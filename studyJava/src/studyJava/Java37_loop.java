package studyJava;

import java.util.Scanner;

public class Java37_loop {

	public static void main(String[] args) {
		// 10개의 정수값을 입력받아
		// 홀수의 합 : 
		// 홀수의 개수 : 
		// 짝수의 합 :
		// 짝수의 개수 : 
		// 최대값 :
		// 최소값 : 
		// 최대값 - 최소값 : 
		
		int inputN = 0;
		int oddSum = 0;
		int evenSum = 0;
		int oddCount = 0;
		int evenCount = 0;
		int maxCount = 10;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxMinSub = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < maxCount; i++) {
			System.out.print("정수 입력 : ");
			inputN = sc.nextInt();
			
			if (inputN % 2 == 1) {
				oddSum += inputN;
				oddCount++;
			} else {
				evenSum += inputN;
				evenCount++;
			}
			
			if (inputN > max) max = inputN;
			if (inputN < min) min = inputN;
		}
		
		maxMinSub = max - min;
		
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("홀수의 개수 : " + oddCount);
		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("짝수의 개수 : " + evenCount);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("최대값 - 최소값 : " + maxMinSub);
		
		
		

	}

}
