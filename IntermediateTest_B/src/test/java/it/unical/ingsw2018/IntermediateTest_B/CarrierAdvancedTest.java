package it.unical.ingsw2018.IntermediateTest_B;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {
 
	@Test
	public void getWeightedSumTest() {
		Student student = new Student("Francesco");
		Exam computerScience = new Exam("Computer Science",24,10);
		Exam analysis = new Exam("Analysis",18,10);
		Exam ig = new Exam("IG",28,5);
		student.registerExam(computerScience);
		student.registerExam(analysis);
		student.registerExam(ig);
		assertEquals( 22.4, student.getWeightedSum(),0.5);
	}
}
