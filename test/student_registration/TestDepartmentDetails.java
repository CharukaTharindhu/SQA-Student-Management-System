package student_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student_management.DepartmentDetails;
import student_management.StudentRegistration;

class TestDepartmentDetails {

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
	void testDepartmentName() {
		DepartmentDetails department_details=new DepartmentDetails();
		String name;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Department Name :");
		name = input.nextLine();
		
		String Actual = department_details.departmentName(name);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Department Name");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testDepartmentId() {
		DepartmentDetails department_details=new DepartmentDetails();
		String id;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Department ID :");
		id = input.nextLine();
		
		String Actual = department_details.departmentId(id);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Department ID");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testDepartmentHead() {
		DepartmentDetails department_details=new DepartmentDetails();
		String hName;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Department Head Name :");
		hName = input.nextLine();
		
		String Actual = department_details.departmentHead(hName);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Department ID");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testDepartmentStudentCount() {
		DepartmentDetails department_details = new DepartmentDetails();
		String scount;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Department Student Count :");
		scount = input.nextLine();
		
		String Actual = department_details.departmentStudentCount(scount);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Department Student Count");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testDepartmentTeacherCount() {
		DepartmentDetails department_details = new DepartmentDetails();
		String tcount;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Department Teachers Count :");
		tcount = input.nextLine();
		
		String Actual = department_details.departmentTeacherCount(tcount);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Department Teachers Count");
		
		assertEquals(expected, Actual);
	}

}
