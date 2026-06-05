package studyJava.middle;

public class Exam_02 {

	public static void main(String[] args) {
		
		int[] score = {30, 67, 55, 79, 97, 65, 
				33, 78, 96, 58, 94, 32
		};
		
		ProcessExam_02 pe = new ProcessExam_02();
		
		pe.maxMin(score);
		pe.arraySum(score);
		pe.arrayPrint(score);
		
		System.out.println("최대 : " + pe.max);
		System.out.println("최소 : " + pe.min);
		System.out.println("합계 : " + (pe.sum - pe.max - pe.min));
		

	}

}
