package studyJava.middle;

public class ProcessExam_03 {

	String head = "";
	String tail = "";
	
	public void ProcessBinary(int val) {
		while(true) {
			if(val == 0) break;
			tail = Integer.valueOf(val % 2).toString();
			val = val / 2;
			
		}
	}
}
