package student_management;

public class CreateAssignment {

	public static String AssignmentName(String name) {
		String result;
		if (name.equals("Unit Testing With JUnit")) {
			return result ="Yes, it is valid Assignment Name";
			
		}else if (name.equals("Test Cases")) {
			return result ="Yes, it is valid Assignment Name";
		}
		else {
			return result ="No, it is not valid Assignment Name";
		}
	}

	
	public static String AssignmentID(String id) {
		String result;
		if (id.equals("A001")) {
			return result ="Yes, it is valid Assignment ID";
			
		}else if (id.equals("A002")) {
			return result ="Yes, it is valid Assignment ID";
		}
		else {
			return result ="No, it is not valid Assignment ID";
		}
	}
	
	public static String AssignmentStartDate(String date) {
		String result;
		if (date.equals("2022/03/10")) {
			return result ="Yes, it is valid Assignment Start Date";
			
		}else if (date.equals("2022/01/28")) {
			return result ="Yes, it is valid Assignment Start Date";
		}
		else {
			return result ="No, it is not valid Assignment Start Date";
		}
	}
	
	public static String AssignmentEndDate(String date) {
		String result;
		if (date.equals("2022/03/17")) {
			return result ="Yes, it is valid Assignment End Date";
			
		}else if (date.equals("2022/03/16")) {
			return result ="Yes, it is valid Assignment End Date";
		}
		else {
			return result ="No, it is not valid Assignment End Date";
		}
	}
	
	public static String AssignmentModuleName(String mName) {
		String result;
		if (mName.equals("SQA")) {
			return result ="Yes, it is valid Assignment Module Name";
			
		}else if (mName.equals("ML")) {
			return result ="Yes, it is valid Assignment Module Name";
		}
		else {
			return result ="No, it is not valid Assignment Module Name";
		}
	}
	
	public static String AssignmentModuleCode(String mCode) {
		String result;
		if (mCode.equals("IT4100")) {
			return result ="Yes, it is valid Assignment Module Code";
			
		}else if (mCode.equals("IT4010")) {
			return result ="Yes, it is valid Assignment Module Code";
		}
		else {
			return result ="No, it is not valid Assignment Module Code";
		}
	}
	
}
