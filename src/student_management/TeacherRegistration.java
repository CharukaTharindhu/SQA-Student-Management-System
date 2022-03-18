package student_management;

public class TeacherRegistration {
	
	public static String teacherName(String tName) {
		String result;
		if (tName.equals("Kushnara")) {
			return result ="valid Teacher Name";
		}else if (tName.equals("Sooriyawansa")) {
			return result ="valid Teacher Name";
		}
		else {
			return result ="invalid Teacher Name";
		}
	}
	
	public static String teacherID(String id) {
		String result;
		if (id.equals("T001")) {
			return result ="valid Teacher ID";
		}else if (id.equals("T002")) {
			return result ="valid Teacher ID";
		}
		else {
			return result ="invalid Teacher ID";
		}
	}
	
	public static String teacherContactnum(String num) {
		String result;
		if (num.equals("0760915061")) {
			return result ="valid Teacher Contact Number";
		}else if (num.equals("0766364154")) {
			return result ="valid Teacher Contact Number";
		}
		else {
			return result ="invalid Teacher Contact Number";
		}
	}
	
	public static String teacherAdress(String address) {
		String result;
		if (address.equals("Colombo")) {
			return result ="valid Teacher Address";
		}else if (address.equals("Gampaha")) {
			return result ="valid Teacher Address";
		}
		else {
			return result ="invalid Teacher Address";
		}
	}
	
	public static String teacherGender(String gend) {
		String result;
		if (gend.equals("Femal")) {
			return result ="valid Teacher Gender";
		}else if (gend.equals("Male")) {
			return result ="valid Teacher Gender";
		}
		else {
			return result ="invalid Teacher Gender";
		}
	}
	
	

}
