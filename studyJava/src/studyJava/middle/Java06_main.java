package studyJava.middle;

public class Java06_main {

	public static void main(String[] args) {
		
		// 객체 생성 후 변수에 값을 직접 대입하는 방법
		Java06_ObjectArray j6 = new Java06_ObjectArray();
		j6.bno = 1;
		j6.name = "홍길동";
		j6.kor = 100;
		j6.eng = 100;
		j6.mat = 100;
		
		
		// 객체를 저장하는 배열을 만들어 보자
		Java06_ObjectArray[] arr = new Java06_ObjectArray[5];
		
		// 생성자를 이용하여 멤버변수에 값을 저장하는 방법
		Java06_ObjectArray j1 = new Java06_ObjectArray(1, "홍길동", 100, 100, 100);
//		j1.totAveCalc();
//		j1.gradeCalc();
//		j1.arrPrint();
		arr[0] = j1;
		
		
		Java06_ObjectArray j2 = new Java06_ObjectArray(2, "김길동", 90, 90, 90);
//		j2.totAveCalc();
//		j2.gradeCalc();
//		j2.arrPrint();
		arr[1] = j2;
		
		Java06_ObjectArray j3 = new Java06_ObjectArray(3, "이길동", 80, 80, 80);
//		j3.totAveCalc();
//		j3.gradeCalc();
//		j3.arrPrint();
		arr[2] = j3;
		
		Java06_ObjectArray j4 = new Java06_ObjectArray(4, "최길동", 70, 70, 70);
//		j4.totAveCalc();
//		j4.gradeCalc();
//		j4.arrPrint();
		arr[3] = j4;
		
		Java06_ObjectArray j5 = new Java06_ObjectArray(5, "오길동", 60, 60, 60);
//		j5.totAveCalc();
//		j5.gradeCalc();
//		j5.arrPrint();
		arr[4] = j5;
		
		// 반복되는 계산과 출력을 반복문으로 바꿔보자
		
		for (int i = 0; i < arr.length; i++) { // 1 = 0, 1, 2, 3, 4 
			arr[i].totAveCalc();
			arr[i].gradeCalc();
		}
		
		// totAveCalc(), gradeCalc(), arrPrint() 메서드가
		// 객체를 생성 할 때 마다 반복해서 만들어진다. 이것을 해결하는 것을
		// Bank 설계도를 만들어서 처리해 보도록 한다
		arr[0].rankPro(arr);
		
		for (int i = 0; i < arr.length; i++) { // 1 = 0, 1, 2, 3, 4 
			arr[i].arrPrint();
		}
		
		// 향상된 for문으로 객체를 처리해보자
//		for (Java06_ObjectArray a : arr) {
//			a.totAveCalc();
//			a.gradeCalc();
//			a.arrPrint();
//		}
		
		
	}
	

}
