package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierSimpleTest {
	
	/**
	 * Metodo che verifica che registerExam sollevi 
	 * un’eccezione nel caso in cui un esame 
	 * venga inserito due volte
	 */
	@Test(expected = RuntimeException.class)
	public void testMultipleExamInsert() {
		Student tizio = new Student("Tizio");
		tizio.registerExam(new Exam("Ingegneria del software", 25, 6));
		tizio.registerExam(new Exam("Ingegneria del software", 25, 6));
	}
	
	/**
	 * Metodo che verifica il calcolo della somma 
	 * dei crediti dopo aver inserito 3 esami in carriera
	 */
	@Test
	public void testCreditSum() {
		Student tizio = new Student("Tizio");
		tizio.registerExam(new Exam("Ingegneria del software", 25, 12));
		tizio.registerExam(new Exam("Programmazione ad oggetti", 27, 6));
		tizio.registerExam(new Exam("Basi di dati", 25, 9));
		
		// ci aspettiamo 12+6+9=27 crediti
		assertEquals(27, tizio.getCreditSum());
	}
	
}
