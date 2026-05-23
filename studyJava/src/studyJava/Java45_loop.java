package studyJava;

public class Java45_loop {

	public static void main(String[] args) {
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
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

	}

}
