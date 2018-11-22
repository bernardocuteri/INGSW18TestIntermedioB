package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierSimpleTest {
	
	@Test(expected=InvalidInsertionException.class)
	public void exceptionTest() {
		Student student = new Student("studente");
		student.registerExam(new Exam("mad", 28, 6));
		student.registerExam(new Exam("mad", 25, 9));		
	}
	
	@Test
	public void rightCfuSumTest() {
		Student student = new Student("studente");
		student.registerExam(new Exam("mad", 28, 6));
		student.registerExam(new Exam("sor", 25, 9));
		student.registerExam(new Exam("po", 27, 12));
		
		assertEquals(27, student.getCreditSum());
	}
	
}
