package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {
	
	@Test
	public void getWeightedTest() {
		Student s = new Student("Vincenzo");
		Exam e = new Exam("Informatica",30,12);
		Exam e1 = new Exam("Analisi",30,12);
		Exam e2 = new Exam("IGPE",29,9);
		s.registerExam(e);
		s.registerExam(e1);
		s.registerExam(e2);
		assertEquals(29.7,s.getWeightedSum(),0.3);
		
	}
}
