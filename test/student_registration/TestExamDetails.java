package student_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student_management.CreateExam;
import student_management.StudentRegistration;

class TestExamDetails {

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
	void testExamCode() {
		CreateExam create_exam = new CreateExam();
		String code;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Exam Code :");
		code = input.nextLine();
		
		String Actual = create_exam.examCode(code);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Exam Code");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testExamName() {
		CreateExam create_exam = new CreateExam();
		String name;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Exam Name :");
		name = input.nextLine();
		
		String Actual = create_exam.examName(name);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Exam Name");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testExamDuration() {
		CreateExam create_exam = new CreateExam();
		String duration;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Exam Duration :");
		duration = input.nextLine();
		
		String Actual = create_exam.examDuration(duration);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Exam Duration");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testExamPassMark() {
		CreateExam create_exam = new CreateExam();
		String marks;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Exam Pass Mark :");
		marks = input.nextLine();
		
		String Actual = create_exam.examPassMark(marks);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Exam Pass Mark ");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testExamModuleName() {
		CreateExam create_exam = new CreateExam();
		String mName;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Exam Module Name :");
		mName = input.nextLine();
		
		String Actual = create_exam.examModuleName(mName);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Exam Module Name ");
		
		assertEquals(expected, Actual);
	}

}
