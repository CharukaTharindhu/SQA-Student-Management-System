package student_management;

public class CreateExam {
	
	public static String examCode(String code) {
		String result;
		if (code.equals("E001")) {
			return result ="valid Exam Code";
		}else if (code.equals("Ex_006")) {
			return result ="valid Exam Code";
		}
		else {
			return result ="invalid Exam Code";
		}
	}
	
	public static String examName(String name) {
		String result;
		if (name.equals("Mid Exam")) {
			return result ="valid Exam Name";
		}else if (name.equals("Final Exam")) {
			return result ="valid Exam Name";
		}
		else {
			return result ="invalid Exam Name";
		}
	}
	
	public static String examDuration(String duration) {
		String result;
		if (duration.equals("1 hour")) {
			return result ="valid Exam Duration";
		}else if (duration.equals("2 hours")) {
			return result ="valid Exam Duration";
		}
		else {
			return result ="invalid Exam Duration";
		}
	}
	
	public static String examPassMark(String marks) {
		String result;
		if (marks.equals("45")) {
			return result ="valid Pass Mark";
		}
		else {
			return result ="invalid Pass mark";
		}
	}
	
	public static String examModuleName(String mName) {
		String result;
		if (mName.equals("SQA")) {
			return result ="valid Exam Module Name";
		}else if (mName.equals("IUP")) {
			return result ="valid Exam Module Name";
		}
		else {
			return result ="invalid Exam Module Name";
		}
	}
	

}
