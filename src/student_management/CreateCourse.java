package student_management;

public class CreateCourse {
	
	//1 method
	public static String createCourse(String courseName) {
		String result;
		if (courseName.equals("IT")) {
			return result ="valid Course";
			
		}else if (courseName.equals("ISE")) {
			return result ="valid Course";
			
		}else if(courseName.equals("ET")) {
			return result = "valid course";
		}
		else {
			return result ="invalid Course";
		}
	} 
	//2 method
	public static String courseFee(String fee) {
		String result;
		if (fee.equals("Rs. 10,000.00")) {
			return result ="valid fee";
		}
		else {
			return result ="invalid fee";
		}
	}
	
	//3 method
	public static String courseDuration(String duration) {
		String result;
		if (duration.equals("4 Year")) {
			return result ="valid duration";
			
		}else if (duration.equals("2 months")) {
			return result ="valid duration";
		}
		else {
			return result ="invalid duration";
		}
	}
	
	//4 method
	public static String department(String dName) {
		String result;
		if (dName.equals("Computing")) {
			return result ="valid Department";
			
		}else if (dName.equals("Engineering")) {
			return result ="valid Department";
		}
		else {
			return result ="invalid department";
		}
	}
	//5 method
	public static String courseId(String c_id) {
		String result;
		if (c_id.equals("C_001")) {
			return result ="valid Id";
			
		}else if (c_id.equals("C_004")) {
			return result ="valid Id";
		}
		else {
			return result ="invalid Id";
		}
	}
}
