package studyJava;

public class practice {

	public static void main(String[] args) {
		
//		int i = 0;
//		int sum = 0;
//		int dec = 10;
//		while(i < dec) {
//			i++;
//			if (i % 2 == 0) continue;
//			sum += i;
//			System.out.print(i + ((i >= (dec - 1)) ? "=" : "+"));
//		}
//		System.out.print(sum);
		
		int dep = 5;
		for (int i = 0; i < dep; i++) {
			for (int j = dep - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < dep - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = dep * 2 - 1; k > i * 2 + 2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
