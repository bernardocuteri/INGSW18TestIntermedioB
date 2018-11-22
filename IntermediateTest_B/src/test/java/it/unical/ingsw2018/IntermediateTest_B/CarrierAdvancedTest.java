package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {

	/*
	 * un metodo che verifica che la funzione di calcolo della media pesata dopo
	 * l’inserimento di 3 esami in carriera
	 */
	@Test
	public void controlloMediaPesata() {
		Student s = new Student("Pierpaolo");

		s.registerExam(new Exam("PO", 29, 6));
		s.registerExam(new Exam("ING", 29, 12));
		s.registerExam(new Exam("SIW1", 27, 6));
		assertEquals(28.5, s.getWeightedSum(), 0.1);
	}

}
