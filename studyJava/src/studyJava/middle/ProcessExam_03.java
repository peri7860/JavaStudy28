package studyJava.middle;

public class ProcessExam_03 {

	String result = "";
	
	public void ProcessBinary(int val) {
		
		while(val > 0) {
			result = (val % 2) + result;
			val /= 2;
		}
		
	}
}

