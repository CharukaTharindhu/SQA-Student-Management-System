package student_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student_management.CreateExam;
import student_management.MakePayment;

class TestPaymentDetails {

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
	void testPaymentID() {
		MakePayment make_payment = new MakePayment();
		String pid;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Payment ID :");
		pid = input.nextLine();
		
		String Actual = make_payment.paymentID(pid);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Payment ID");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testPaymentStudentID() {
		MakePayment make_payment = new MakePayment();
		String sid;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Student ID :");
		sid = input.nextLine();
		
		String Actual = make_payment.StudentID(sid);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Student ID");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testPaymentCourseID() {
		MakePayment make_payment = new MakePayment();
		String cid;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Course ID :");
		cid = input.nextLine();
		
		String Actual = make_payment.CourseID(cid);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Course ID");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testPaymentAmount() {
		MakePayment make_payment = new MakePayment();
		String amount;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Payment Amount (Rs.) :");
		amount = input.nextLine();
		
		String Actual = make_payment.Amount(amount);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Payment Amount ");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testPaymentDate() {
		MakePayment make_payment = new MakePayment();
		String date;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Payment Date :");
		date = input.nextLine();
		
		String Actual = make_payment.paymentDate(date);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Payment Date ");
		
		assertEquals(expected, Actual);
	}
	
	@Test
	void testBankName() {
		MakePayment make_payment = new MakePayment();
		String bName;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Bank Name :");
		bName = input.nextLine();
		
		String Actual = make_payment.bankName(bName);
		System.out.println(Actual + "\n");
		String expected = ("Yes, it is valid Bank Name ");
		
		assertEquals(expected, Actual);
	}

}
