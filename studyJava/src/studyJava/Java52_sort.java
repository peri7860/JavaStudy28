package studyJava;

import java.util.Arrays;

public class Java52_sort {

	public static void main(String[] args) {
		
		// 버블정렬
		// 왼쪽과 오른쪽 값을 비교하여 위치를 바꾸어 나가는 방식
		
		int[] a = {5, 1, 3, 8, 2, 7, 6};
		int tmp = 0; // 교환하는 값을 임시 저장하는 변수
		// a.length = 7 배열의 길이
//		for (int i = 0; i < a.length; i++) { // i = 0, 1, 2, 3, 4, 5, 6
//			for (int j = 0; j < a.length - i - 1; j++) { // 6, 5, 4, 3, 2, 1
//				if (a[j] > a[j + 1]) {
//					tmp = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = tmp;
//				}
//			}
//		}
		
		for(int i=a.length-1; i>0; i--){
		    for(int j=0; j<i; j++){
		      if(a[j]>a[j+1]){
		        tmp = a[j];
		        a[j] = a[j+1];
		        a[j+1] = tmp;
		      }
		    }
		  }
		
		System.out.println(Arrays.toString(a));
	}

}
