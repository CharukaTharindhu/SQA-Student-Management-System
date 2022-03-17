package student_management;

public class StudentBusService {

	public static String busRoute(String rName) {
		String result;
		if (rName.equals("Malabe - Kollupitiya")) {
			return result ="valid Student Bus Route Name";
		}else if (rName.equals("Malabe - Ja-Ela")) {
			return result ="valid Student Bus Route Name";
		}
		else {
			return result ="invalid Student Bus Route Name";
		}
	}
	
	
	public static String busRouteNum(String rNum) {
		String result;
		if (rNum.equals("NL - 5267")) {
			return result ="valid Student Bus Route Number";
		}else if (rNum.equals("NP - 3445 ")) {
			return result ="valid Student Bus Route Number";
		}
		else {
			return result ="invalid Student Bus Route Number";
		}
	}
	
	public static String busRouteSeatCount(String sCount) {
		String result;
		if (sCount.equals("54 seats")) {
			return result ="valid Student Bus Route Seat Count";
		}else if (sCount.equals("40 seats")) {
			return result ="valid Student Bus Route Seat Count";
		}
		else {
			return result ="invalid Student Bus Route Seat Count";
		}
	}
	
	public static String busRouteTicketPrice(String price) {
		String result;
		if (price.equals("Rs. 20.00")) {
			return result ="valid Student Bus Route Ticket Price";
		}else if (price.equals("Rs. 40.00")) {
			return result ="valid Student Bus Route Ticket Price";
		}
		else {
			return result ="invalid Student Bus Route Ticket Price";
		}
	}
	
	public static String busStartTime(String time) {
		String result;
		if (time.equals(" 08.00 A.M")) {
			return result ="valid Student Bus Route Start Time";
		}else if (time.equals("05.00 P.M")) {
			return result ="valid Student Bus Route Start Time";
		}
		else {
			return result ="invalid Student Bus Route Start Time";
		}
	}
}
