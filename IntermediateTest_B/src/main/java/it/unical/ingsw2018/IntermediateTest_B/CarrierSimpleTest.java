package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierSimpleTest {
		
	@Test(expected = RuntimeException.class)	
	public void registerExamTest() {
		Student s = new Student("Vincenzo");
		Exam e = new Exam("Informatica",30,12);
		s.registerExam(e);
		s.registerExam(e);
	}
	
	@Test
	public void getSumTest() {
		Student s = new Student("Vincenzo");
		Exam e = new Exam("Informatica",30,12);
		Exam e1 = new Exam("Analisi",30,12);
		Exam e2 = new Exam("IGPE",29,9);
		s.registerExam(e);
		s.registerExam(e1);
		s.registerExam(e2);
		
		assertEquals(33,s.getCreditSum());
	}
}
