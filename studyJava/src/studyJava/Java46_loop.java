package studyJava;

public class Java46_loop {

	public static void main(String[] args) {
		//*********
		// *******
		//  *****
		//   ***
		//    *
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 5 * 2 - 1; k > i * 2; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (6-i) * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
