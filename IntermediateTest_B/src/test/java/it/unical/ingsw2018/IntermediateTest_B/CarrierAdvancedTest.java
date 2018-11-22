package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrierAdvancedTest {
	
	private static Student student;

	@BeforeClass
	public static void initialize() {
		student = new Student("Elon Musk");
	}

	@After
	public void flush() {
		student.getCarrier().clear();
	}
	
	@Test
	public void getGetWeightedSumWorks() {
		Exam exam = new Exam("Matematica", 29, 12);
		Exam exam2 = new Exam("Fisica", 30, 9);
		Exam exam3 = new Exam("Inglese", 18, 6);

		student.registerExam(exam);
		student.registerExam(exam2);
		student.registerExam(exam3);

		assertEquals(26.889, student.getWeightedSum(), 0.05);
	}
	
	
}
