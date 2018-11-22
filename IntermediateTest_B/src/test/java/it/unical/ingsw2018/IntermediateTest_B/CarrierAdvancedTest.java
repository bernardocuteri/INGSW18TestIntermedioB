package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {
	@Test
	public void rightWeightedSumTest() {
		Student student = new Student("studente");
		student.registerExam(new Exam("mad", 28, 6));
		student.registerExam(new Exam("sor", 25, 9));
		student.registerExam(new Exam("po", 27, 12));
		
		assertEquals(26.555555556, student.getWeightedSum(), 0.001);
	}
}
