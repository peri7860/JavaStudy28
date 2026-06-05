package studyJava.middle;

import java.util.Iterator;

public class ProcessExam_02 {

	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	int sum = 0;
	
	public void maxMin(int score[]) {
		
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) max = score[i];
			if (min > score[i]) min = score[i];
		}
	}
	
	public void arraySum(int score[]) {
		
		for(int a : score) sum += a;
	}
	
	public void arrayPrint(int score[]) {
		
		System.out.print("Data : ");
		for(int a : score) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
