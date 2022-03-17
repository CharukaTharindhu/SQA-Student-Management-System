package student_management;

public class StudentRegistration {
	
	public static String studentName(String sName) {
		String result;
		if (sName.equals("Nimesh")) {
			return result ="valid Student Name";
		}else if (sName.equals("Chamika")) {
			return result ="valid Student Name";
		}
		else {
			return result ="invalid Student Name";
		}
	}
	
	public static String studentId(String sId) {
		String result;
		if (sId.equals("IT18211238")) {
			return result ="valid Student ID";
			
		}else if (sId.equals("IT211378")) {
			return result ="valid Student ID";
		}
		else {
			return result ="invalid Student ID";
		}
	}
	
	public static String studentContactnum(String phone) {
		String result;
		if (phone.equals("0772376772")) {
			return result ="valid Student Contact Number";
			
		}else if (phone.equals("0713841018")) {
			return result ="valid Student Contact Number";
		}
		else {
			return result ="invalid Student Contact Number";
		}
	}
	
	public static String studentALresults(String al) {
		String result;
		if (al.equals("A3")) {
			return result ="valid Student AL Results";
		}else if (al.equals("ABB")) {
			return result ="valid Student AL Results";
		}
		else {
			return result ="invalid Student AL Results";
		}
	}

	
	public static String NIC(String nic) {
		String result;
		if (nic.equals("980991873V")) {
			return result ="valid Nic";
		}
		else {
			return result ="invalid ";
		}
	}
	
}
