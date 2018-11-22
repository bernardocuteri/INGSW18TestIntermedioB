package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarrierSimpleTest {
	
	@Test
	public void sumTest() {
		Student s = new Student("JJ");
		Exam e1 = new Exam("paralleli", 30, 6);
		Exam e2 = new Exam("igpe", 26, 9);
		Exam e3 = new Exam("oggetti", 23, 6);
		
		s.registerExam(e1);
		s.registerExam(e2);
		s.registerExam(e3);
		
		
		assertEquals(21, s.getCreditSum());
	}

}
