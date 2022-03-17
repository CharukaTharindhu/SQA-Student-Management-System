package student_management;

public class MakePayment {
	
	public static String paymentID(String id) {
		String result;
		if (id.equals("Pay_0033")) {
			return result ="valid Payment ID";
			
		}else if (id.equals("Pay_0073")) {
			return result ="valid Payment ID";
		}
		else {
			return result ="invalid Payment ID";
		}
	}
	
	public static String paymentStudentID(String sid) {
		String result;
		if (sid.equals("SID_123")) {
			return result ="valid Student  ID";
			
		}else if (sid.equals("SID_823")) {
			return result ="valid Student ID";
		}
		else {
			return result ="invalid Student ID";
		}
	}
	
	public static String paymentCourseID(String cid) {
		String result;
		if (cid.equals("C_007")) {
			return result ="valid Course  ID";
			
		}else if (cid.equals("C_008")) {
			return result ="valid Course ID";
		}
		else {
			return result ="invalid Course ID";
		}
	}
	
	public static String paymentAmount(String amount) {
		String result;
		if (amount.equals("Rs. 100,000.00")) {
			return result ="valid Payment Amount ";
			
		}else if (amount.equals("Rs. 200,000.00")) {
			return result ="valid Payment Amount ";
		}
		else {
			return result ="invalid Payment Amount ";
		}
	}
	
	public static String paymentDate(String date) {
		String result;
		if (date.equals("2022/01/22")) {
			return result ="valid Payment Date ";
			
		}else if (date.equals("2022/02/22")) {
			return result ="valid Payment Date ";
		}
		else {
			return result ="invalid Payment Date ";
		}
	}

}
