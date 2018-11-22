package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {
	
	//un metodo che verifica che la funzione di calcolo della media
	//pesata dopo l’inserimento di 3 esami in carriera
	
	private Student s= new Student("Alessandro");
	
	@Test
	public void test3() {
		Exam e= new Exam("linguaggi",20,6); //120
		Exam e1= new Exam("discreta", 23, 9); // 207
		Exam e2= new Exam("ingegneria", 29, 12); //348
		//27 crediti
		
		s.registerExam(e);
		s.registerExam(e1);
		s.registerExam(e2);
		
		double calc=s.getWeightedSum();
		
		assertEquals(25,calc,0.1);
	}

}
