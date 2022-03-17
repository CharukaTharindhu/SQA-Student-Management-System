package student_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student_management.CreateCourse;

class TestCourseDetails {

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
	void testCreateCourse() {
		//create object the class
		CreateCourse create_course=new CreateCourse();
		String courseName;
		
		//input give
		Scanner input = new Scanner(System.in);
		System.out.println("give course name :");
		courseName = input.nextLine();
		
		//input data pass to the actual method 
		String Actual = create_course.createCourse(courseName);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Course");
		
		//junit parse
		assertEquals(expected, Actual);
	}

	@Test
	void testCourseFee() {
		
		CreateCourse create_course=new CreateCourse();
		String fee;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give course fee :");
		fee = input.nextLine();
		
		String Actual = create_course.courseFee(fee);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid fee");
		
		assertEquals(expected, Actual);
	}
	
	@Test
	void testCourseDuration() {
		CreateCourse create_course=new CreateCourse();
		String duration;
		
		Scanner input = new Scanner(System.in);
		System.out.println("give course duration :");
		duration = input.nextLine();
		
		String Actual = create_course.courseDuration(duration);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid duration");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testdepartment() {
		CreateCourse create_course=new CreateCourse();
		String department;
		
		Scanner input = new Scanner(System.in);
		System.out.println("give course department :");
		department = input.nextLine();
		
		String Actual = create_course.department(department);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Department");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testCourseId() {
		CreateCourse create_course=new CreateCourse();
		String id;
		
		Scanner input = new Scanner(System.in);
		System.out.println("give course id :");
		id = input.nextLine();
		
		String Actual = create_course.courseId(id);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Id");
		
		assertEquals(expected, Actual);
	}

}
