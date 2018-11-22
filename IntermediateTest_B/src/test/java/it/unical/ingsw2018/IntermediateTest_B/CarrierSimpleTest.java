package it.unical.ingsw2018.IntermediateTest_B;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarrierSimpleTest {

	@Test (expected = RuntimeException.class)
	public void test1() {
		Student s = new Student("Antonio");
		Exam ex1 = new Exam("INGSW", 31, 12);
		Exam ex2 = new Exam("INGSW", 30, 12);
		s.registerExam(ex1);
		s.registerExam(ex2);
	}
	
	@Test
	public void test2() {
		Student s = new Student("Antonio");
		Exam ex1 = new Exam("INGSW", 31, 12);
		Exam ex2 = new Exam("SO", 30, 6);
		Exam ex3 = new Exam("SIW", 25, 6);
		s.registerExam(ex1);
		s.registerExam(ex2);
		s.registerExam(ex3);
		int sum = s.getCreditSum();
		assertEquals("Somma crediti non corretta!", 24, sum);
	}
	
}
