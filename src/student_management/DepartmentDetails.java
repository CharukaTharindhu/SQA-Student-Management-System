package student_management;

public class DepartmentDetails {

	public static String departmentName(String name) {
		String result;
		if (name.equals("Software Engineering Department")) {
			return result ="valid Depatment Name";
			
		}else if (name.equals("IT Department")) {
			return result ="valid Depatment Name";
		}
		else {
			return result ="invalid Depatment Name";
		}
	}
	
	public static String departmentId(String id) {
		String result;
		if (id.equals("D_009")) {
			return result ="valid Depatment ID";
			
		}else if (id.equals("D_010")) {
			return result ="valid Depatment ID";
		}
		else {
			return result ="invalid Depatment ID";
		}
	}
	
	
	public static String departmentHead(String hName) {
		String result;
		if (hName.equals("Nadun Kodagoda")) {
			return result ="valid Depatment Head Name";
			
		}else if (hName.equals("Samantha Rajapaksha")) {
			return result ="valid Depatment Head Name";
		}
		else {
			return result ="invalid Depatment Head Name";
		}
	}
	
	public static String departmentStudentCount(String count) {
		String result;
		if (count.equals("100 Students")) {
			return result ="valid Depatment Student Count";
			
		}else if (count.equals("200 Students")) {
			return result ="valid Depatment Student Count";
		}
		else {
			return result ="invalid Depatment Student Count";
		}
	}
	
	public static String departmentTeacherCount(String count) {
		String result;
		if (count.equals("20 Teachers")) {
			return result ="valid Depatment Teachers Count";
			
		}else if (count.equals("25 Teachers")) {
			return result ="valid Depatment Teachers Count";
		}
		else {
			return result ="invalid Depatment Teachers Count";
		}
	}
}
