package student_management;

public class MakePayment {
	
	public static String paymentID(String id) {
		String result;
		if (id.equals("P001")) {
			return result ="Yes, it is valid Payment ID";
			
		}else if (id.equals("P002")) {
			return result ="Yes, it is valid Payment ID";
		}
		else {
			return result ="No, it is not valid Payment ID";
		}
	}
	
	public static String StudentID(String sid) {
		String result;
		if (sid.equals("IT18204926")) {
			return result ="Yes, it is valid Student ID";
			
		}else if (sid.equals("IT18212532")) {
			return result ="Yes, it is valid Student ID";
		}
		else {
			return result ="No, it is not valid Student ID";
		}
	}
	
	public static String CourseID(String cid) {
		String result;
		if (cid.equals("IT4100")) {
			return result ="Yes, it is valid Course ID";
			
		}else if (cid.equals("IT4010")) {
			return result ="Yes, it is valid Course ID";
		}
		else {
			return result ="No, it is not valid Course ID";
		}
	}
	
	public static String Amount(String amount) {
		String result;
		if (amount.equals("100000")) {
			return result ="Yes, it is valid Payment Amount ";
			
		}else if (amount.equals("200000")) {
			return result ="Yes, it is valid Payment Amount ";
		}
		else {
			return result ="No, it is not valid Payment Amount ";
		}
	}
	
	public static String paymentDate(String date) {
		String result;
		if (date.equals("2022/01/22")) {
			return result ="Yes, it is valid Payment Date ";
			
		}else if (date.equals("2022/02/22")) {
			return result ="Yes, it is valid Payment Date ";
		}
		else {
			return result ="No, it is not valid Payment Date ";
		}
	}
	
	public static String bankName(String bName) {
		String result;
		if (bName.equals("BOC")) {
			return result ="Yes, it is valid Bank Name ";
			
		}else if (bName.equals("HNB")) {
			return result ="Yes, it is valid Bank Name ";
		}
		else {
			return result ="No, it is not valid Bank Name ";
		}
	}

}
