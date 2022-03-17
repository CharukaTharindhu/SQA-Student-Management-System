package student_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student_management.StudentRegistration;

class StudentRegistrationTest {

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
	void testStudentName() {
		StudentRegistration student_registration=new StudentRegistration();
		String name;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Student Name :");
		name = input.nextLine();
		
		String Actual = student_registration.studentName(name);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student Name");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testStudentId() {
		StudentRegistration student_registration=new StudentRegistration();
		String id;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Student ID :");
		id = input.nextLine();
		
		String Actual = student_registration.studentId(id);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student ID");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testStudentContactnum() {
		StudentRegistration student_registration=new StudentRegistration();
		String num;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Student Contact Number :");
		num = input.nextLine();
		
		String Actual = student_registration.studentContactnum(num);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student Contact Number");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testStudentALresults() {
		StudentRegistration student_registration=new StudentRegistration();
		String al;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Student AL Results :");
		al = input.nextLine();
		
		String Actual = student_registration.studentALresults(al);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student AL Results");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testNIC() {
		StudentRegistration student_registration=new StudentRegistration();
		String nic;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Nic :");
		nic = input.nextLine();
		
		String Actual = student_registration.NIC(nic);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Nic");
		
		assertEquals(expected, Actual);
	}

}
