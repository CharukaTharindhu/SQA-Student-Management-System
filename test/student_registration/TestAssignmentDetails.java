package student_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student_management.CreateAssignment;
import student_management.CreateCourse;

class TestAssignmentDetails {

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
	void testAssignmentName() {
		CreateAssignment create_assignment=new CreateAssignment();
		String name;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Assignment Name :");
		name = input.nextLine();
		
		String Actual = create_assignment.AssignmentName(name);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Assignment Name");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testAssignmentID() {
		CreateAssignment create_assignment=new CreateAssignment();
		String id;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Assignment ID :");
		id = input.nextLine();
		
		String Actual = create_assignment.AssignmentID(id);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Assignment ID");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testAssignmentStartDate() {
		CreateAssignment create_assignment=new CreateAssignment();
		String date;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Assignment Start Date :");
		date = input.nextLine();
		
		String Actual = create_assignment.AssignmentStartDate(date);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Assignment Start Date");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testAssignmentEndDate() {
		CreateAssignment create_assignment=new CreateAssignment();
		String date;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Assignment End Date :");
		date = input.nextLine();
		
		String Actual = create_assignment.AssignmentEndDate(date);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Assignment End Date");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testAssignmentModuleName() {
		CreateAssignment create_assignment=new CreateAssignment();
		String Mname;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Assignment Module Name :");
		Mname = input.nextLine();
		
		String Actual = create_assignment.AssignmentModuleName(Mname);
		
		
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Assignment Module Name");
		
		assertEquals(expected, Actual);
	}
	
	@Test
	void testAssignmentModuleCode() {
		CreateAssignment create_assignment=new CreateAssignment();
		String mCode;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Assignment Module Code :");
		mCode = input.nextLine();
		
		String Actual = create_assignment.AssignmentModuleCode(mCode);
		
		
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Assignment Module Code");
		
		assertEquals(expected, Actual);
	}

}
