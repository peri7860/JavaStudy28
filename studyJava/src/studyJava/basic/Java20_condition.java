package studyJava.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java20_condition {

	public static void main(String[] args) {
		// BMI 측정
		// 키입력(m) : 1.75
		// 몸무게 입력(kg) : 70
		// BMI : 22.9
		// 판정 : 정상
		
		// bmi = 몸무게 / (키 * 키)
		// bmi < 18.5 -> 저체중
		// bmi < 23.0 -> 정상
		// bmi < 25.0 -> 과체중
		// 그렇지 않으면 비만
		
		double height;
		double weight;
		double bmi;
		String judge;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.print("키 입력(m) : ");
		height = sc.nextDouble();
		
		System.out.print("몸무게 입력(kg) : ");
		weight = sc.nextInt();
		
		bmi =  weight / (height * height);
		
		if (bmi < 18.5) {
			judge = "저체중";
		} else if (bmi < 23.0) {
			judge = "정상";
		} else if (bmi < 25.0) {
			judge = "과체중";
		} else {
			judge = "비만";
		}
		
		System.out.println("BMI : " + df.format(bmi) + "\n판정 : " + judge);

	}

}
