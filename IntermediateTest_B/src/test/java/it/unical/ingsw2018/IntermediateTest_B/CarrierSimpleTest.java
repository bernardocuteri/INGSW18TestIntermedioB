package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrierSimpleTest {

	 private static Student student;

	 @BeforeClass
	 public static void initialize() {
	  student = new Student("Alan Turing");
	 }

	 @After
	 public void flush() {
	  student.getCarrier().clear();
	 }

	 @Test(expected = IllegalArgumentException.class)
	 public void getRegisterExamWorks() {
	  
	  Exam exam = new Exam("Matematica", 18, 12);
	  student.registerExam(exam);
	  
	  Exam exam2 = new Exam("Matematica", 18, 12);
	  student.registerExam(exam2);
	 }

	 @Test
	 public void getGetCreditSumWorks() {
	  Exam exam = new Exam("Matematica", 18, 12);
	  Exam exam2 = new Exam("Fisica", 23, 9);
	  Exam exam3 = new Exam("Programmazione ad Oggetti", 30, 6);

	  student.registerExam(exam);
	  student.registerExam(exam2);
	  student.registerExam(exam3);

	  assertEquals(27, student.getCreditSum());
	 }

	}
