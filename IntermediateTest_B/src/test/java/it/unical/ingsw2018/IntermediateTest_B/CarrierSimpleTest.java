package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierSimpleTest {

	@Test (expected = IllegalArgumentException.class)
	public void registerExam() {
		Student student = new Student("Luca");
		Exam exam1 = new Exam("INGSW", 26, 10);
		Exam exam2 = new Exam("INGSW", 26, 10);
		student.registerExam(exam1);
		student.registerExam(exam2);
	}
	
	@Test
	public void sumCfu() {
		Student student = new Student("Antonio");
		Exam exam1 = new Exam("PO", 22, 10);
		Exam exam2 = new Exam("IG", 28, 5);
		Exam exam3 = new Exam("SIW", 27, 5);
		
		student.registerExam(exam1);
		student.registerExam(exam2);
		student.registerExam(exam3);
		
		assertEquals(20, student.getCreditSum());
		
	}
	
}
