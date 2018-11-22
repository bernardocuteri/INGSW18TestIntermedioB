package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierSimpleTest {

	/*
	 * un metodo che verifica che registerExam sollevi un’eccezione nel caso in cui
	 * un esame venga inserito due volte
	 */

	@Test(expected = RuntimeException.class)
	public void registraEsameTest() {
		Student s = new Student("Pierpaolo");

		s.registerExam(new Exam("PO", 29, 6));
		s.registerExam(new Exam("PO", 29, 6));
	}

	/*
	 * un metodo che verifichi il calcolo della somma dei crediti dopo aver inserito
	 * 3 esami in carriera
	 */
	@Test
	public void controlloCfu() {
		Student s = new Student("Pierpaolo");

		s.registerExam(new Exam("PO", 29, 6));
		s.registerExam(new Exam("ING", 29, 12));
		s.registerExam(new Exam("SIW", 29, 6));
		assertEquals(24, s.getCreditSum());
	}
	

}
