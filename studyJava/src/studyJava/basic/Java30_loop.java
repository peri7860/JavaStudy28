package studyJava.basic;

public class Java30_loop {

	public static void main(String[] args) {
		// 1+3+5+7+9=25
		int i = 0;
		int sum = 0;
		int dec = 10;
		while(i < dec) {
			i++;
			if (i % 2 == 0) continue;
			sum += i;
			System.out.print(i + ((i >= (dec - 1)) ? "=" : "+"));
		}
		System.out.print(sum);
		System.out.println();
		
		int j = 1;
		int tot = 0;
		while(j < 10) {
			System.out.print(j);
			if (j < 9) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			tot += j;
			j += 2;
		}
		System.out.print(tot);
		System.out.println();
		
		int k = 1;
		int res = 0;
		do {
			System.out.print(k);
			if (k < 9) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			res += k;
			k += 2;
		} while(k < 10);
		System.out.print(res);
		System.out.println();
		
		int summ = 0;
		for (int m = 1; m <= 10; m+=2 ) {
			System.out.print(m);
			if (m < 9) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			summ += m;
		}
		System.out.print(summ);
		
	}
}
