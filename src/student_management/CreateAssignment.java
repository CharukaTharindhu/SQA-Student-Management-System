package student_management;

public class CreateAssignment {
	
	public static String AssignmentName(String name) {
		String result;
		if (name.equals("Research Paper")) {
			return result ="valid Assignment Name";
			
		}else if (name.equals("Test Cases")) {
			return result ="valid Assignment Name";
		}
		else {
			return result ="invalid Assignment Name";
		}
	}

	
	public static String AssignmentID(String id) {
		String result;
		if (id.equals("A_001")) {
			return result ="valid Assignment ID";
			
		}else if (id.equals("A_002")) {
			return result ="valid Assignment ID";
		}
		else {
			return result ="invalid Assignment ID";
		}
	}
	
	public static String AssignmentStartDate(String date) {
		String result;
		if (date.equals("2022/02/28")) {
			return result ="valid Assignment Start Date";
			
		}else if (date.equals("2022/01/28")) {
			return result ="valid Assignment Start Date";
		}
		else {
			return result ="invalid Assignment Start Date";
		}
	}
	
	public static String AssignmentEndDate(String date) {
		String result;
		if (date.equals("2022/03/28")) {
			return result ="valid Assignment End Date";
			
		}else if (date.equals("2022/03/16")) {
			return result ="valid Assignment End Date";
		}
		else {
			return result ="invalid Assignment End Date";
		}
	}
	
	public static String AssignmentModuleName(String mName) {
		String result;
		if (mName.equals("SQA")) {
			return result ="valid Assignment Module Name";
			
		}else if (mName.equals("ML")) {
			return result ="valid Assignment Module Name";
		}
		else {
			return result ="invalid Assignment Module Name";
		}
	}
}
