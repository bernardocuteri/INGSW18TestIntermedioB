package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {

	/**
	 * un metodo che verifica che la funzione di calcolo della media 
	 * pesata dopo l’inserimento di 3 esami in carriera
	 */
	@Test
	public void testWeightedSum() {
		Student tizio = new Student("Tizio");
		tizio.registerExam(new Exam("Ingegneria del software", 25, 12));
		tizio.registerExam(new Exam("Programmazione ad oggetti", 27, 6));
		tizio.registerExam(new Exam("Basi di dati", 25, 9));
		
		// ci aspettiamo (25*12 + 27*6 + 25*9) / 12+6+9  = 687/27 = 25
		// visto cche c'è la divisione reale mettiamo un delta
		assertEquals(25.444444444444443, tizio.getWeightedSum(), 0.0001);
	}
	
}
