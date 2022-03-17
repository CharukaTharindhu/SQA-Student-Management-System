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
		System.out.println("give Payment ID :");
		pid = input.nextLine();
		
		String Actual = make_payment.paymentID(pid);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Payment ID ");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testPaymentStudentID() {
		MakePayment make_payment = new MakePayment();
		String sid;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Student ID :");
		sid = input.nextLine();
		
		String Actual = make_payment.paymentStudentID(sid);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Student ID ");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testPaymentCourseID() {
		MakePayment make_payment = new MakePayment();
		String cid;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Course ID :");
		cid = input.nextLine();
		
		String Actual = make_payment.paymentCourseID(cid);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Course ID ");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testPaymentAmount() {
		MakePayment make_payment = new MakePayment();
		String amount;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Payment Amount :");
		amount = input.nextLine();
		
		String Actual = make_payment.paymentAmount(amount);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Payment Amount ");
		
		assertEquals(expected, Actual);
	}

	@Test
	void testPaymentDate() {
		MakePayment make_payment = new MakePayment();
		String date;
	
		Scanner input = new Scanner(System.in);
		System.out.println("give Payment Date :");
		date = input.nextLine();
		
		String Actual = make_payment.paymentDate(date);
		System.out.println("actual  is "+ Actual);
		String expected = ("valid Payment Date ");
		
		assertEquals(expected, Actual);
	}

}
