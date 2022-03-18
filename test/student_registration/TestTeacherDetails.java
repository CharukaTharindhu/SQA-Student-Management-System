package student_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student_management.StudentRegistration;
import student_management.TeacherRegistration;

class TestTeacherDetails {

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
	void testTeacherName() {
		TeacherRegistration teacher_registration = new TeacherRegistration();
		String name;
	
		Scanner input = new Scanner(System.in);
		System.out.print("give Teacher Name :");
		name = input.nextLine();
		
		String Actual = teacher_registration.teacherName(name);
		System.out.println(Actual + "\n");
		String expected = ("valid Teacher Name");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testTeacherID() {
		TeacherRegistration teacher_registration = new TeacherRegistration();
		String id;
	
		Scanner input = new Scanner(System.in);
		System.out.print("give Teacher ID :");
		id = input.nextLine();
		
		String Actual = teacher_registration.teacherID(id);
		System.out.println(Actual + "\n");
		String expected = ("valid Teacher ID");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testTeacherContactnum() {
		TeacherRegistration teacher_registration = new TeacherRegistration();
		String num;
	
		Scanner input = new Scanner(System.in);
		System.out.print("give Teacher Contact Number :");
		num = input.nextLine();
		
		String Actual = teacher_registration.teacherContactnum(num);
		System.out.println(Actual + "\n");
		String expected = ("valid Teacher Contact Number");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testTeacherAdress() {
		TeacherRegistration teacher_registration = new TeacherRegistration();
		String address;
	
		Scanner input = new Scanner(System.in);
		System.out.print("give Teacher Address :");
		address = input.nextLine();
		
		String Actual = teacher_registration.teacherAdress(address);
		System.out.println(Actual + "\n");
		String expected = ("valid Teacher Address");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testTeacherGender() {
		TeacherRegistration teacher_registration = new TeacherRegistration();
		String gend;
	
		Scanner input = new Scanner(System.in);
		System.out.print("give Teacher Gender :");
		gend = input.nextLine();
		
		String Actual = teacher_registration.teacherGender(gend);
		System.out.println(Actual + "\n");
		String expected = ("valid Teacher Gender");
		
		assertEquals(expected, Actual);
	}

}
