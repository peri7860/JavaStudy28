package studyJava.middle;

public class Java06_ObjectArray {

	// 멤버변수
	int bno;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	String grade;
	int rank = 1;

	// 기본 생성자
	// 기본 생성자 코딩을 안해도 컴파일러가 자동으로 생성해준다
	// 단, 매개변수가 있는 생성자를 만들면 기본 생성자는 만들지 않는다
	Java06_ObjectArray() {
	}

	Java06_ObjectArray(int bno, String name, int kor, int eng, int mat) {
		this.bno = bno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 메서드
	public void totAveCalc() {
		tot = kor + eng + mat;
		ave = tot / 3.;
	}

	public void gradeCalc() {
		if (ave >= 90) {
			grade = "A";
		} else if (ave >= 80) {
			grade = "B";
		} else if (ave >= 70) {
			grade = "C";
		} else if (ave >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
	}

	public void rankPro(Java06_ObjectArray[] javaArr) {
//		for(int i = 0; i < javaArr.length; i++) {
//			for (int j = 0; j < javaArr.length; j++) {
//				if (javaArr[i].ave < javaArr[j].ave) {
//					javaArr[i].rank += 1;
//				}
//			}
//		}
		
		for(Java06_ObjectArray a : javaArr) {
			for(Java06_ObjectArray b : javaArr) {
				if(a.ave < b.ave) {
					a.rank += 1;
				}
			}
		}
	}

	public void arrPrint() {
		System.out.print(bno + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\t");
		System.out.print(grade + "\t");
		System.out.print(rank);
		System.out.println();
	}

}
