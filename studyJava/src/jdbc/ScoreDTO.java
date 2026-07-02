package jdbc;

public class ScoreDTO {

	// 오라클 테이블을 참조하여 멤버변수를 만든다

	private int idx; // 학번
	private String name; // 이름
	private int kor; // 국어
	private int eng; // 영어
	private int mat; // 수학

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}
