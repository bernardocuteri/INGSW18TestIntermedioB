package it.unical.ingsw2018.IntermediateTest_B;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarrierAdvancedTest {
 
	@Test
	public void test1() {
		Student s = new Student("Antonio");
		Exam ex1 = new Exam("INGSW", 21, 12);  //252
		Exam ex2 = new Exam("SO", 30, 6);  //180
		Exam ex3 = new Exam("SIW", 21, 6); //126
		s.registerExam(ex1);
		s.registerExam(ex2);
		s.registerExam(ex3);
		double sum = s.getWeightedSum();
		assertEquals(23.25, sum, 0.00);
	}
	
}
