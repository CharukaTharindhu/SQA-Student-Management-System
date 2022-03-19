package student_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student_management.CreateCourse;
import student_management.StudentBusService;

class TestBusDetails {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBusRoute() {
		StudentBusService student_bus_service=new StudentBusService();
		String route;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give Bus Route Name:");
		route = input.nextLine();
		
		String Actual = student_bus_service.busRoute(route);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student Bus Route Name");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testBusRouteNum() {
		StudentBusService student_bus_service=new StudentBusService();
		String rNum;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give Bus Route Number:");
		rNum = input.nextLine();
		
		String Actual = student_bus_service.busRouteNum(rNum);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student Bus Route Number");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testBusRouteSeatCount() {
		StudentBusService student_bus_service=new StudentBusService();
		String sCount;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give Bus Seat Count:");
		sCount = input.nextLine();
		
		String Actual = student_bus_service.busRouteSeatCount(sCount);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student Bus Route Seat Count");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testBusRouteTicketPrice() {
		StudentBusService student_bus_service=new StudentBusService();
		String price;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give Bus Ticket Price:");
		price = input.nextLine();
		
		String Actual = student_bus_service.busRouteTicketPrice(price);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student Bus Route Ticket Price");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testBusStartTime() {
		StudentBusService student_bus_service=new StudentBusService();
		String time;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give Bus Start Time:");
		time = input.nextLine();
		
		String Actual = student_bus_service.busStartTime(time);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student Bus Route Start Time");
		
		assertEquals(expected, Actual);
	}

}
