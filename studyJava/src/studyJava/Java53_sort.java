package studyJava;

import java.util.Arrays;

public class Java53_sort {

	public static void main(String[] args) {
		// 삽입정렬
		// 2번째 부터 비교를 하는데
		// 1번 비교 : 1번째 0번째 비교
		// 2번 비교 : 2번째 1번째 비교, 1번째 0번째 비교
		// 3번 비교 : 3번째 2번째 비교, 2번째 1번째 비교, 1번째 0번째 비교
		
		int arr[] = {5, 3, 8, 1,};
		int tmp = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if(arr[j] < arr[j - 1]) {
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
