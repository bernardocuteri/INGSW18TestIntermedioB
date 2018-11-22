package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CarrierAdvancedTest {
	private static Student studente;

	@BeforeClass
	public static void init() {
		studente = new Student("Fabio");
	}
	
	@Test
	public void testMediaPesataDopoTreInserimenti() {
		studente.registerExam(new Exam("INGSW",27,8));
		studente.registerExam(new Exam("OGGETTI",21,12));
		studente.registerExam(new Exam("Fondamenti",28,4));
		assertEquals(24.16, studente.getWeightedSum(), 0.01);
	}
}
